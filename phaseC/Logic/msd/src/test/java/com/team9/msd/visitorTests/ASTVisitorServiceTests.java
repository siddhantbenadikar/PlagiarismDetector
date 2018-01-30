package com.team9.msd.visitorTests;

import com.team9.msd.Visitor.ASTVisitorService;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Tests the ASTVisitorService in the Visitor package
 */
public class ASTVisitorServiceTests {

    private CompilationUnit cu1;

    /**
     * Assigns the respective initializations to the inputs
     * @throws FileNotFoundException
     */
    @Before
    public void init() throws FileNotFoundException {

        String path1 = "src" + File.separator + "test" + File.separator + "java"
                + File.separator + "com" + File.separator + "team9" + File.separator + "msd"
                + File.separator + "test_data" + File.separator + "Verysmall.java";

        File file1 = new File(path1);

        ASTParser parser1 = ASTParser.newParser(AST.JLS3);

        try {
            parser1.setSource(new String(Files.readAllBytes(file1.toPath())).toCharArray());
            parser1.setKind(ASTParser.K_COMPILATION_UNIT);

        } catch (IOException e) {
            e.printStackTrace();
        }

        cu1 = (CompilationUnit) parser1.createAST(null);
    }

    /**
     * Tests if getListOfNode is working as expected for the VisitorService
     */
    @Test
    public void test1() {
        List<ASTNode> list = ASTVisitorService.getListOfNodes(cu1.getRoot());
        assertEquals("com.team9", list.get(4).toString());
    }

    /**
     * Tests if getAstNodesHashValue is working as expected for the VisitorService
     */
    @Test
    public void test2() {
        List<Integer> list = ASTVisitorService.getAstNodesHashValue(cu1.getRoot());
        assertEquals(list, list);
    }

    /**
     * Tests if the getChildNodes method is working as expected
     */
    @Test
    public void test3() {
        List<ASTNode> list = ASTVisitorService.getChildren(cu1.getRoot());
        String ans = list.get(0).toString().replace("\n", "");
        assertEquals("package com.team9.msd.test_data;public class Verysmall {}", ans);
    }

}
