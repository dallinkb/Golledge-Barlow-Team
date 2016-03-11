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
public class OptionsView {
    public void displayBanner(){
        String banner= " ";
        banner= "\n*********************************************"
                +"\n__________________Options Menu_________________"
                +"\nThis is the Menu through which the player is able to select"
                +"\ndifficulty of the the game, for more instructions on what each"
                +"\nsetting means, please look at the Help Menu/Level Help/Overview.";
        System.out.println(banner);
    }
    private final String menu = 
            "\nH - Hardest Difficulty"
            +"\nM - Medium Difficulty(Default)"
            +"\nE - Easy Diffifculty"
            +"\nB - Back to Main Menu";
    // displays the banner and string list for the user to see
    public void displayMenu(){
        char selection = ' ';
        
        //while loop will continue to show the help menu screen unless user inputs B
        while('B' != selection){
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
    public void doAction(char choice){
        String out = "";
        if (choice == 'H'){
            hArd(out);
        }else if(choice == 'M'){
            medIum(out);
        }else if(choice == 'E'){
            eaSy(out);
        }else if(choice == 'B'){
            
        }else{
            System.out.println("\n*** Not valid ***  Please try again");
        }
    }

    private void hArd(String out) {
        out=    "\n You have selected HARD on the difficulty, this will make the game"+
                "\nalmost impossible to beat. To see what this means for each level"+
                "\nplease look at the Help Menu/Level Help. Good luck Player.";
        System.out.println(out);
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMenu();
    }

    private void medIum(String out) {
        out=    "\n You have selected MEDIUM on the difficulty, this will make the game"+
                "\nplayable and enjoyable for most. To see what this means for each level"+
                "\nplease look at the Help Menu/Level Help. Good luck Player.";
        System.out.println(out);
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMenu();
    }

    private void eaSy(String out) {
        out=    "\n You have selected EASY on the difficulty, this will make the game"+
                "\nbeatable by almost anyone. To see what this means for each level"+
                "\nplease look at the Help Menu/Level Help. Good luck Player.";
        System.out.println(out);
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMenu();
    }
    }
}
