/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.view.menu;

import byui.cit260.desertescape.view.View;
import java.util.Scanner;

/**
 *
 * @author Dallin Barlow
 */
public class HelpMenuView extends View {

     public HelpMenuView(){
            super("\n*********************************************"
            +"\n__________________Help Menu_________________"
            +"\nG - About Game"
            +"\nL - Levels Help"
            +"\nI - Item Help"
            +"\nQ - Back");
     }

     @Override
    public boolean doAction(String value){
        char input = value.charAt(0);
        switch(input){
            case 'G':
                aboutGame();
                break;
            case 'L':
                displayLevelHelp();
                break;
            case 'I':
                displayItemHelp();
                break;
            case 'Q':
                break;
            default:
                System.out.println("\n*** Not valid ***  Please try again");
                break;
        }
        return false;
    }

    private void displayLevelHelp() {
        LevelsHelpView levelHelp = new LevelsHelpView();
        levelHelp.display();
    }

    private void aboutGame() {
        String out="";
        
        out= "\n                                   Game Overview"+
                "\nOPTIONS: Allows the player to select the difficulty of the game. The game"+
                "\nis ran on a chance calculator. Actions on levels run the chance calculator"+
                "\neach time. The high the difficulty the lower the chance of survival will be"+
                "\neach time the Danger calculator is ran.|"+
                "\nLOSING A LIFE: When the player loses a life the contents of the backpack are lost"+
                "\nand the player will wake up on the base level with only the things that they had on"+
                "\ntheir character, with one less life. Items that are carryed in the backpack will be lost.|"+
                "\nWINNING THE GAME: Requires the player to build a time machine and snap a photo of an"+
                "\nAlien. If only one of those things is done the player will lose the game.|"+
                "\nGAME OVER:Occurs when the player has lost all of their lives. Can exit to the main menu,"+
                "\nfrom there they are able to start at the last saved point of their game.";
        
        
        System.out.println(out);
    }

    private void displayItemHelp() {
       ItemsHelpView itemHelp = new ItemsHelpView();
       itemHelp.display();
    }
}
