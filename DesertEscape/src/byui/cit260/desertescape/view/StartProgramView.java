/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.view;

import byui.cit260.desertescape.view.menu.MainMenuView;
import byui.cit260.desertescape.control.ProgramController;
import byui.cit260.desertescape.model.Player;
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
        
        Player player;
        player = ProgramController.createPlayer(playerName);
        
        DesertEscape.setPlayer(player);
        
        displayWelcomeMessage(player.getName());

        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
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
                "\n* In this game you are trapt in the future. *" +
                "\n* Survival and success is based upon your   *" +
                "\n*  ability to make tough decisions, plan    *" +
                "\n*       ahead, and overcome puzzles.        *" +
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
