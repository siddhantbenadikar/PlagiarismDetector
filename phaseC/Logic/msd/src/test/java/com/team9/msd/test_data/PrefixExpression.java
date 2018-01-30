package com.team9.msd.test_data;

/**
 * This class is for representing prefix expression
 */
public class PrefixExpression extends Expression{

    // ast.Operator of this expresion
    private Operator operator;

    // First expression of this prefix expression
    private Expression expressionOne;

    // Second expression of this prefix expression
    private Expression expressionTwo;

    /**
     * Constructor of ast.PrefixExpression
     * @param o {ast.Operator}, operator of this expression
     * @param one {ast.Expression}, the first expression of this expression
     * @param two {ast.Expression}, the second expression of this expression
     */
    public PrefixExpression(Operator o,  Expression one, Expression two) {
        this.operator = o;
        this.expressionOne = one;
        this.expressionTwo = two;
    }

    /**
     * Get the textual representation of this expression
     * @return {String}, textual representation of this expression
     */
    @Override
    public String textualRepresentation() {
        return operator.textualRepresentation() + expressionOne.textualRepresentation() +
                expressionTwo.textualRepresentation();
    }

}
