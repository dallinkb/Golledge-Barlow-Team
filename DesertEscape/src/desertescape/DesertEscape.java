/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desertescape;

import byui.cit260.desertescape.model.Game;
import byui.cit260.desertescape.model.Player;
import byui.cit260.desertescape.view.StartProgramView;

/**
 *
 * @author Dallin Barlow
 */
public class DesertEscape {
    
    private static Player player;
    private static Game game;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //calls the startprogram class
        StartProgramView startProgram = new StartProgramView();
        
        startProgram.startProgram();
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        DesertEscape.player = player;
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        DesertEscape.game = game;
    }
    
}
