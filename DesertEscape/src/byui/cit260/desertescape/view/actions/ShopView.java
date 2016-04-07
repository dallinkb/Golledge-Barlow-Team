/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.view.actions;

import byui.cit260.desertescape.control.ActionsController;
import byui.cit260.desertescape.model.Inventory;
import byui.cit260.desertescape.model.Item;
import byui.cit260.desertescape.view.View;
import byui.cit260.desertescape.view.menu.GameMenuView;
import desertescape.DesertEscape;
import java.util.List;

/**
 *
 * @author Dallin Barlow
 */
public class ShopView extends View {
    
    public ShopView(){
       super("\n"
            +"\n___________Shop__________"
            + "\nItems to be Bought:"
            + "\nF - +10 Food(-20 Money)"
            + "\nB - +10 Boots (-30 Money)"
            + "\nS - +1  Time Machine Schematic (-700 Money)"
            + "\nItems to be Sold:"
            + "\nR - -1  Ruby (+75 Money)"
            + "\nD - -1  Diamond (+50 Money)"
            + "\nA - -1  Alien Artifact (+150 Money)"
            + "\nN - -1 Royal Necklace (+200)"
            + "\nQ = Game Menu");
    }
    
    
    @Override
    public boolean doAction(String value){
        char input=value.charAt(0);
        if( input == 'Q' ){
            gamemenuView();
        }
        else if(input == 'F' || input == 'B' || input == 'S' || input == 'R' || input == 'D' || input == 'A' || input == 'N'){
            shOp(input);
        }else
                System.out.println("\n*** Not valid ***  Please try again");
        return true;
        }

    private void gamemenuView() {
        GameMenuView g = new GameMenuView();
        g.display();
    }

    private void shOp(char input) {
        Inventory[] inventory = DesertEscape.getGame().getItems();
        List<Item> item = DesertEscape.getGame().getPlayer().getItems();
        ActionsController.shOp(inventory, item, input);
  
    }

   
    
}
