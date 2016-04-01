/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.control;

import byui.cit260.desertescape.model.Game;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class MovementControllerTest {
    
    public MovementControllerTest() {
    }

    /**
     * Test of moveNorth method, of class MovementController.
     */
    @Test
    public void testMoveNorth() {
        System.out.println("moveNorth");
        Game game = null;
        MovementController instance = new MovementController();
        boolean expResult = false;
        boolean result = instance.moveNorth(game);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveEast method, of class MovementController.
     */
    @Test
    public void testMoveEast() {
        System.out.println("moveEast");
        Game game = null;
        MovementController instance = new MovementController();
        boolean expResult = false;
        boolean result = instance.moveEast(game);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveSouth method, of class MovementController.
     */
    @Test
    public void testMoveSouth() {
        System.out.println("moveSouth");
        Game game = null;
        MovementController instance = new MovementController();
        boolean expResult = false;
        boolean result = instance.moveSouth(game);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveWest method, of class MovementController.
     */
    @Test
    public void testMoveWest() {
        System.out.println("moveWest");
        Game game = null;
        MovementController instance = new MovementController();
        boolean expResult = false;
        boolean result = instance.moveWest(game);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
