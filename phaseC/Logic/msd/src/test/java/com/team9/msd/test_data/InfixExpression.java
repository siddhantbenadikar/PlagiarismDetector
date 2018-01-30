package com.team9.msd.test_data;

/**
 * This class is for representing infix expression
 */
public class InfixExpression extends Expression{

    // ast.Operator of this expression
    private Operator operator;

    // First ast.NumberExpression of this expression
    private Expression expressionOne;

    // Second ast.NumberExpression of this expression
    private Expression expressionTwo;

    /**
     * Constructor of InfixExpresion
     * @param o {ast.Operator}, operator of this expression
     * @param one {ast.Expression}, the first expression of this expression
     * @param two {ast.Expression}, the second expression of this expression
     */
    public InfixExpression(Operator o,  Expression one, Expression two) {
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
        return expressionOne.textualRepresentation() + operator.textualRepresentation() +
                expressionTwo.textualRepresentation();
    }
}
