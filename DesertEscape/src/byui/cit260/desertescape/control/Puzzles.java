/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.control;

/**
 *
 * @author Dallin Barlow
 */
public class Puzzles {
    
    public double treeCuttingCalculator(double diameter, double height, double strokes) { 
        
        if(diameter <= 0 || height <= 0 || strokes <= 0) {
            return -1;
        }
        
        double total = diameter * height/strokes;
        
        return total;
        
    }          
}