/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.model;

import java.util.Objects;

/**
 *
 * @author Dallin Barlow
 */
public class Action {
    
    private Item item;
    private Location location;
    private char action;
    private char requiredItem;
    private int requiredAmount;

    public Action() {
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public char getAction() {
        return action;
    }

    public void setAction(char action) {
        this.action = action;
    }

    public char getRequiredItem() {
        return requiredItem;
    }

    public void setRequiredItem(char requiredItem) {
        this.requiredItem = requiredItem;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.item);
        hash = 97 * hash + Objects.hashCode(this.location);
        hash = 97 * hash + this.action;
        hash = 97 * hash + this.requiredItem;
        hash = 97 * hash + this.requiredAmount;
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
        final Action other = (Action) obj;
        if (this.action != other.action) {
            return false;
        }
        if (this.requiredItem != other.requiredItem) {
            return false;
        }
        if (this.requiredAmount != other.requiredAmount) {
            return false;
        }
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Action{" + "item=" + item + ", location=" + location + ", action=" + action + ", requiredItem=" + requiredItem + ", requiredAmount=" + requiredAmount + '}';
    }
    
    
}
