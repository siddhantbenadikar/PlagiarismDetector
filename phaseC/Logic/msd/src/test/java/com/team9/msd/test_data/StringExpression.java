package com.team9.msd.test_data;

/**
 * This class is for representing String expression
 */
public class StringExpression extends Expression{

    // value of this String
    private String value;

    /**
     * Constructor for ast.StringExpression class
     * @param v {int}, value of this String expression
     */
    public StringExpression(String v) {
        this.value = v;
    }

    /**
     * Return the value of this String expression
     * @return {String}, value of this String expression
     */
    @Override
    public String textualRepresentation() {
        return this.value;
    }

}
