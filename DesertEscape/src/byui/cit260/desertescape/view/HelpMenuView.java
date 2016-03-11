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
public class HelpMenuView {
    // banner for help menu
     public void displayBanner(){
        String banner= " ";
        banner= "\n*********************************************"
                +"\n__________________Help Menu_________________";
        System.out.println(banner);
    }
    // string list for the user to input directions
    private final String menu = 
            "\nG - About Game"
            +"\nL - Levels Help"
            +"\nI - Item Help"
            +"\nB - Back";
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
    public void doAction(char choice){
        switch(choice){
            case 'G':
                aboutGame();
                break;
            case 'L':
                displayLevelHelp();
                break;
            case 'I':
                displayItemHelp();
                break;
            case 'B':
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
    public HelpMenuView(){
        
    }

    private void displayLevelHelp() {
        LevelsHelpView levelHelp = new LevelsHelpView();
        levelHelp.displayMenu();
    }

    private void aboutGame() {
        String out="";
        
        out= "\n                                   Game Overview"+
                "\nOPTIONS: Allows the player to select the difficulty of the game. The game"+
                "\nis ran on a chance calculator. Actions on levels run the chance calculator"+
                "\neach time. The high the difficulty the lower the chance of survival will be"+
                "\neach time the Danger calculator is ran.|"+
                "\nLOSING A LIFE: When the player loses a life the contents of the backpack are lost"+
                "\nand the player will wake up on the base level with only the things that they had on"+
                "\ntheir character, with one less life. Items that are carryed in the backpack will be lost.|"+
                "\nWINNING THE GAME: Requires the player to build a time machine and snap a photo of an"+
                "\nAlien. If only one of those things is done the player will lose the game.|"+
                "\nGAME OVER:Occurs when the player has lost all of their lives. Can exit to the main menu,"+
                "\nfrom there they are able to start at the last saved point of their game.";
        
        
        System.out.println(out);
    }

    private void displayItemHelp() {
       ItemsHelpView itemHelp = new ItemsHelpView();
       itemHelp.displayMenu();
    }
}
