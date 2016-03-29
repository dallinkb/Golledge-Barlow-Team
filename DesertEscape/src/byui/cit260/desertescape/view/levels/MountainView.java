/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.view.levels;

import byui.cit260.desertescape.view.actions.ChopDownTreeView;
import byui.cit260.desertescape.view.actions.InspectView;
import byui.cit260.desertescape.view.actions.MoveView;
import java.util.Scanner;

/**
 *
 * @author Justin GOlledge
 */
public class MountainView {
    public void displayBanner(){
        String banner = "";
        banner =
                "\n*********************************************"
                +"\n______________Mountain________________";
        System.out.println(banner);
    }
    private final String MENU =
            "\nI - Inspect"
            + "\nR - Run"
            + "\nC - Chop Down Tree";
    
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
            case 'I':
                inSpect();
                break;
            case 'R': 
                rUn();
                break;
            case 'C':
                chopDownTree();

            default:
                System.out.println("\n*** Not valid ***  Please try again");
                break;
        }
    }

    private void inSpect() {
        InspectView inspect = new InspectView();
        inspect.displayMenu();
    }

    private void rUn() {
        MoveView run = new MoveView();
        run.displayMenu();
    }

    private void chopDownTree() {
        ChopDownTreeView chopdowntree = new ChopDownTreeView();
        chopdowntree.displayMenu();
    }
    
}
