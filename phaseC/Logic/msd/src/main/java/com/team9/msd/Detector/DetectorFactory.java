package com.team9.msd.Detector;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import org.eclipse.jdt.core.dom.ASTNode;

/**
 * Factory for all the classes in the detector to encapsulate
 * their object initialization
 */
public class DetectorFactory {

    /**
     * Method that makes a ASTNodes Object
     * @param node, the Node that needs to be converted to
     *              ASTNodes
     * @return an ASTNodes object
     */
    public ASTNodes makeASTNodes(Node node) {
        return new ASTNodes(node);
    }

    /**
     * Method that makes an object of ASTService
     * @param cu, Javaparser compilation unit that needs the ASTService
     * @return an ASTService object
     */
    public ASTService makeASTService(CompilationUnit cu) {
        return new ASTService(cu);
    }

    /**
     * Method that makes an object of JaccardSimilarityChecker
     * @param s1, the first ASTService
     * @param s2, the second ASTService
     * @return an JaccardSimilarityChecker object
     */
    public JaccardSimilarityChecker makeJaccardSimilarityChecker(ASTService s1, ASTService s2) {
        return new JaccardSimilarityChecker(s1, s2);
    }

    /**
     * Method that makes an object of LCSSimilarityChecker
     * @param n1, the first ASTNode
     * @param n2, the second ASTNode
     * @return an LCSSimilarityChecker object
     */
    public  LCSSimilarityChecker makeLCSSimilarityChecker(ASTNode n1, ASTNode n2) {
        return new LCSSimilarityChecker(n1, n2);
    }

    /**
     * Method that makes an object of Preprocessor
     * @return an Preprocessor object
     */
    public Preprocessor makePreprocessor() {
        return new Preprocessor();
    }

}
