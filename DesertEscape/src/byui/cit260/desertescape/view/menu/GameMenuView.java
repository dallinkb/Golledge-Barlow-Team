/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.view.menu;

import byui.cit260.desertescape.view.View;
import java.util.Scanner;

/**
 *
 * @author Dallin Barlow
 */
public class GameMenuView extends View {
    
    public GameMenuView(){
        super("\n*********************************************"
                +"\n___________Desert Escape Game Menu__________"
                +"\nI - Inspect"
                +"\nA - Level Specific Action"
                +"\nN - Move North"
                +"\nS - Move South"
                +"\nE - Move East"
                +"\nW - Move West"
                +"\nM - View Map"
                +"\nV - View Inventory"
                +"\nG - Save Game"
                +"\nQ - Quit Game");
    } 
    
    public boolean doAction(String value) {
        char input=value.charAt(0);
        switch (input) {
            case 'I':
                insPect();
                break;
            case 'A':
                completeAction();
                break;
            case 'N':
                moveNorth();
                break;
            case 'S':
                moveSouth();
                break;
            case 'E':
                moveEast();
                break;
            case 'W':
                moveWest();
                break;
            case 'M':
                viewMap();
                break;
            case 'V':
                viewInventory();
                break;
            case 'G':
                saveGame();
                break;
            case 'Q':
                break;
            default:
                System.out.println("\n*** Not valid ***  Please try again");
                break;
        }
        return false;
    }

    private void insPect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveNorth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveSouth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveEast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveWest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewInventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void saveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void completeAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}