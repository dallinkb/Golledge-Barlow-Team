/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.view.achievements;

import java.util.Scanner;

/**
 *
 * @author Dallin Barlow
 */
public class LostaLifeView {
    public void displayBanner(){
        String banner = "";
        banner =
                "\n*********************************************"
                +"\n                    Lost a Life"
                +"\n you lost a life, with it you lost all your "
                +"\n food and money. You wake up at the base.";
        System.out.println(banner);
    }
    private final String MENU =
            "\nC - Continue to Base"
            + "\nE - Exit to Main Menu";
    
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
    public void displayMenu(){
        
        char selection = ' ';
        do{
            displayBanner();
            System.out.println(MENU);
            
            String input = getInput();
            selection = input.charAt(0);
            
            doAction(selection);
            
        }while( selection != '' );
    }
    public void doAction(char choice){
        switch (choice) {
            case '':
                
                break;
            case '': 
                
                break;
            default:
                System.out.println("\n*** Not valid ***  Please try again");
                break;
        }
    }
    
    
}
