package com.team9.msd.test_data;

/**
 * This class is for representing number expression
 */
public class NumberExpression extends Expression {

    // Value of this number expression
    private int value;

    /**
     * Constructor for ast.NumberExpression class
     * @param v {int}, value of this number expression
     */
    public NumberExpression(int v) {
        this.value = v;
    }

    /**
     * Return the value of this number expression
     * @return {String}, value of this number expression
     */
    @Override
    public String textualRepresentation() {
        return String.valueOf(this.value);
    }
}
