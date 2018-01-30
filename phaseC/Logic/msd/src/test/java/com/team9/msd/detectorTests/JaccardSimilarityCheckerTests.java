package com.team9.msd.detectorTests;


import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.team9.msd.Detector.*;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import static junit.framework.TestCase.assertEquals;

/**
 * Tests the JaccardSimilarityChecker in the Detector package
 */
public class JaccardSimilarityCheckerTests {

    private DetectorFactory factory = new DetectorFactory();
    private FileInputStream input1;
    private FileInputStream input2;
    private FileInputStream input3;
    private FileInputStream input4;
    private FileInputStream input5;
    private FileInputStream input6;
    private FileInputStream input7;
    private FileInputStream input8;
    private FileInputStream input9;
    private FileInputStream input10;
    private FileInputStream input11;
    private FileInputStream input12;
    private FileInputStream input13;
    private FileInputStream input14;


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
        String path7 = "src" + File.separator + "test" + File.separator + "java"
                + File.separator + "com" + File.separator + "team9" + File.separator + "msd"
                + File.separator + "test_data" + File.separator + "file1.java";
        String path8 = "src" + File.separator + "test" + File.separator + "java"
                + File.separator + "com" + File.separator + "team9" + File.separator + "msd"
                + File.separator + "test_data" + File.separator + "Assignment.java";
        String path9 = "src" + File.separator + "test" + File.separator + "java"
                + File.separator + "com" + File.separator + "team9" + File.separator + "msd"
                + File.separator + "test_data" + File.separator + "Declaration.java";
        String path10 = "src" + File.separator + "test" + File.separator + "java"
                + File.separator + "com" + File.separator + "team9" + File.separator + "msd"
                + File.separator + "test_data" + File.separator + "Expression.java";
        String path11 = "src" + File.separator + "test" + File.separator + "java"
                + File.separator + "com" + File.separator + "team9" + File.separator + "msd"
                + File.separator + "test_data" + File.separator + "Operator.java";
        String path12 = "src" + File.separator + "test" + File.separator + "java"
                + File.separator + "com" + File.separator + "team9" + File.separator + "msd"
                + File.separator + "test_data" + File.separator + "empty.java";
        String path13 = "src" + File.separator + "test" + File.separator + "java"
                + File.separator + "com" + File.separator + "team9" + File.separator + "msd"
                + File.separator + "test_data" + File.separator + "LinkedList.java";
        String path14 = "src" + File.separator + "test" + File.separator + "java"
                + File.separator + "com" + File.separator + "team9" + File.separator + "msd"
                + File.separator + "test_data" + File.separator + "SimpleLinkedList.java";


