package com.team9.msd.test_data;

/**
 * This class is for representing assignment statement
 */
public class Assignment extends Statement{

    // variable of this assign statement
    private Variable variable;

    // expression of this assign statement
    private Expression expression;

    /**
     * Constructor of assignment class
     * @param v {Variable}, the variable of this assignment
     * @param e {Expression}, the expression of this assignment
     */
    public Assignment(Variable v, Expression e) {
        this.expression = e;
        this.variable = v;
    }

    /**
     * Get the string value of assignment
     * @return {String}, the string value of assignment
     */
    @Override
    public String textualRepresentation() {
        return String.format("%s = %s", variable.textualRepresentation(), expression.textualRepresentation());
    }

}
