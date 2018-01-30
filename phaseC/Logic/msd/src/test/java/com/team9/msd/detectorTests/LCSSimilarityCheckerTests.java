package com.team9.msd.detectorTests;


import com.team9.msd.Detector.*;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;

import static junit.framework.TestCase.assertEquals;


/**
 * Tests the LCSSimilarityChecker in the Detector package
 */
public class LCSSimilarityCheckerTests {

    private DetectorFactory factory = new DetectorFactory();
    private CompilationUnit cu1;
    private CompilationUnit cu2;
    private CompilationUnit cu3;
    private CompilationUnit cu4;
    private CompilationUnit cu5;
    private CompilationUnit cu6;
    private CompilationUnit cu7;
    private CompilationUnit cu8;
    private CompilationUnit cu9;
    private CompilationUnit cu10;
    private CompilationUnit cu11;
    private CompilationUnit cu12;

    /**
     * Assigns the respective initializations to the inputs
     * @throws FileNotFoundException
     */
    @Before
    public void init() throws FileNotFoundException {

        String path1 = "src" + File.separator + "test" + File.separator + "java"
                + File.separator + "com" + File.separator + "team9" + File.separator + "msd"
                + File.separator + "test_data" + File.separator + "file1.java";
        String path2 = "src" + File.separator + "test" + File.separator + "java"
                + File.separator + "com" + File.separator + "team9" + File.separator + "msd"
                + File.separator + "test_data" + File.separator + "file2.java";
        String path3 = "src" + File.separator + "test" + File.separator + "java"
                + File.separator + "com" + File.separator + "team9" + File.separator + "msd"
                + File.separator + "test_data" + File.separator + "add1.java";
        String path4 = "src" + File.separator + "test" + File.separator + "java"
                + File.separator + "com" + File.separator + "team9" + File.separator + "msd"
                + File.separator + "test_data" + File.separator + "add2.java";
        String path5 = "src" + File.separator + "test" + File.separator + "java"
                + File.separator + "com" + File.separator + "team9" + File.separator + "msd"
                + File.separator + "test_data" + File.separator + "Report.java";
        String path6 = "src" + File.separator + "test" + File.separator + "java"
                + File.separator + "com" + File.separator + "team9" + File.separator + "msd"
                + File.separator + "test_data" + File.separator + "Test.java";
        String path7  = "src" + File.separator + "test" + File.separator + "java"
                + File.separator + "com" + File.separator + "team9" + File.separator + "msd"
                + File.separator + "test_data" + File.separator + "empty.java";
        String path8  = "src" + File.separator + "test" + File.separator + "java"
                + File.separator + "com" + File.separator + "team9" + File.separator + "msd"
                + File.separator + "test_data" + File.separator + "file1.java";
        String path9  = "src" + File.separator + "test" + File.separator + "java"
                + File.separator + "com" + File.separator + "team9" + File.separator + "msd"
                + File.separator + "test_data" + File.separator + "PrefixExpression.java";
        String path10  = "src" + File.separator + "test" + File.separator + "java"
                + File.separator + "com" + File.separator + "team9" + File.separator + "msd"
                + File.separator + "test_data" + File.separator + "InfixExpression.java";
        String path11  = "src" + File.separator + "test" + File.separator + "java"
                + File.separator + "com" + File.separator + "team9" + File.separator + "msd"
                + File.separator + "test_data" + File.separator + "SimpleLinkedList.java";
        String path12  = "src" + File.separator + "test" + File.separator + "java"
                + File.separator + "com" + File.separator + "team9" + File.separator + "msd"
                + File.separator + "test_data" + File.separator + "LinkedList.java";

        File file1 = new File(path1);
        File file2 = new File(path2);
        File file3 = new File(path3);
        File file4 = new File(path4);
        File file5 = new File(path5);
        File file6 = new File(path6);
        File file7 = new File(path7);
        File file8 = new File(path8);
        File file9 = new File(path9);
        File file10 = new File(path10);
        File file11 = new File(path11);
        File file12 = new File(path12);


        ASTParser parser1 = ASTParser.newParser(AST.JLS3);
        ASTParser parser2 = ASTParser.newParser(AST.JLS3);
        ASTParser parser3 = ASTParser.newParser(AST.JLS3);
        ASTParser parser4 = ASTParser.newParser(AST.JLS3);
        ASTParser parser5 = ASTParser.newParser(AST.JLS3);
        ASTParser parser6 = ASTParser.newParser(AST.JLS3);
        ASTParser parser7 = ASTParser.newParser(AST.JLS3);
        ASTParser parser8 = ASTParser.newParser(AST.JLS3);
        ASTParser parser9 = ASTParser.newParser(AST.JLS3);
        ASTParser parser10 = ASTParser.newParser(AST.JLS3);
        ASTParser parser11 = ASTParser.newParser(AST.JLS3);
        ASTParser parser12 = ASTParser.newParser(AST.JLS3);

        try {

            parser1.setSource(new String(Files.readAllBytes(file1.toPath())).toCharArray());
            parser1.setKind(ASTParser.K_COMPILATION_UNIT);
            parser2.setSource(new String(Files.readAllBytes(file2.toPath())).toCharArray());
            parser2.setKind(ASTParser.K_COMPILATION_UNIT);
            parser3.setSource(new String(Files.readAllBytes(file3.toPath())).toCharArray());
            parser3.setKind(ASTParser.K_COMPILATION_UNIT);
            parser4.setSource(new String(Files.readAllBytes(file4.toPath())).toCharArray());
            parser4.setKind(ASTParser.K_COMPILATION_UNIT);
            parser5.setSource(new String(Files.readAllBytes(file5.toPath())).toCharArray());
            parser5.setKind(ASTParser.K_COMPILATION_UNIT);
            parser6.setSource(new String(Files.readAllBytes(file6.toPath())).toCharArray());
            parser6.setKind(ASTParser.K_COMPILATION_UNIT);
            parser7.setSource(new String(Files.readAllBytes(file7.toPath())).toCharArray());
            parser7.setKind(ASTParser.K_COMPILATION_UNIT);
            parser8.setSource(new String(Files.readAllBytes(file8.toPath())).toCharArray());
            parser8.setKind(ASTParser.K_COMPILATION_UNIT);
            parser9.setSource(new String(Files.readAllBytes(file9.toPath())).toCharArray());
            parser9.setKind(ASTParser.K_COMPILATION_UNIT);
            parser10.setSource(new String(Files.readAllBytes(file10.toPath())).toCharArray());
            parser10.setKind(ASTParser.K_COMPILATION_UNIT);
            parser11.setSource(new String(Files.readAllBytes(file11.toPath())).toCharArray());
            parser11.setKind(ASTParser.K_COMPILATION_UNIT);
            parser12.setSource(new String(Files.readAllBytes(file12.toPath())).toCharArray());
            parser12.setKind(ASTParser.K_COMPILATION_UNIT);

        } catch (IOException e) {
            e.printStackTrace();
        }

        cu1 = (CompilationUnit) parser1.createAST(null);
        cu2 = (CompilationUnit) parser2.createAST(null);
        cu3 = (CompilationUnit) parser3.createAST(null);
        cu4 = (CompilationUnit) parser4.createAST(null);
        cu5 = (CompilationUnit) parser5.createAST(null);
        cu6 = (CompilationUnit) parser6.createAST(null);
        cu7 = (CompilationUnit) parser7.createAST(null);
        cu8 = (CompilationUnit) parser8.createAST(null);
        cu9 = (CompilationUnit) parser9.createAST(null);
        cu10 = (CompilationUnit) parser10.createAST(null);
        cu11 = (CompilationUnit) parser11.createAST(null);
        cu12 = (CompilationUnit) parser12.createAST(null);
    }

