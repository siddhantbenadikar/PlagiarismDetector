package com.team9.msd.test_data;

/**
 * This class is for representing variable expression
 */
public class VariableExpression extends Expression{

    // variable of this expression
    private Variable variable;

    // number expression of this variable
    private Expression expression;

    /**
     * Constructor of ast.VariableExpression class
     * @param e {ast.Expression}, number expression of this expression
     * @param v {ast.Variable}, variable of this expression
     */
    public VariableExpression(Expression e, Variable v) {
        this.expression = e;
        this.variable = v;
    }

    /**
     * Get the textual representation of this expression
     * @return {String}, textual representation of this expression
     */
    @Override
    public String textualRepresentation() {
        return expression.textualRepresentation() + variable.textualRepresentation();
    }

}
