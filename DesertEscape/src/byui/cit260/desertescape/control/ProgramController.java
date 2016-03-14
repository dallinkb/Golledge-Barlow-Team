/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.control;

import byui.cit260.desertescape.model.Player;

/**
 *
 * @author Dallin Barlow
 */
public class ProgramController {
    
    public static Player createPlayer(String playerName) {
        
        if (playerName == null){
            return null;
        }
        
        Player p = new Player();
        p.setName(playerName);
        return p;
    }
}
