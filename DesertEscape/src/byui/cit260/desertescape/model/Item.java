/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Dallin Barlow
 */
public class Item implements Serializable {
    
    private String name;
    private int worth;
    private int amountAdded;
    
    /* food,
    boots,
    schematic,
    money,
    ruby,
    necklace,
    diamond,
    artifact; */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorth() {
        return worth;
    }

    public void setWorth(int worth) {
        this.worth = worth;
    }

    public int getAmountAdded() {
        return amountAdded;
    }

    public void setAmountAdded(int amountAdded) {
        this.amountAdded = amountAdded;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + this.worth;
        hash = 53 * hash + this.amountAdded;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.worth != other.worth) {
            return false;
        }
        if (this.amountAdded != other.amountAdded) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
}
