/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desertescape;

import byui.cit260.desertescape.model.Game;
import byui.cit260.desertescape.model.Player;
import byui.cit260.desertescape.view.StartProgramView;
import java.io.BufferedReader;
import java.io.PrintWriter;

/********************************
 * 
 * TODO:
 * 
 * ViewInterface
 * View (abstract class) (Lesson 08)
 * 
 * Make all "standard" views (excludes StartProgramView and Level Views) extend View class
 * Also consider consolidating views into some standard views - e.g. GameMenuView
 * 
 * Initialize the Game - create the map - keep it two dimensional (Lesson 09)
 * 
 * Handle movement 
 * 
 * Create your own exceptions and throw them in certain parts of the code - Lesson 10
 * 
 *******************************/


/**
 *
 * @author Dallin Barlow
 */
public class DesertEscape {
    
    private static Player player;
    private static Game game;
    
    private static PrintWriter outFiles;
    private static BufferedReader inFiles;
    
    private static PrintWriter logFiles;
    

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

    public static PrintWriter getOutFiles() {
        return outFiles;
    }

    public static void setOutFiles(PrintWriter outFiles) {
        DesertEscape.outFiles = outFiles;
    }

    public static BufferedReader getInFiles() {
        return inFiles;
    }

    public static void setInFiles(BufferedReader inFiles) {
        DesertEscape.inFiles = inFiles;
    }

    public static PrintWriter getLogFiles() {
        return logFiles;
    }

    public static void setLogFiles(PrintWriter logFiles) {
        DesertEscape.logFiles = logFiles;
    }
    
    
    
}
