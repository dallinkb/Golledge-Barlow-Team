/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.view.menu;

import byui.cit260.desertescape.view.View;
import byui.cit260.desertescape.view.menu.MainMenuView;
import java.util.Scanner;

/**
 *
 * @author Dallin Barlow
 */
public class OptionsView extends View {

    public OptionsView(){
            super("\n*********************************************"
            + "\n__________________Options Menu_________________"
            + "\nThis is the Menu through which the player is able to select"
            + "\ndifficulty of the the game. By Default game is on Medium"
            + "\nH - Hard (3 lives)"
            + "\nM - Medium (6 lives)"
            + "\nE - Easy (9 lives)"
            + "\nQ - Back to Main Menu");
    }
            
    @Override
    public boolean doAction(String value){
        char input=value.charAt(0);
        String out = "";
        switch (input){
            case 'H':
                hArd(out);
                break;
            case 'M':
                medIum(out);
                break;
            case 'E':
                eaSy(out);
                break;
            case 'Q':
                break;
            default:
                System.out.println("\n*** Not valid ***  Please try again");
                break;
        }
        return false;
    }

    private void hArd(String out) {
        out =   "\n You have selected HARD difficulty setting,"
                + "\nthis will give you 3 lives for the game.";
        
        System.out.println(out);
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }

    private void medIum(String out) {
        out =   "\n You have selected MEDIUM difficulty setting,"
                + "\nthis will give you 6 lives for the game.";
        
        System.out.println(out);
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }

    private void eaSy(String out) {
         out =  "\n You have selected EASY difficulty setting,"
                + "\nthis will give you 9 lives for the game";
       
        System.out.println(out);
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
}