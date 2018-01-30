package com.team9.msd.Visitor;

import org.eclipse.jdt.core.dom.ASTNode;
import java.util.List;

/**
 * Service to help out with the ASTVisitor
 */
public class ASTVisitorService {

    /**
     * Visits the AST starting at ASTNode n and returns the
     * list of nodes in the AST
     * @param n, the root node that needs to be visited first
     * @return List<ASTNode>, list of nodes in the AST
     */
    public static List<ASTNode> getListOfNodes(ASTNode n) {
        Visitor v = new Visitor();
        n.accept(v);
        return v.getAstNodes();
    }

    /**
     * Visits the AST starting at ASTNode n and returns the
     * list of HashValues of the nodes in the AST
     * @param n, the root node that needs to be visited first
     * @return List<Integer>, list of Hashvalues of the nodes in
     *          the AST
     */
    public static List<Integer> getAstNodesHashValue(ASTNode n) {
        Visitor v = new Visitor();
        n.accept(v);
        return v.getAstNodesHashValue();
    }

    /**
     * Returns the list of children of the given ASTNode n
     * list of children nodes of each ASTNode in the AST
     * @param n, the root node that needs to be visited first
     * @return List<ASTNode>, list of children of the ASTNode n
     */
    public static List<ASTNode> getChildren(ASTNode n) {
        List<ASTNode> listOfChildren = getListOfNodes(n);
        for (int i = 0; i < listOfChildren.size(); i++) {
            if (listOfChildren.get(i) != n) {
                listOfChildren.remove(i);
                i--;
            }
        }
        return listOfChildren;
    }

}