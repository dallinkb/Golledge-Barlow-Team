/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.control;

import byui.cit260.desertescape.model.Game;
import byui.cit260.desertescape.model.Item;
import byui.cit260.desertescape.model.Location;
import byui.cit260.desertescape.model.LocationType;
import byui.cit260.desertescape.model.Player;

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
        //Mountain
        else if(local == 4){
            chopDownTree();
        }
        //SHOP
        else if(local == 2){
            shop();
        }
        //Alien Camp
        else if(local == 3){
          solveAlienPuzzle();  
        }
        //Desert
        else{
            desert();
        }
        
    }
    
    //gets the players inventory to add or take away from it and pass it on
    public void getInventory (Game Inventory[]){
        
        
    }
    
    public String inspect(int local){
        String a = "";
        String b = "";
        boolean shop = false;
        
        if (local != 3){
          
            
            shop = true;
        }
        
        
    }
    
    
    public int BuildTimeMachine(){
        
    }
    
    public shop(){
        
    }

    private void chopDownTree() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void solveAlienPuzzle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void desert() {
        String out = "\nThere are no actions to complete on this level"
                +"\n other than inspect.";
        
        System.out.println(out);
    }
 
}
