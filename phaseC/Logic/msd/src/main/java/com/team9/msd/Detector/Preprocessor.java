package com.team9.msd.Detector;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.BodyDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.comments.LineComment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Class that implements interface IPreProcessor
 */
public class Preprocessor implements IPreprocessor{
    private Map<String, String> methodMap = new HashMap<>();
    private int methodCount = 0;

    Preprocessor() {
    }

    /**
     * Rename the method names in the given CompilationUnit
     * @param cu the compilationUnit of the Ast that needs renaming of methods
     */
    @Override
    public void renameMethods(CompilationUnit cu) {
        // Go through all the types in the file
        NodeList<TypeDeclaration<?>> types = cu.getTypes();
        for (TypeDeclaration<?> type : types) {
            // Go through all fields, methods, etc. in this type
            NodeList<BodyDeclaration<?>> members = type.getMembers();
            for (BodyDeclaration<?> member : members) {
                if (member instanceof MethodDeclaration) {
                    MethodDeclaration method = (MethodDeclaration) member;
                    renameMethod(method);
                }
            }
        }
    }

    /**
     * Helper function of the renameMethods which gives a standard
     * name to each of the methods found in the AST
     * @param n the node of type MethodDeclaration that has its
     *          name standardized
     */
    private void renameMethod(MethodDeclaration n) {
        if(methodMap.containsKey(n.getNameAsString()))
            n.setName(methodMap.get(n.getNameAsString()));
        else {
            String newName = "method" + ++methodCount + "";
            methodMap.put(n.getNameAsString(), newName);
            n.setName(newName);
        }
    }

    /**
     * Removes all the comments from the given CompilationUnit
     */
    @Override
    public void removeComments(CompilationUnit cu){
        List<Comment> comments = cu.getAllContainedComments();
        List<Comment> removeComments = comments
                .stream()
                .filter(p -> !p.getCommentedNode().isPresent() || p instanceof LineComment || p instanceof JavadocComment)
                .collect(Collectors.toList());
        removeComments.forEach(Node::remove);
    }
}