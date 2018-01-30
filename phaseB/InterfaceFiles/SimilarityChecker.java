
// SimilarityChecker class to check similarity between two ASTs and creates objects of type FileComparator
public class SimilarityChecker implements FileComparator {

    private AST ast1;
    private AST ast2;

    // Constructor template for SimilarityChecker
    //  new SimilarityChecker()
    public SimilarityChecker(AST ast1, AST ast2) {
        this.ast1 = ast1;
        this.ast2 = ast2;
    }

    @Override
    // Compares given files
    public IReport compareFiles() {
        return null;
    }
}
