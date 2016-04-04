/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.control;

import byui.cit260.desertescape.model.Game;
import byui.cit260.desertescape.model.Item;
import byui.cit260.desertescape.model.Location;
import byui.cit260.desertescape.model.Map;
import byui.cit260.desertescape.model.Player;
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
        g.setPlayer(player);
        
         Map gameMap = new Map();
        g.setMap(gameMap);
        
        player.setLocation(gameMap.getLocation(0, 0));
        
        DesertEscape.setGame(g);
     }
    
     public static List<Item> createItemList(){
         List<Item> itemList = new ArrayList<>();
         
         Item money = new Item();
         money.setName("Money");
         money.setAmountAttained(10);
         money.setCounts(1);
         money.setMoneyworth(1);
         
         Item boots = new Item();
         boots.setName("Boots");
         boots.setAmountAttained(10);
         boots.setCounts(1);
         boots.setMoneyworth(40);
         
         Item schematic = new Item();
         schematic.setName("Time Machine Schematic");
         schematic.setAmountAttained(1);
         schematic.setCounts(1);
         schematic.setMoneyworth(1000);
         
         Item ruby = new Item();
         ruby.setName("Ruby");
         ruby.setAmountAttained(1);
         ruby.setCounts(1);
         ruby.setMoneyworth(50);
         
         Item diamond = new Item();
         diamond.setName("Diamond");
         diamond.setAmountAttained(1);
         diamond.setCounts(1);
         diamond.setMoneyworth(75);
         
         Item necklace = new Item();
         necklace.setName("Royal Necklace");
         necklace.setAmountAttained(1);
         necklace.setCounts(1);
         necklace.setMoneyworth(200);
         
         Item artifact = new Item();
         artifact.setName("Alien Artifact");
         artifact.setAmountAttained(1);
         artifact.setCounts(1);
         artifact.setMoneyworth(125);
         
         Item food = new Item();
         food.setName("Food");
         food.setAmountAttained(5);
         food.setCounts(1);
         food.setMoneyworth(15);
         
         return itemList;
     }
     
    public static List<Location>
}

