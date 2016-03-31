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
 * @author Justin Golledge
 */
public class Location implements Serializable {
    
    private int num;
    private String description;
    private Action action;
    private boolean visited;
    private boolean blocked;
    private char difficulty;
    private Item items;
    private LocationType type;

    public Location() {
    }
    
    

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public char getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(char difficulty) {
        this.difficulty = difficulty;
    }

    public Item getItems() {
        return items;
    }

    public void setItems(Item items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.num;
        hash = 41 * hash + Objects.hashCode(this.description);
        hash = 41 * hash + Objects.hashCode(this.action);
        hash = 41 * hash + (this.visited ? 1 : 0);
        hash = 41 * hash + (this.blocked ? 1 : 0);
        hash = 41 * hash + this.difficulty;
        hash = 41 * hash + Objects.hashCode(this.items);
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
        final Location other = (Location) obj;
        if (this.num != other.num) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (this.blocked != other.blocked) {
            return false;
        }
        if (this.difficulty != other.difficulty) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.action, other.action)) {
            return false;
        }
        if (!Objects.equals(this.items, other.items)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "num=" + num + ", description=" + description + ", action=" + action + ", visited=" + visited + ", blocked=" + blocked + ", difficulty=" + difficulty + ", items=" + items + '}';
    }
    
    
    
}
