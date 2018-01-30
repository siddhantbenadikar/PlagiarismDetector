package com.team9.msd.Detector;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import java.util.*;

/**
 * This class is used for implementing IASTService
 */
public class ASTService implements IASTService {

    private CompilationUnit cu;
    private Node root;
    private List<ASTNodes> nodeList = new ArrayList<>();
    private List<Integer> hashCodeList = new ArrayList<>();

    ASTService(CompilationUnit cu) {
        this.cu = cu;
        root = cu.findRootNode();
        IPreprocessor p = new Preprocessor();
        p.removeComments(this.cu);
        p.renameMethods(this.cu);
        generateNodeList(root);
        generateHashCodeList();
    }


    /**
     * Generates a List of all nodes of the AST
     * @param n, the root node that needs to be traversed
     *           and generate the nodeList
     */
    @Override
    public void generateNodeList(Node n) {
        for(Node child : n.getChildNodes()) {
            ASTNodes newNode = new ASTNodes(child);
            nodeList.add(newNode);
            generateNodeList(child);
        }
    }

    /**
     * Generates a List of all hashCode of each node in the AST
     */
    @Override
    public void generateHashCodeList() {
        for(ASTNodes n : nodeList) {
            Node m = n.getNode();
            hashCodeList.add(m.hashCode());
        }
    }

    /**
     * Returns the size of the hashCodeList
     * @return <Integer>, returns the size of the hashCodeList
     */
    public int hashCodeListSize() {
        return hashCodeList.size();
    }

    /**
     * @param i, the position of the node of which you want
     *           get the hashvalue
     * @return the hashValue at position i
     */
    public int getHashValueAt(int i) {
        return hashCodeList.get(i);
    }

    /**
     * Returns the current root node of the AST
     * @return Node, returns the root node of the AST
     */
    public Node getRoot() {
        return root;
    }

    /**
     * Getter for nodeList
     * @return List<ASTNodes>, returns the NodeList
     */
    public List<ASTNodes> getNodeList() {
        return nodeList;
    }

    /**
     * Getter for HashCodeList
     * @return List<Integer>, returns the HashCodeList
     */
    public List<Integer> getHashCodeList() {
        return hashCodeList;
    }

}
