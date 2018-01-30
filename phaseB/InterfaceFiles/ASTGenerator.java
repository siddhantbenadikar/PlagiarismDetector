import java.util.List;

//Creates ASTGenerator Objects of type Parser
public class ASTGenerator implements Parser {

    private List<String> tokens;

    // Constructor template for ASTGenerator
    // new ASTGenerator()
    public ASTGenerator(List<String> tokens) {
        this.tokens = tokens;
    }

    @Override
    //Generates the Abstract Syntax Tree for all files.
    public AST generateAST() {
        return null;
    }
}
