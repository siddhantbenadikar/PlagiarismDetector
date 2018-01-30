package com.team9.msd.test_data;


/**
 * This class is for creating statement
 */
public class StatementFactory implements NodeFactory{
    /**
     * Create a new VariableExpression object
     * @param e {Expression}, value of the expression
     * @param v {Variable}, variable of this expression
     * @return {VariableExpression}
     */
    public VariableExpression makeVariableExpression(Expression e, Variable v) {
        return new VariableExpression(e, v);
    }

    /**
     * Create a new Assignment object
     * @param e {Expression}, value of the assignment
     * @param v {Variable}, variable of this expression
     * @return {Assignment}
     */
    public Assignment makeAssignment(Variable v, Expression e) {
        return new Assignment(v, e);
    }

    /**
     * Create a new Sequence object
     * @param one {Statement}, first statement of this sequence
     * @param two {Statement}, second statement of this sequence
     * @return {Sequence}
     */
    public Sequence makeSequence(Statement one, Statement two) {
        return new Sequence(one, two);
    }

    /**
     * Create a new Declaration object
     * @param v {Variable}, variable of this declaration
     * @return {Declaration}
     */
    public Declaration makeDeclaration(Variable v) {
        return new Declaration(v);
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
