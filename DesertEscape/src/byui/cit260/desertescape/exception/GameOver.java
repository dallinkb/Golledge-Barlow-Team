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
public class GameOver extends RuntimeException{

    public GameOver() {
    }

    public GameOver(String string) {
        super(string);
    }

    public GameOver(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public GameOver(Throwable thrwbl) {
        super(thrwbl);
    }

    public GameOver(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
