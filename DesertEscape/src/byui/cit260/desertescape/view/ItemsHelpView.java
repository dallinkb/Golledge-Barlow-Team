/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.view;

import byui.cit260.desertescape.view.View;
import java.util.Scanner;

/**
 *
 * @author Dallin Barlow
 */
public class ItemsHelpView extends View {

    public ItemsHelpView(){
        super("\n*********************************************"
                +"\n__________________Items_____________________"
                +"\n this is a list of the items and what each  "
                +"\n  one does, as well as where to find them   "    
                +"\nM - Map"          
                +"\nB - Boots"       
                +"\nF - Food"        
                +"\nL - Lives"    
                +"\nR - Ruby"
                +"\nD - Diamond"
                +"\nS - Schematic Time Machine"
                +"\nI - Money"
                +"\nQ - Return to Help Menu");       
    }

    public boolean doAction(String value){
        char input = value.charAt(0);
        String out = "";
        switch(input){
            case 'M':
                mAp(out);
                break;
            case 'B':
                booTs(out);
                break;
            case 'F':
                foOd(out);
                break;
            case 'L':
                liFe(out);
                break;
            case 'R':
                ruBy(out);
                break;
            case 'D':
                diamOnd(out);
                break;
            case 'S':
                moNey(out);
                break;
            case 'I':
                schematicTimeMachine(out);
                break;
            case 'Q':
                break;
            default:
                System.out.println("\n*** Not valid ***  Please try again");
                break;
        }
        return false;
    }
    
    private void mAp(String out) {
        out =   "                             MAP                            "
                +"\nUsed to travel and reveal the location that you are at."
                +"\nIt will show you all the locations that you are able to"
                +"\ntravel to.";
                System.out.print(out);
    }
    private void booTs(String out) {
        out =   "                                  Boots"
                +"\nNecessary to use to travel, needed to move. Every time"
                +"\nthe player moves it will take away one from the boots."
                +"\nThe boots have 15 moves in them, everytime the boots"
                +"\nare bought it will add 15 moves to it, if the player attempts"
                +"\nto move without the boots they will lose a life.";
                System.out.print(out);
    }
    private void foOd(String out) {
        out =   "                                   FOOD"
                +"\nCan be found at certain levels with inspect, or bought"
                +"\nat the shop. Everytime an action is made (inspect or "
                +"\nlevel specific action) it will cost one food. If the"
                +"\nplayer does an action without food, they will lose a life.";
                System.out.print(out);
    }

    private void moNey(String out) {
        out =   "                                 MONEY/UNITS"
                +"\nCan be found at some levels when the player inspects. Need"
                +"\nto obtain other items in the game.";
                System.out.print(out);
    }

    private void ruBy(String out) {
        out =   "                                  RUBY"
                +"\nCan sell at the shop to get more money. Sells for 50"
                +"\nand can be found at some levels with the inspect action"
                +"\n"
                +"\n"
                +"\n";
                System.out.print(out);
    }
    private void diamOnd(String out) {
        out =   "                           DIAMOND"
                +"\nCan sell at the shop to get more money. Sells for 100"
                +"\nand can be found at some levels with the inspect action";
                System.out.print(out);
    }

    private void schematicTimeMachine(String out) {
        out =   "                           SCHEMATIC TIME MACHINE"
                +"\nCan be bought at the Shop, necessary to build the time machine"
                +"\nto win the game.";
                System.out.print(out);
    }

    private void liFe(String out) {
         out =   "                           LIVES"
                +"\nIf the player runs out of lives the game is lost. The player"
                +"\nmust have at least one life to continue to play the game.";
                System.out.print(out);
    }
}