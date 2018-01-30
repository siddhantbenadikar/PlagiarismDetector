package com.team9.msd;

import com.team9.msd.Utilities.DriverFactory;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import static junit.framework.TestCase.assertEquals;

/**
 * Tests the ASTService in the Detector package
 */
public class DriverFactoryTests {

    private File file1;
    private File file2;

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
        file1 = new File(path1);
        file2 = new File(path2);
    }

    /**
     * Tests if the getLcsSimilarity methods is working as expected
     */
    @Test
    public void testLcsSimilarity() {
        double score = DriverFactory.getLcsSimilarity(file1, file2);
        assertEquals(95.83333333333333, score);
    }

    /**
     * Tests if the getJaccardSimilarity methods is working as expected
     */
    @Test
    public void testJaccardSimilarity() {
        double score = 0;
        try {
            score = DriverFactory.getJaccardSimilarity(file1, file2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assertEquals(87.09677419354838, score);
    }


}
