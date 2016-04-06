/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author Dallin Barlow
 */
public class Player implements Serializable {
    
    private String name;
    
    Location location;
    private int lives;

    public Player() {
    
    }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Game> getLives() {
        return lives;
    }

    public void setLives(List<Game> lives) {
        this.lives = lives;
    }
    
    
}
