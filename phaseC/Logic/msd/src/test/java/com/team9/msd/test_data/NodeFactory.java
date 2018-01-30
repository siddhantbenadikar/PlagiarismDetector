package com.team9.msd.test_data;

/**
 * This interface is for creating node
 */
public interface NodeFactory {

    // make expression node
    Expression makeExpression();

    // make statement node
    Statement makeStatement();

}
