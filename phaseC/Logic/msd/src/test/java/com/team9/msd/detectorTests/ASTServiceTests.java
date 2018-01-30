package com.team9.msd.detectorTests;


import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.team9.msd.Detector.*;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import static junit.framework.TestCase.assertEquals;

/**
 * Tests the ASTService in the Detector package
 */
public class ASTServiceTests {

    private DetectorFactory factory = new DetectorFactory();
    private FileInputStream input1;
    private FileInputStream input2;

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
        input1 = new FileInputStream(path1);
        input2 = new FileInputStream(path2);
    }

    /**
     * Tests if the removeComments methods is working as expected
     */
    @Test
    public void testRemoveComments() {
        CompilationUnit cu1 = JavaParser.parse(input1);
        CompilationUnit cu2 = JavaParser.parse(input2);
        ASTService ast1 = factory.makeASTService(cu1);
        assertEquals(cu1.getAllContainedComments(), cu2.getAllContainedComments());
    }

    /**
     * Tests if generateNodeList is making the correct NodeList
     */
    @Test
    public void testGenerateNodeList() {
        CompilationUnit cu1 = JavaParser.parse(input1);
        ASTService ast = factory.makeASTService(cu1);
        assertEquals("package com.team9.msd.test_data;", ast.getNodeList().get(0).getNode()
                .toString().replace(System.getProperty("line.separator"), ""));
    }

    /**
     * Tests if generateHashCodeList is generating the correct HashValueList
     * and if getHashValueAt(index) returning the right HashValue
     */
    @Test
    public void testGenerateHashCodeList() {
        CompilationUnit cu1 = JavaParser.parse(input1);
        ASTService ast = factory.makeASTService(cu1);
        List<Integer> n = ast.getHashCodeList();
        assertEquals(1621487572, ast.getHashValueAt(0));
        assertEquals(32, ast.hashCodeListSize());
    }

    /**
     * Tests if the root node retrieved is correct
     */
    @Test
    public void testGetRootNode() {
        CompilationUnit cu1 = JavaParser.parse(input1);
        ASTService ast = factory.makeASTService(cu1);
        assertEquals(cu1.findRootNode(), ast.getRoot());
    }


}
