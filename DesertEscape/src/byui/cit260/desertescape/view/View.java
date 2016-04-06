/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.view;

import java.util.Scanner;
import desertescape.DesertEscape;

/**
 *
 * @author Dallin Barlow
 */
public abstract class View implements ViewInterface{
    protected String displayMessage;
    
    public View(){   
    }
    
    public View(String message){
        this.displayMessage= message;
    }
    
    @Override
    public void display(){
        
        boolean done = false;
        
        do{
            String value = this.getInput();
            if(value.toUpperCase().equals("Q")){
                return;
            }
            
            done=this.doAction(value);
        }while(!done);
    }
    
    @Override
    public String getInput(){
        Scanner keyboard = new Scanner(System.in);
        String input = null;
        boolean isValid = false;
        
        while(!isValid) {
            System.out.println(this.displayMessage);
            input = keyboard.nextLine();
            input = input.trim();
            
            if (input == null || input.length() == 0) {
                System.out.println("Invalid input please input a correct character");
            }
            break;
        }
        
       return input.toUpperCase(); 
    }
}