    /**
     * Tests if similarity score returned is as expected for file1.java and file2.java
     */
    @Test
    public void test1() {
        SimilarityChecker s = factory.makeLCSSimilarityChecker(cu1, cu2);
        assertEquals(95.83333333333333, s.getSimilarity());
    }

    /**
     * Tests if similarity score returned is as expected for add1.java and add2.java
     */
    @Test
    public void test2() {
        SimilarityChecker s = factory.makeLCSSimilarityChecker(cu3, cu4);
        assertEquals(57.08333333333333, s.getSimilarity());
    }

    /**
     * Tests if similarity score returned is as expected for Test.java and Report.java
     */
    @Test
    public void test3() {
        SimilarityChecker s = factory.makeLCSSimilarityChecker(cu5, cu6);
        assertEquals(57.83361486486487, s.getSimilarity());
    }

    /**
     * Tests if similarity score returned is as expected for Test.java
     * and an empty file
     */
    @Test
    public void test4() {
        SimilarityChecker s = factory.makeLCSSimilarityChecker(cu5, cu7);
        assertEquals(0.0, s.getSimilarity());
    }

    /**
     * Tests the functionality of getSimilarNodeMap
     */
    @Test
    public void test5() {
        LCSSimilarityChecker s = factory.makeLCSSimilarityChecker(cu5, cu7);
        assertEquals(new HashMap<>(), s.getSimilarNodeMap());
    }

    /**
     * Tests if similarity score for the same file is 100%
     */
    @Test
    public void test6() {
        SimilarityChecker s = factory.makeLCSSimilarityChecker(cu1, cu8);
        assertEquals(95.83333333333333, s.getSimilarity());
    }

    /**
     * Test files sent were null
     */
    @Test
    public void test7() {
        SimilarityChecker s = factory.makeLCSSimilarityChecker(cu9, null);
        assertEquals(0.0, s.getSimilarity());
    }

    /**
     * Test files sent were null
     */
    @Test
    public void test8() {
        SimilarityChecker s = factory.makeLCSSimilarityChecker(null,cu9);
        assertEquals(0.0, s.getSimilarity());
    }

    /**
     * Tests files with multiple methods
     */
    @Test
    public void test9() {
        SimilarityChecker s = factory.makeLCSSimilarityChecker(cu9,cu10);
        assertEquals(56.567028985507235, s.getSimilarity());
    }

    /**
     * Test files that have multiple methods, declarations
     * and constructors
     */
    @Test
    public void test10() {
        SimilarityChecker s = factory.makeLCSSimilarityChecker(cu11,cu12);
        assertEquals(21.5357746783882, s.getSimilarity());
    }

}
