package com.team9.msd.test_data;

/**
 * This class is for creating specific expression
 */
public class ExpressionFactory implements NodeFactory{

    /**
     * Create a new NumberExpression object
     * @param n {int}, value of this number expression
     * @return {NumberExpression}
     */
    public NumberExpression makeNumberExpression(int n){
        return new NumberExpression(n);
    }

    /**
     * Create a new StringExpression object
     * @param s {String}, value of this string expression
     * @return {StringExpression}
     */
    public StringExpression makeStringExpression(String s) {
        return new StringExpression(s);
    }

    /**
     * Create a new InfixExpression object
     * @param o {Operator}, operator of this infix expression
     * @param one {Expression}, first expression of this infix expression
     * @param two {Expression}, second expression of this infix expression
     * @return {InfixExpression}
     */
    public InfixExpression makeInfixExpression(Operator o, Expression one, Expression two) {
        return  new InfixExpression(o, one,  two);
    }

    /**
     * Create a new PrefixExpression object
     * @param o {Operator}, operator of this infix expression
     * @param one {Expression}, first expression of this infix expression
     * @param two {Expression}, second expression of this infix expression
     * @return {PrefixExpression}
     */
    public PrefixExpression makePrefixExpression(Operator o,  Expression one, Expression two) {
        return new PrefixExpression(o, one, two);
    }

    /**
     * Create a new VariableExpression object
     * @param e {Expression}, expression of this expression
     * @param v {Variable}, variable of this expression
     * @return {VariableExpression}
     */
    public VariableExpression makeVariableExpression(Expression e, Variable v) {
        return new VariableExpression(e, v);
    }

    @Override
    public Expression makeExpression() {
        return null;
    }

    @Override
    public Statement makeStatement() {
        return null;
    }
}
