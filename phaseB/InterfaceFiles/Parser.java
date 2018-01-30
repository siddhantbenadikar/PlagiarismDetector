import java.util.List;

public interface Parser {
    /**
     *
     * @return an Abstract Syntax tree generated from the list of tokens
     */

     AST generateAST();
}
