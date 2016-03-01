/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.view;

import java.util.Scanner;

/**
 *
 * @author Dallin Barlow
 */
public class MainMenuView {
  
    private final String MENU = "\n"
            + "\n-----------------------------------------------"
            + "\n | Main Menu Options -------------------------|"
            + "\n-----------------------------------------------"
            + "\n1 = New Game "
            + "\n2 = Resume Game"
            + "\n3 = Options "
            + "\n4 = Help "
            + "\n0 = Back "
            + "\n-----------------------------------------------";
    
    public void displayMenu(){
        
        char selection = ' ';
        do{
            System.out.println(MENU);
            
            String input = getInput();
            selection = input.charAt(0);
            
            doAction(selection);
            
        }while( selection != '0' );
    }
    
    public void doAction(char choice){
        switch (choice) {
            case '1': // Start a new game
                startNewGame();
                break;
            case '2': // get and start an exiting game
                loadSavedGame();
                break;
            case '3': // display the options menu
                displayOptionsMenu();
                break;
            case '4': // help menu
                displayHelpMenu();
                break;
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
                System.err.println("Invalid input please input a correct character");
            } else {
                isValid = true;
            }
        }
        
       return input; 
    }

    private void startNewGame() {
        System.out.println("Called Start new Game - not implemented yet");
    }

    private void loadSavedGame() {
        System.out.println("Called Resume game - not implemented yet");
    }

    private void displayOptionsMenu() {
        System.out.println("Called options menu - not implemented yet");
    }

    private void displayHelpMenu() {
        System.out.println("Called Help menuda - not implemented yet");
    }
}
