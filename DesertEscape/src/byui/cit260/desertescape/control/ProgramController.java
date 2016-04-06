/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.control;

import byui.cit260.desertescape.model.Action;
import byui.cit260.desertescape.model.Game;
import byui.cit260.desertescape.model.Inventory;
import byui.cit260.desertescape.model.Item;
import byui.cit260.desertescape.model.Location;
import byui.cit260.desertescape.model.Map;
import byui.cit260.desertescape.model.Player;
import com.sun.corba.se.impl.orbutil.closure.Constant;
import desertescape.DesertEscape;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dallin Barlow
 */
public class ProgramController {
    
    /**
     *
     * @param playerName
     * @return
     */
    public static Player createPlayer(String playerName) {
        
        if (playerName == null){
            return null;
        }
        
        Player p = new Player();
        p.setName(playerName);
        return p;
    }
    
     public static void createNewGame(Player player) {
        
         Game g = new Game();
        
         g.setPlayer(player); // saves player in game
         
         // create the inventoryList and saves it to the game
         Inventory[] inventoryList = ProgramController.createInventorylist();
         g.setItems(inventoryList);
        
         Map gameMap = new Map();
        g.setMap(gameMap);
        
        player.setLocation(gameMap.getLocation(0, 0));
        
        DesertEscape.setGame(g);
     }
    
     public static Inventory[] createInventorylist(){
         
         Inventory[] items = new Inventory[7];
         
         Inventory boots = new Inventory();
         boots.setDescription("Boots");
         boots.setAmountInStock(15);
         items[Item.boots.ordinal()]= boots;
         
         Inventory money = new Inventory();
         money.setDescription("Money");
         money.setAmountInStock(0);
         items[Item.money.ordinal()]= money;
         
         Inventory schematic = new Inventory();
         schematic.setDescription("Time Machine Schematic");
         schematic.setAmountInStock(0);
         items[Item.schematic.ordinal()]= schematic;
         
         Inventory ruby = new Inventory();
         ruby.setDescription("Ruby");
         ruby.setAmountInStock(0);
         items[Item.ruby.ordinal()]= ruby;
         
         Inventory diamond = new Inventory();
         diamond.setDescription("Diamond");
         diamond.setAmountInStock(0);
         items[Item.diamond.ordinal()]= diamond;
         
         Inventory necklace = new Inventory();
         necklace.setDescription("Royal Necklace");
         necklace.setAmountInStock(0);
         items[Item.necklace.ordinal()]= necklace;
         
         Inventory artifact = new Inventory();
         artifact.setDescription("Alien Artifact");
         artifact.setAmountInStock(0);
         items[Item.artifact.ordinal()]= artifact;
         
         return items;
     } 
}

