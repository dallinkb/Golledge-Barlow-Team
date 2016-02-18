/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dallin Barlow
 */
public class PuzzlesTest {
    
    public PuzzlesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testSomeMethod() {
    }

    /**
     * Test of treeCuttingCalculator method, of class puzzles.
     */
    @Test
    public void testTreeCuttingCalculator() {
        System.out.println("treeCuttingCalculator");
        double diameter = 5.0;
        double height = 6.0;
        double strokes = 3.0;
        Puzzles instance = new Puzzles();
        double expResult = 10.0;
        double result = instance.treeCuttingCalculator(diameter, height, strokes);
        assertEquals(expResult, result, 0.01);
    }
    
}
