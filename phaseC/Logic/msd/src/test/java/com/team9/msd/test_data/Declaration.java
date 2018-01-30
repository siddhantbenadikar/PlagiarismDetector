package com.team9.msd.test_data;

/**
 * This class is for representing declaration statement
 */
public class Declaration extends Statement{

    // Variable of this declaration
    private Variable variable;

    /**
     * Constructor of this declaration class
     * @param v {Variable}, Variable of this declaration
     */
    public Declaration(Variable v) {
        this.variable = v;
    }

    /**
     * Get the textual representation of this declaration
     * @return {String}, textual representation of this declaration
     */
    @Override
    public String textualRepresentation() {
        return String.format("var %s", variable.textualRepresentation());
    }
}
