/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Dallin Barlow
 */
public class Inventory implements Serializable {
    
    private String description;
    private Item itemType;
    private int amountInStock;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public Item getItemType() {
        return itemType;
    }

    public int getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(int amountInStock) {
        this.amountInStock = amountInStock;
    }
    
}
