/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.view.menu;

import byui.cit260.desertescape.view.View;
import byui.cit260.desertescape.view.menu.HelpMenuView;
import java.util.Scanner;

/**
 *
 * @author Dallin Barlow
 */
public class MainMenuView extends View {
    
    public MainMenuView(){
        super("\n*********************************************"
            +"\n___________Desert Escape Main Menu__________"
            + "\nN = New Game"
            + "\nR = Resume Saved Game"
            + "\nO = Options"
            + "\nH = Help Menu"
            + "\nE = Exit Game");
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
    
    
    private void startNewGame() {
        NewGameView newGame = new NewGameView();
        newGame.display();
    }

    private void loadSavedGame() {
        System.out.println("Called Resume game - not implemented yet");
    }

    private void displayOptionsMenu() {
        OptionsView optionsView = new OptionsView();
        optionsView.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
}