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
public class HelpMenuView {
    
    public final String MENU = "\n"
            + "\n-------------------------------------------------------"
            + "\n| Help Menu Option                                    |"
            + "\n-------------------------------------------------------"
            + "\nG - What is the goal of the game?"
            + "\nM - How to move"
            + "\nE - Estimating the amount of resources"
            + "\nH - Harvesting resources"
            + "\nD - Delivering resources to warehouse"
            + "\nQ - Quit"
            
    public void displayMenu() {
        
        char selection = ' ';
        do{
            System.out.println(); // display the main menu
            
            String input = this.getInput(); //get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); //do action based on selection
           
        } while (selection != 'E');
                     
    }  
}