        input1 = new FileInputStream(path1);
        input2 = new FileInputStream(path2);
        input3 = new FileInputStream(path3);
        input4 = new FileInputStream(path4);
        input5 = new FileInputStream(path5);
        input6 = new FileInputStream(path6);
        input7 = new FileInputStream(path7);
        input8 = new FileInputStream(path8);
        input9 = new FileInputStream(path9);
        input10 = new FileInputStream(path10);
        input11 = new FileInputStream(path11);
        input12 = new FileInputStream(path12);
        input13 = new FileInputStream(path13);
        input14 = new FileInputStream(path14);
    }

    /**
     * Tests if similarity score returned is as expected for file1.java and file2.java
     */
    @Test
    public void test1() {
        CompilationUnit cu1 = JavaParser.parse(input1);
        CompilationUnit cu2 = JavaParser.parse(input2);
        ASTService ast1 = factory.makeASTService(cu1);
        ASTService ast2 = factory.makeASTService(cu2);
        SimilarityChecker s = factory.makeJaccardSimilarityChecker(ast1, ast2);
        assertEquals(87.09677419354838, s.getSimilarity());
    }

    /**
     * Tests if similarity score returned is as expected for add1.java and add2.java
     */
    @Test
    public void test2() {
        CompilationUnit cu1 = JavaParser.parse(input3);
        CompilationUnit cu2 = JavaParser.parse(input4);
        ASTService ast1 = factory.makeASTService(cu1);
        ASTService ast2 = factory.makeASTService(cu2);
        SimilarityChecker s = factory.makeJaccardSimilarityChecker(ast1, ast2);
        assertEquals(20.588235294117645, s.getSimilarity());
    }

    /**
     * Tests if similarity score returned is as expected for Report.java and Test.java
     */
    @Test
    public void test3() {
        CompilationUnit cu1 = JavaParser.parse(input5);
        CompilationUnit cu2 = JavaParser.parse(input6);
        ASTService ast1 = factory.makeASTService(cu1);
        ASTService ast2 = factory.makeASTService(cu2);
        SimilarityChecker s = factory.makeJaccardSimilarityChecker(ast1, ast2);
        assertEquals(37.5, s.getSimilarity());
    }

    /**
     * Tests if similarity score for the same file is 100%
     */
    @Test
    public void test4() {
        CompilationUnit cu1 = JavaParser.parse(input1);
        CompilationUnit cu2 = JavaParser.parse(input7);
        ASTService ast1 = factory.makeASTService(cu1);
        ASTService ast2 = factory.makeASTService(cu2);
        SimilarityChecker s = factory.makeJaccardSimilarityChecker(ast1, ast2);
        assertEquals(100.0, s.getSimilarity());
    }

    /**
     * Test files with multiple methods
     */
    @Test
    public void test5() {
        CompilationUnit cu1 = JavaParser.parse(input8);
        CompilationUnit cu2 = JavaParser.parse(input9);
        ASTService ast1 = factory.makeASTService(cu1);
        ASTService ast2 = factory.makeASTService(cu2);
        SimilarityChecker s = factory.makeJaccardSimilarityChecker(ast1, ast2);
        assertEquals(47.368421052631575, s.getSimilarity());
    }

    /**
     * Test files with three method
     */
    @Test
    public void test6() {
        CompilationUnit cu1 = JavaParser.parse(input10);
        CompilationUnit cu2 = JavaParser.parse(input11);
        ASTService ast1 = factory.makeASTService(cu1);
        ASTService ast2 = factory.makeASTService(cu2);
        SimilarityChecker s = factory.makeJaccardSimilarityChecker(ast1, ast2);
        assertEquals(28.125, s.getSimilarity());
    }

    /**
     * Test files sent were null
     */
    @Test
    public void test7() {
        CompilationUnit cu1 = JavaParser.parse(input10);
        ASTService ast1 = factory.makeASTService(cu1);
        SimilarityChecker s = factory.makeJaccardSimilarityChecker(ast1, null);
        assertEquals(0.0, s.getSimilarity());
    }

    /**
     * Test files sent were null
     */
    @Test
    public void test8() {
        CompilationUnit cu1 = JavaParser.parse(input10);
        ASTService ast1 = factory.makeASTService(cu1);
        SimilarityChecker s = factory.makeJaccardSimilarityChecker(null,ast1);
        assertEquals(0.0, s.getSimilarity());
    }

    /**
     * Tests if empty file was sent
     */
    @Test
    public void test9() {
        CompilationUnit cu1 = JavaParser.parse(input10);
        CompilationUnit cu2 = JavaParser.parse(input12);
        ASTService ast1 = factory.makeASTService(cu1);
        ASTService ast2 = factory.makeASTService(cu2);
        SimilarityChecker s = factory.makeJaccardSimilarityChecker(ast2,ast1);
        assertEquals(0.0, s.getSimilarity());
    }

    /**
     * Test files that have multiple methods, declarations
     * and constructors
     */
    @Test
    public void test10() {
        CompilationUnit cu1 = JavaParser.parse(input13);
        CompilationUnit cu2 = JavaParser.parse(input14);
        ASTService ast1 = factory.makeASTService(cu1);
        ASTService ast2 = factory.makeASTService(cu2);
        SimilarityChecker s = factory.makeJaccardSimilarityChecker(ast1,ast2);
        assertEquals(20.930232558139537, s.getSimilarity());
    }

}
