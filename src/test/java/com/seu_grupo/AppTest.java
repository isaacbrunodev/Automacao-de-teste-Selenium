package com.seu_grupo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigorous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    /**
     * Another Test Case
     */
    public void testAnotherCase() {
        // Lógica e asserções do outro caso de teste
    }

    /**
     * Yet Another Test Case
     */
    public void testYetAnotherCase() {
        // Lógica e asserções do outro caso de teste
    }
}
