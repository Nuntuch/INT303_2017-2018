/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.java;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nuntuch Thongyoo
 */
public class ProgramMathTest {
    
    public ProgramMathTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of LoopCheckPrimeNumber method, of class ProgramMath.
     */
    @Test
    public void testLoopCheckPrimeNumberExZero() {
//        System.out.println("LoopCheckPrimeNumber");
        int num = 0;
        ProgramMath instance = new ProgramMath(num);
        boolean expResult = false;
        boolean result = instance.getLoopCheckPrimeNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test
    public void testLoopCheckPrimeNumberExPrime() {
        int num = 19;
        ProgramMath instance = new ProgramMath(num);
        boolean expResult = true;
        boolean result = instance.getLoopCheckPrimeNumber();
        assertEquals(expResult, result);
    }
    @Test
    public void testLoopCheckPrimeNumberExNonPrime() {
        int num = 999;
        ProgramMath instance = new ProgramMath(num);
        boolean expResult = false;
        boolean result = instance.getLoopCheckPrimeNumber();
        assertEquals(expResult, result);
    }
    @Test
    public void testLoopCheckPrimeNumberExNonOne() {
        int num = 1;
        ProgramMath instance = new ProgramMath(num);
        boolean expResult = false;
         boolean result = instance.getLoopCheckPrimeNumber();
        assertEquals(expResult, result);
    }
    @Test
    public void testLoopCheckPrimeNumberExNonTwo() {
        int num = 2;
        ProgramMath instance = new ProgramMath(num);
        boolean expResult = true;
          boolean result = instance.getLoopCheckPrimeNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of FindFactor method, of class ProgramMath.
     */
    @Test
    public void testFindFactor() {
        System.out.println("FindFactor");
        int num = 50;
        ProgramMath instance = new ProgramMath();
        ArrayList<Integer> expResult = new ArrayList<>();
        expResult.add(1);
        expResult.add(2);
        expResult.add(5);
        expResult.add(5);
        ArrayList<Integer> result = instance.FindFactor(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of OodOrEven method, of class ProgramMath.
     */
    @Test
    public void testOodOrEvenEXOodExOdd() {
        System.out.println("OodOrEven");
        int num = 3;
        ProgramMath instance = new ProgramMath();
        boolean expResult = false;
        boolean result = instance.OodOrEven(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testOodOrEvenEXOodExEven() {
        System.out.println("OodOrEven");
        int num = 2;
        ProgramMath instance = new ProgramMath();
        boolean expResult = true;
        boolean result = instance.OodOrEven(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
