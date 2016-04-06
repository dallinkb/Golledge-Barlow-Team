/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.exception;

/**
 *
 * @author Dallin Barlow
 */
public class ErrorsPoints extends Exception {

    public ErrorsPoints() {
    }

    public ErrorsPoints(String message) {
        super(message);
    }

    public ErrorsPoints(String message, Throwable thrwbl) {
        super(message, thrwbl);
    }

    public ErrorsPoints(Throwable thrwbl) {
        super(thrwbl);
    }

    public ErrorsPoints(String message, Throwable thrwbl, boolean bln, boolean bln1) {
        super(message, thrwbl, bln, bln1);
    }
    
}
