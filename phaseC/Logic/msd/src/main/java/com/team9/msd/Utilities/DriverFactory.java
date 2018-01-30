package com.team9.msd.Utilities;

import com.github.javaparser.JavaParser;
import com.team9.msd.Detector.*;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

/**
 * This class is the driver program that would be called by our controller
 * It will return the similarity scores of the ASTs using LCS and
 * Jaccard Similarity algorithms
 */
public class DriverFactory {

    /**
     * this method calculates the LCS Similarity score of the uploaded files
     * @param file1 the first file that needs to be compared
     * @param file2 the second file that needs to be compared
     * @return the similarity score of the given files
     */
    public static double getLcsSimilarity(File file1, File file2){
        DetectorFactory factory = new DetectorFactory();
        ASTParser parser1 = ASTParser.newParser(AST.JLS3);
        ASTParser parser2 = ASTParser.newParser(AST.JLS3);
        try {

            // Provide source file for the parser
            parser1.setSource(new String(Files.readAllBytes(file1.toPath())).toCharArray());
            parser1.setKind(ASTParser.K_COMPILATION_UNIT);
            // Provide source file for the parser
            parser2.setSource(new String(Files.readAllBytes(file2.toPath())).toCharArray());
            parser2.setKind(ASTParser.K_COMPILATION_UNIT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        final CompilationUnit cu1 = (CompilationUnit) parser1.createAST(null);
        final CompilationUnit cu2 = (CompilationUnit) parser2.createAST(null);

        LCSSimilarityChecker lcsChecker = factory.makeLCSSimilarityChecker(cu1.getRoot(), cu2.getRoot());
        double lcs = lcsChecker.getSimilarity();
        return lcs;
    }


    /**
     * this method calculates the Jaccard Similarity score of the uploaded files
     * @param file1 the first file that needs to be compared
     * @param file2 the second file that needs to be compared
     * @return the similarity score of the given files
     */
    public static double getJaccardSimilarity(File file1, File file2) throws FileNotFoundException {
        DetectorFactory factory = new DetectorFactory();
        FileInputStream input1 = new FileInputStream(file1);
        FileInputStream input2 = new FileInputStream(file2);

        com.github.javaparser.ast.CompilationUnit cu1 = JavaParser.parse(input1);
        com.github.javaparser.ast.CompilationUnit cu2 = JavaParser.parse(input2);
        ASTService astService1 = factory.makeASTService(cu1);
        ASTService astService2 = factory.makeASTService(cu2);

        SimilarityChecker jaccardChecker = factory.makeJaccardSimilarityChecker(astService1, astService2);
        double jks = jaccardChecker.getSimilarity();

        return jks;
    }
}
