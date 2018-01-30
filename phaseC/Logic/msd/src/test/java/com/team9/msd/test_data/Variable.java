package com.team9.msd.test_data;

/**
 * This class is for representing ast.Variable
 */
public class Variable {

    // the name of the variable
    private String name;

    /**
     * Constructor of ast.Variable class
     * @param n {String}, the name of variable
     */
    public Variable(String n) {this.name = n;}

    /**
     * Get the name of variable
     * @return {String}, name of the variable
     */
    public String textualRepresentation() {return this.name;}

}
