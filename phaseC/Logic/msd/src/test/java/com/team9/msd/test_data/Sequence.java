package com.team9.msd.test_data;

/**
 * This class is for represenring sequence
 */
public class Sequence extends Statement {

    // first statement of this sequence
    private Statement statementOne;

    // second statement of this sequence
    private Statement statementTwo;

    /**
     * Constructor of this sequence
     * @param one {Statement}, first statement of this sequence
     * @param two {Statement}, second statement of this sequence
     */
    public Sequence(Statement one, Statement two) {
        this.statementOne = one;
        this.statementTwo = two;
    }

    /**
     * Get the textual representation of this sequence
     * @return {String}, textual representation of this sequence
     */
    @Override
    public String textualRepresentation() {
        return String.format("%s; %s", statementOne.textualRepresentation(), statementTwo.textualRepresentation());
    }

}
