/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.view;

import byui.cit260.desertescape.view.MainMenuView
import byui.cit260.desertescape.control.ProgramController;
import byui.cit260.desertescape.menu.MainMenu;
import byui.cit260.desertescape.menu.Player;
import desertescape.DesertEscape;
import java.util.Scanner;

/**
 *
 * @author Dallin Barlow
 */
public class StartProgramView {
    
    public StartProgramView(){
        
    }
    
    public void startProgram(){
        
        displayBanner();
        
        String playerName = getPlayerName();
        
        Player player = ProgramController.createPlayer(playerName);
        
        DesertEscape.setPlayer(player);
        
        displayWelcomeMessage(player.getName());

        MainMenuView mainmenu
    }
    
    public String getPlayerName(){
        
        boolean isValidname = false;
        String name = "";
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter your name:");
        while (!isValidname){
            String input = keyboard.nextLine();
            
            if (input == null || input.length() >= 2) {
                isValidname = true;
                name = input;
            }
            else {
                System.out.println("Invalid name, please re-enter name. Name must be at least 2 characters.");
            }
        }
        return name;
    }
    
    //displays welcome banner to player starting game
    public void displayBanner(){
        String welcome = "";
        welcome = 
                "\n*********************************************" +
                "\n*        Welcome to Desert Escape           *" +
                "\n* In this game you are trying to escape from*" +
                "\n*   desert planet in the future. You are    *" +
                "\n* plagued by lack of supplies, human eating *" +
                "\n* aliens and loneliess. You must return home  *" +
                "\n*********************************************";
        
        System.out.println(welcome);
    }
    public void displayWelcomeMessage(String playerName){
        System.out.println("*********************************************");
        System.out.println("         Welcome " + playerName + ".         ");
                
        System.out.println("              Enjoy the game.                ");
        System.out.println("*********************************************");
    }
}