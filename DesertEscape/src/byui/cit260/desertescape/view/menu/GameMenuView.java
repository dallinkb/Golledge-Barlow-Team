/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.view.menu;

import byui.cit260.desertescape.control.MovementController;
import byui.cit260.desertescape.control.ProgramController;
import byui.cit260.desertescape.model.Game;
import byui.cit260.desertescape.model.Inventory;
import byui.cit260.desertescape.model.Item;
import byui.cit260.desertescape.model.Location;
import byui.cit260.desertescape.model.LocationType;
import byui.cit260.desertescape.view.View;
import byui.cit260.desertescape.view.actions.ShopView;
import desertescape.DesertEscape;
import java.io.Console;
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
                +"\nL - View  Current Location"
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
            case 'L':
                viewCurrentLocation();
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
        MovementController mc = new MovementController();
        if(mc.moveEast(DesertEscape.getGame())== false){
            System.out.println("You cannot move there");
        }
    }

    private void moveSouth() {
        MovementController mc = new MovementController();
        if(mc.moveEast(DesertEscape.getGame())== false){
            System.out.println("You cannot move there");
        }
    }

    private void moveEast() {
        MovementController mc = new MovementController();
        if(mc.moveEast(DesertEscape.getGame())== false){
            System.out.println("You cannot move there");
        }
    }

    private void moveWest() {
        MovementController mc = new MovementController();
        if(mc.moveEast(DesertEscape.getGame())== false){
            System.out.println("You cannot move there");
        }
    }

    private void viewMap() {
        System.out.println(DesertEscape.getGame().getMap().getMapString());
    }

    private void viewInventory() {
        ProgramController output = new ProgramController();
        output.printInventorylist();
    }

    private void saveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void completeAction() {
        LocationType type = DesertEscape.getGame().getPlayer().getLocation().getType();
        if(type == LocationType.shop){
            ShopView view = new ShopView();
            view.display();
        }
        
    }

    private void viewCurrentLocation() {
        Location l = DesertEscape.getGame().getPlayer().getLocation();
        System.out.println("You are at: (" + l.getRow() + ", " + l.getCol() + ")");
    }


}