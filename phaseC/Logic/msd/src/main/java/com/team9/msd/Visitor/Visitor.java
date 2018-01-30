package com.team9.msd.Visitor;

import org.eclipse.jdt.core.dom.*;
import java.util.ArrayList;
import java.util.List;

/** Visitor class which provides methods to visit ASTNodes **/
public class Visitor extends ASTVisitor {

    private List<ASTNode> astNodes;

    private List<Integer> astNodesHashValue;

    public Visitor() {
        super();
        astNodes = new ArrayList<>();
        astNodesHashValue = new ArrayList<>();
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.1
     */
    @Override
    public boolean visit(AnnotationTypeDeclaration node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.1
     */
    @Override
    public boolean visit(AnnotationTypeMemberDeclaration node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(AnonymousClassDeclaration node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(ArrayAccess node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(ArrayCreation node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(ArrayInitializer node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(ArrayType node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(AssertStatement node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(Assignment node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(Block node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     * <p>Note: {@link LineComment} and {@link BlockComment} nodes are
     * not considered part of main structure of the AST. This method will
     * only be called if a client goes out of their way to visit this
     * kind of node explicitly.
     * </p>
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.0
     */
    @Override
    public boolean visit(BlockComment node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(BooleanLiteral node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(BreakStatement node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(CastExpression node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(CatchClause node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(CharacterLiteral node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(ClassInstanceCreation node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(CompilationUnit node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(ConditionalExpression node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(ConstructorInvocation node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(ContinueStatement node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     * <p>
     * The default implementation does nothing and return true.
     * Subclasses may re-implement.
     * </p>
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.10
     */
    @Override
    public boolean visit(CreationReference node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.10
     */
    @Override
    public boolean visit(Dimension node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(DoStatement node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(EmptyStatement node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.1
     */
    @Override
    public boolean visit(EnhancedForStatement node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.1
     */
    @Override
    public boolean visit(EnumConstantDeclaration node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.1
     */
    @Override
    public boolean visit(EnumDeclaration node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     * <p>
     * The default implementation does nothing and return true.
     * Subclasses may re-implement.
     * </p>
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.10
     */
    @Override
    public boolean visit(ExpressionMethodReference node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(ExpressionStatement node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(FieldAccess node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(FieldDeclaration node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(ForStatement node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(IfStatement node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(ImportDeclaration node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(InfixExpression node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(Initializer node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(InstanceofExpression node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.10
     */
    @Override
    public boolean visit(IntersectionType node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the given AST node.
     * <p>
     * Unlike other node types, the boolean returned by the default
     * implementation is controlled by a constructor-supplied
     * parameter
     * which is <code>false</code> by default.
     * Subclasses may reimplement.
     * </p>
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(Javadoc node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(LabeledStatement node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.10
     */
    @Override
    public boolean visit(LambdaExpression node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     * <p>Note: {@link LineComment} and {@link BlockComment} nodes are
     * not considered part of main structure of the AST. This method will
     * only be called if a client goes out of their way to visit this
     * kind of node explicitly.
     * </p>
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.0
     */
    @Override
    public boolean visit(LineComment node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.1
     */
    @Override
    public boolean visit(MarkerAnnotation node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.0
     */
    @Override
    public boolean visit(MemberRef node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.1
     */
    @Override
    public boolean visit(MemberValuePair node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.0
     */
    @Override
    public boolean visit(MethodRef node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.0
     */
    @Override
    public boolean visit(MethodRefParameter node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(MethodDeclaration node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(MethodInvocation node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.1
     */
    @Override
    public boolean visit(Modifier node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.10
     */
    @Override
    public boolean visit(NameQualifiedType node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.1
     */
    @Override
    public boolean visit(NormalAnnotation node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(NullLiteral node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(NumberLiteral node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(PackageDeclaration node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.1
     */
    @Override
    public boolean visit(ParameterizedType node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(ParenthesizedExpression node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(PostfixExpression node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(PrefixExpression node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(PrimitiveType node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(QualifiedName node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.1
     */
    @Override
    public boolean visit(QualifiedType node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(ReturnStatement node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(SimpleName node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(SimpleType node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.1
     */
    @Override
    public boolean visit(SingleMemberAnnotation node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(SingleVariableDeclaration node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(StringLiteral node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(SuperConstructorInvocation node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(SuperFieldAccess node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(SuperMethodInvocation node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.10
     */
    @Override
    public boolean visit(SuperMethodReference node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(SwitchCase node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(SwitchStatement node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(SynchronizedStatement node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.0
     */
    @Override
    public boolean visit(TagElement node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.0
     */
    @Override
    public boolean visit(TextElement node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(ThisExpression node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(ThrowStatement node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(TryStatement node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(TypeDeclaration node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(TypeDeclarationStatement node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(TypeLiteral node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.10
     */
    @Override
    public boolean visit(TypeMethodReference node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.1
     */
    @Override
    public boolean visit(TypeParameter node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     * @since 3.7.1
     */
    @Override
    public boolean visit(UnionType node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(VariableDeclarationExpression node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(VariableDeclarationStatement node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(VariableDeclarationFragment node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(WhileStatement node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Visits the AST node type provided in the argument
     *
     *
     * @param node the node to visit
     * @return <code>true</code> if the children of this node should be
     * visited, and <code>false</code> if the children of this node should
     * be skipped
     */
    @Override
    public boolean visit(WildcardType node) {
        astNodes.add(node);
        astNodesHashValue.add(node.hashCode());
        return true;
    }

    /**
     * Getter for the astNodesHashValue
     * @return List<Integer> which is the hashValues of each node
     */
    public List<Integer> getAstNodesHashValue() {
        return astNodesHashValue;
    }

    /**
     * Getter for the astNodes
     * @return List<ASTNode> which is list of nodes
     */
    public List<ASTNode> getAstNodes() {
        return astNodes;
    }
}

