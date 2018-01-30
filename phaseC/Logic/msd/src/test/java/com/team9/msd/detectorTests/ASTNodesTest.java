package com.team9.msd.detectorTests;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.team9.msd.Detector.*;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Tests the ASTNodes in the Detector package
 */
public class ASTNodesTest {
    private DetectorFactory factory = new DetectorFactory();
    private FileInputStream input1;

    /**
     * Assigns the respective initializations to the inputs
     * @throws FileNotFoundException
     */
    @Before
    public void init() throws FileNotFoundException {
        String path1 = "src" + File.separator + "test" + File.separator + "java"
                + File.separator + "com" + File.separator + "team9" + File.separator + "msd"
                + File.separator + "test_data" + File.separator + "file1.java";
        input1 = new FileInputStream(path1);
    }

    /**
     * Tests if the getNode method is working as expected
     */
    @Test
    public void test1() {
        CompilationUnit cu1 = JavaParser.parse(input1);
        ASTService ast1 = factory.makeASTService(cu1);
        String ans = ast1.getNodeList().get(0)
                .toString().replace(System.getProperty("line.separator"), "");
        assertEquals("package com.team9.msd.test_data;", ans);
    }

    /**
     * Tests if the getHashValue method is working as expected
     */
    @Test
    public void test2() {
        CompilationUnit cu1 = JavaParser.parse(input1);
        ASTService ast1 = factory.makeASTService(cu1);
        Integer hashvalue = 1437779372;
        assertEquals(hashvalue, ast1.getNodeList().get(1).getHashValue());
    }

    /**
     * Tests if the getChildNodes method is working as expected
     */
    @Test
    public void test3() {
        CompilationUnit cu1 = JavaParser.parse(input1);
        ASTService ast1 = factory.makeASTService(cu1);
        List<ASTNodes> list = ast1.getNodeList().get(5).getChildNodes();
        assertEquals("file1", list.get(0).toString());
    }

    /**
     * Tests if the ASTNodes constructor is working as expected
     */
    @Test
    public void test4() {
        CompilationUnit cu1 = JavaParser.parse(input1);
        Node n1 = cu1.getChildNodes().get(0);
        IPreprocessor p = factory.makePreprocessor();
        ASTNodes astn1 = factory.makeASTNodes(n1);
        String ans = astn1
                .toString().replace(System.getProperty("line.separator"), "");
        assertEquals( "package com.team9.msd.test_data;" , ans);
    }


}
