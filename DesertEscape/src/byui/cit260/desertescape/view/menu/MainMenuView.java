/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.view.menu;

import byui.cit260.desertescape.view.menu.HelpMenuView;
import java.util.Scanner;

/**
 *
 * @author Dallin Barlow
 */
public class MainMenuView {
  
    private final String MENU =
            "\nN = New Game"
            + "\nR = Resume Saved Game"
            + "\nO = Options"
            + "\nH = Help Menu"
            + "\nE = Exit Game";
    public void displayBanner(){
        String bannerMM = "";
        bannerMM =
                "\n*********************************************"
                +"\n___________Desert Escape Main Menu__________";
        System.out.println(bannerMM);
    }
    public void displayMenu(){
        
        char selection = ' ';
        do{
            displayBanner();
            System.out.println(MENU);
            
            String input = getInput();
            selection = input.charAt(0);
            
            doAction(selection);
            
        }while( selection != 'E' );
    }
    
    public void doAction(char choice){
        switch (choice) {
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
            case 'E': // exit Menu
            default:
                System.out.println("\n*** Not valid ***  Please try again");
                break;
        }
    }
    
    public String getInput(){
        Scanner keyboard = new Scanner(System.in);
        String input = null;
        boolean isValid = false;
        
        while(!isValid) {
            System.out.println("Please select an option:  ");
            input = keyboard.nextLine();
            input = input.trim();
            
            if (input == null || input.length() == 0) {
                System.out.println("Invalid input please input a correct character");
            } else {
                isValid = true;
            }
        }
        
       return input.toUpperCase(); 
    }

    private void startNewGame() {
        NewGameView newGame = new NewGameView();
        newGame.displayMenu();
    }

    private void loadSavedGame() {
        System.out.println("Called Resume game - not implemented yet");
    }

    private void displayOptionsMenu() {
        OptionsView optionsView = new OptionsView();
        optionsView.displayMenu();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }
}
