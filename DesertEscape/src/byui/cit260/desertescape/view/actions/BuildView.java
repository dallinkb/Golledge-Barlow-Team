/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.view.actions;

import java.util.Scanner;

/**
 *
 * @author Dallin Barlow
 */
public class BuildView {
    public void displayBanner(){
        String banner = "";
        banner =
                "\n*********************************************"
                +"\n                   Build";
        System.out.println(banner);
    }
    private final String MENU =
            "\nT - Build Time Machine"
            + "\nJ - Build Jetpack"
            + "\nR - Return to Base";
    
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
            
        }while( selection != 'R' );
    }
    public void doAction(char choice){
        switch (choice) {
            case 'T':
                buildTimeMachine();
                break;
            case 'J': 
                buildJetPack();
                break;
            case 'R':
                break; 
            default:
                System.out.println("\n*** Not valid ***  Please try again");
                break;
        }
    }

    private void buildTimeMachine() {
        BuildTimeMachineView timemachine = new BuildTimeMachineView();
        timemachine.displayMenu();
    }

    private void buildJetPack() {
        String out = "";
    }
    
}
