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
public class ActionsController {
    public double jetpackCalculator(double distance, double gravity){
        
        if (distance <= 0 || gravity <= 0){
            return -1;
        }
        
        double velocity = distance * gravity;
        
        return velocity;
    }
}