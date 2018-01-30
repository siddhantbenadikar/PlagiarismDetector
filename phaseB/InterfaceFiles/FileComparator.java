public interface FileComparator {

    /**
     * Generates a report based on the similarity of the two AST
     */
    IReport compareFiles();

}
