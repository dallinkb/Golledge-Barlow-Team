/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.view.levels;

import byui.cit260.desertescape.view.actions.BuyView;
import byui.cit260.desertescape.view.actions.MoveView;
import byui.cit260.desertescape.view.actions.SellView;
import java.util.Scanner;

/**
 *
 * @author Justin Golledge
 */
public class ShopView {
    public void displayBanner(){
        String banner = "";
        banner =
                "\n*********************************************"
                +"\n_______________Shop_______________";
        System.out.println(banner);
    }
    private final String MENU =
            "\nB - Buy"
            + "\nS - Sell"
            + "\nR - Run";
    
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
            case 'B':
                bUy();
                break;
            case 'S': 
                seLl();
                break;
            case 'R':
                rUn();
                
            default:
                System.out.println("\n*** Not valid ***  Please try again");
                break;
        }
    }

    private void bUy() {
        BuyView buy = new BuyView();
        buy.displayMenu();
    }

    private void seLl() {
        SellView sell = new SellView();
        sell.displayMenu();
    }

    private void rUn() {
        MoveView run = new MoveView();
        run.displayMenu();
    }
    
}
