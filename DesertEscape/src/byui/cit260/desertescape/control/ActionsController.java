/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.control;

import byui.cit260.desertescape.model.Game;
import byui.cit260.desertescape.model.Inventory;
import byui.cit260.desertescape.model.Item;
import byui.cit260.desertescape.model.Location;
import byui.cit260.desertescape.model.LocationType;
import byui.cit260.desertescape.model.Player;
import desertescape.DesertEscape;
import java.util.List;

/**
 *
 * @author Dallin Barlow
 */
public class ActionsController {
    
    //Gets the player's locationn to determine what functions it should run
    public void getLocation(Game game){
        // gets the player's location by the location type
        Player player  = game.getPlayer();
        Location currentLocation = player.getLocation();
        LocationType type = currentLocation.getType();
        
        // converts the type to a value using ordinal
        int local = type.ordinal();
        
        // inputs the local number into the inspect function to find out which item to get
        inspect(local);
        
        // inputs the local number to get
        //BASE
        if (local == 0){
            BuildTimeMachine();
            
        }
        //SHOP
        else if(local == 2){
            shop();
        }
        //Alien Camp
        else if(local == 5){
          solveAlienPuzzle();  
        }
        
        
        //Desert, alien campsite
        else{
            error();
        }
        
    }
    
    //gets the players inventory to add or take away from it and pass it on
    public void getInventory (Game game){
        Inventory[] items = game.getItems();
        items.getClass();
        
    }
    
    public static inspect(int local){
        List<Item> items = DesertEscape.getGame().getPlayer().getItems();
        Inventory item : items = item.getAmountInStock();
        
        if (local != 3){
            
        }
        
        
    }
    
    
    public int BuildTimeMachine(){
        Inventory item = new Inventory();
        item.getAmountInStock(food);
        
        inventoryList.get(item.get)


//Game game = DesertEscape.getGame();
        // Inventory[] item = game.getItems();
        
        
       
        
    }
    
    private void chopDownTree() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void solveAlienPuzzle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void error() {
        String out = "\nThere are no actions to complete on this level"
                +"\n other than inspect.";
        
        System.out.println(out);
    }
    
        
    
    public static shOp(){
        
    }
 
}
