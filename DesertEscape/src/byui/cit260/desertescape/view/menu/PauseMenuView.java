/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.view.menu;

import java.util.Scanner;

/**
 *
 * @author Dallin Barlow
 */
public class PauseMenuView {
    
    
    public void displayMenu(){
        char selection = ' ';
        
        //while loop will continue to show the help menu screen unless user inputs B
        while('' != selection){
            //displays banner
            displayBanner();
            //displays user's choices for menu
            System.out.println(menu);
            
            //gets the input from the user
            String input = getInput();
            selection = input.charAt(0);
            
            //executes the action that was input by the user
            doAction(selection);
        }
    }
    
    public void doAction(char choice){
        switch(choice){
            case '':
                ;
                break;
            case '':
                ;
                break;
            case '':
                ;
                break;
            case '':
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
        
        while(!isValid){
            System.out.println("Please select an option:  ");
            input = keyboard.nextLine();
            input = input.trim();
            
            if (input == null || input.length() == 0) {
                System.out.println("Invalid input please input a correct character");
            } 
            else {
                isValid = true;
            }
        }
        return input.toUpperCase();
    }
    
    public void (){
        
    }
}
