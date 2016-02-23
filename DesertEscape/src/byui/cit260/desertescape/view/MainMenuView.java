/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.view;
/**
 *
 * @author Justin Golledge
 */
 
 private void displayNextView(Player player) {
 
    //display a custom welcome message
        System.out.println("\n============================================================="
                      + "\n Welcome to the game " +player.getName()
                      + "\n See if you can escape what the Desert has to offer!"
                      + "\n==============================================================");
    
    // Create MainMenuView object
    MainMenuView mainMenuView = new MainMenuView();
    
    // Display the main menu view
    mainMenuView.displayMainMenuView();
  }
public class MainMenuView {
    private final String MENU = "\n"
            + "\n-----------------------------------------------"
            + "\n| Main Menu Options                           |"
            + "\n-----------------------------------------------"
            + "\n1 - New Game"
            + "\n2 - Resume Game"
            + "\n3 - Options"
            + "\n4 - Help"
            + "\n0 - Back"
            + "\n-----------------------------------------------";
    
    public void displayMenu() {
        
        char selection = ' ';
        do{
            System.out.println(); // display the main menu
            
            String input = this.getInput(); //get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); //do action based on selection
           
        } while (selection != 'E');
                     
    }  
    public void doAction(char choice) {
        
        switch (choice) {
            case 'N': // Start a new game
                this.startNewGame();
                break;
            case 'G': // get and start an exiting game
                this.startExitingGame();
                break;
            case 'H': // display the help menu
                this.displayHelpMenu();
                break;
            case 'P': // pause game
                this.pauseGame();
                break;
            case 'S': // Save game
                this.saveGame();
                break;
            case 'E': // Exit program
                return;
            default:
                System.out.println("\n*** Not valid ***  Please try again");
                break;
        }
        
        return false
    }
}
