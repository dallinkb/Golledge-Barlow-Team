/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dallin Barlow
 */
public class moveTest {
    
    public moveTest() {
    }

    /**
     * Test of jetpackCalculator method, of class move.
     */
    @Test
    public void testJetpackCalculator() {
        System.out.println("jetpackCalculator");
        double distance = 30.0;
        double gravity = 30.0;
        move instance = new move();
        double expResult = 900.0;
        double result = instance.jetpackCalculator(distance, gravity);
        assertEquals(expResult, result, 0.0);

    }
    
}
