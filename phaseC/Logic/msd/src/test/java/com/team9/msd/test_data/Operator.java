package com.team9.msd.test_data;

/**
 * This class is for representing ast.Operator
 */
public class Operator {

    // value of the operator
    private String value;

    /**
     * Constructor of ast.Operator class
     * @param v {String}, value of the operator
     */
    public Operator(String v) {this.value = v;}

    /**
     * Get the value of operator
     * @return {String}, the value of operator
     */
    public String textualRepresentation() {return this.value;}
}
