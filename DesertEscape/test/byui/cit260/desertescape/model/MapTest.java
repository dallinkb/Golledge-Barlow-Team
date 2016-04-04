/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class MapTest {
    
    public MapTest() {
    }

    /**
     * Test of init method, of class Map.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        Map instance = new Map();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMapString method, of class Map.
     */
    @Test
    public void testGetMapString() {
        System.out.println("getMapString");
        Map instance = new Map();
        String expResult = "";
        String result = instance.getMapString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocation method, of class Map.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        int row = 0;
        int col = 0;
        Map instance = new Map();
        Location expResult = null;
        Location result = instance.getLocation(row, col);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
