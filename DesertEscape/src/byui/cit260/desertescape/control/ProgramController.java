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
import javax.accessibility.AccessibleRole;

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
         
         
         Inventory[] inventoryList = new Inventory[7];
         
         
         
         Inventory boots = new Inventory();
         boots.setDescription("Food");
         boots.setAmountInStock(15);
         inventoryList[0]= boots;
         
         Inventory money = new Inventory();
         money.setDescription("Money");
         money.setAmountInStock(0);
         inventoryList[1]= money;
         
         Inventory schematic = new Inventory();
         schematic.setDescription("Time Machine Schematic");
         schematic.setAmountInStock(0);
         inventoryList[2]= schematic;
         
         Inventory ruby = new Inventory();
         ruby.setDescription("Ruby");
         ruby.setAmountInStock(0);
         inventoryList[3]= ruby;
         
         Inventory diamond = new Inventory();
         diamond.setDescription("Diamond");
         diamond.setAmountInStock(0);
         inventoryList[4]= diamond;
         
         Inventory necklace = new Inventory();
         necklace.setDescription("Royal Necklace");
         necklace.setAmountInStock(0);
         inventoryList[5]= necklace;
         
         Inventory artifact = new Inventory();
         artifact.setDescription("Alien Artifact");
         artifact.setAmountInStock(0);
         inventoryList[6]= artifact;
         
         return inventoryList;
     }
     
     //shows the player's inventory
     public void printInventorylist(){
         
         Inventory[] items = DesertEscape.getGame().getItems();
         
         for (Inventory item : items){
             System.out.println(item.getDescription()+
                     "\n" + item.getAmountInStock());
         }
     }
             
     // this list was made to be able to reference all the things in the game assiociated with each item
     public static List<Item> createItemList(){
         List<Item> itemList = new ArrayList<>();
         
         Item food = new Item();
         food.setName("Food");
         food.setAmountAdded(10);
         food.setWorth(20);
         itemList.add(food);
         
         
         Item boots = new Item();
         boots.setName("Boots");
         boots.setAmountAdded(10);
         food.setWorth(20);
         itemList.add(boots);
         
         Item money = new Item();
         money.setName("Money");
         food.setAmountAdded(10);
         food.setWorth(1);
         itemList.add(money);
         
         Item ruby = new Item();
         ruby.setName("Ruby");
         ruby.setAmountAdded(1);
         ruby.setWorth(75);
         itemList.add(ruby);
         
         Item diamond = new Item();
         diamond.setName("Diamond");
         diamond.setAmountAdded(1);
         diamond.setWorth(50);
         itemList.add(diamond);
         
         Item necklace = new Item();
         necklace.setName("Royal Necklace");
         necklace.setAmountAdded(1);
         necklace.setWorth(200);
         itemList.add(necklace);
         
         Item artifact = new Item();
         artifact.setName("Royal Necklace");
         artifact.setAmountAdded(1);
         artifact.setWorth(150);
         itemList.add(artifact);
         
        
         
        return itemList; 
     }
     
}

