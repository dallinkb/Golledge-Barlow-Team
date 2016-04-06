/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.view.actions;

import byui.cit260.desertescape.view.View;

/**
 *
 * @author Dallin Barlow
 */
public class ShopView extends View {
    
    public ShopView(){
       super("\n"
            +"\n___________Shop__________"
            + "\nItems to be Bought:"
            + "\nF - +10 Food(-20 Money)"
            + "\nB - +10 Boots (-30 Money)"
            + "\nS - +1  Time Machine Schematic (-700 Money)"
            + "\nItems to be Sold:"
            + "\nR - -1  Ruby (+75 Money)"
            + "\nD - -1  Diamond (+50 Money)"
            + "\nA - -1  Alien Artifact (+150 Money)"
            + "\nN - -1 Royal Necklace (+200)"
            + "\nQ = Exit Game");
    }
    
    
    @Override
    public boolean doAction(String value){
        char input=value.charAt(0);
        
        switch (input) {
            case 'N': // Start a new game
                startNewGame();
                break;
            case 'R': // get and start an exiting game
                loadSavedGame();
                break;
            case 'O': // display the options menu
                displayOptionsMenu();
                break;
            case 'H': // help menu
                displayHelpMenu();
                break;
            case 'Q': // exit Menu
            default:
                System.out.println("\n*** Not valid ***  Please try again");
                break;
        }
        return false;
    }
    
}
