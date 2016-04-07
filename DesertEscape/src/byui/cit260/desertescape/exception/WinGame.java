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
public class WinGame extends RuntimeException {

    public WinGame() {
    }

    public WinGame(String string) {
        super(string);
    }

    public WinGame(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public WinGame(Throwable thrwbl) {
        super(thrwbl);
    }

    public WinGame(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
