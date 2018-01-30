package com.team9.msd.Detector;


import com.github.javaparser.ast.Node;

/**
 * Interface of ASTService
 */
public interface IASTService {

    /**
     * Generates a List of all nodes of the AST
     * @param n, the root node that needs to be traversed
     *           and generate the nodeList
     */
    void generateNodeList(Node n);

    /**
     * Generates a List of all hashCode of each node in the AST
     */
    void generateHashCodeList();
}