package com.team9.msd.Detector;

import com.github.javaparser.ast.Node;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is used for making a wrapper class for Javaparser Node
 * and it stores all the information that will be required by us through
 * out the project
 */
public class ASTNodes {

    private Node node;
    private Integer hashValue;
    private List<Node> childNodes;

    ASTNodes(Node node){
        this.node = node;
        this.childNodes = this.node.getChildNodes();
        this.hashValue = this.node.hashCode();
    }


    /**
     * Getter for node
     * @return Node, returns the Javaparser Node that is assigned
     * to this wrapper class
     */
    public Node getNode() {
        return node;
    }


    /**
     * Getter for HashValue for the node
     * @return Integer, returns the hashValue of the the Javaparser
     * node that is assigned to this wrapper class
     */
    public Integer getHashValue() {
        return hashValue;
    }

    /**
     * Getter for child nodes of the node
     * @return List<ASTNodes>, returns the list of children of the
     * Javaparser node that is assigned to this wrapper class
     */
    public List<ASTNodes> getChildNodes() {
        List<ASTNodes> childrenNodes = new ArrayList<>();
        for(Node n: childNodes) {
            ASTNodes v = new ASTNodes(n);
            childrenNodes.add(v);
        }
        return childrenNodes;
    }


    @Override
    public String toString() {
        return  node.toString();
    }

}
