/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.menu;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Dallin Barlow
 */
public class Difficulty implements Serializable {
    
    private String unluckydog;
    private String averagejoe;
    private String luckycat;

    public Difficulty() {
        
    }

    public String getUnluckydog() {
        return unluckydog;
    }

    public void setUnluckydog(String unluckydog) {
        this.unluckydog = unluckydog;
    }

    public String getAveragejoe() {
        return averagejoe;
    }

    public void setAveragejoe(String averagejoe) {
        this.averagejoe = averagejoe;
    }

    public String getLuckycat() {
        return luckycat;
    }

    public void setLuckycat(String luckycat) {
        this.luckycat = luckycat;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.unluckydog);
        hash = 53 * hash + Objects.hashCode(this.averagejoe);
        hash = 53 * hash + Objects.hashCode(this.luckycat);
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
        final Difficulty other = (Difficulty) obj;
        if (!Objects.equals(this.unluckydog, other.unluckydog)) {
            return false;
        }
        if (!Objects.equals(this.averagejoe, other.averagejoe)) {
            return false;
        }
        if (!Objects.equals(this.luckycat, other.luckycat)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Difficulty{" + "unluckydog=" + unluckydog + ", averagejoe=" + averagejoe + ", luckycat=" + luckycat + '}';
    }
    
    
}
