/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.actions;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Dallin Barlow
 */
public class Sell implements Serializable {
    
    private int food;
    private int shirt;
    private int knife;
    private int boots;
    private int water;
    private int medicine;
    private String back;

    public Sell() {
        
    }

    
    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getShirt() {
        return shirt;
    }

    public void setShirt(int shirt) {
        this.shirt = shirt;
    }

    public int getKnife() {
        return knife;
    }

    public void setKnife(int knife) {
        this.knife = knife;
    }

    public int getBoots() {
        return boots;
    }

    public void setBoots(int boots) {
        this.boots = boots;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMedicine() {
        return medicine;
    }

    public void setMedicine(int medicine) {
        this.medicine = medicine;
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.food;
        hash = 71 * hash + this.shirt;
        hash = 71 * hash + this.knife;
        hash = 71 * hash + this.boots;
        hash = 71 * hash + this.water;
        hash = 71 * hash + this.medicine;
        hash = 71 * hash + Objects.hashCode(this.back);
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
        final Sell other = (Sell) obj;
        if (this.food != other.food) {
            return false;
        }
        if (this.shirt != other.shirt) {
            return false;
        }
        if (this.knife != other.knife) {
            return false;
        }
        if (this.boots != other.boots) {
            return false;
        }
        if (this.water != other.water) {
            return false;
        }
        if (this.medicine != other.medicine) {
            return false;
        }
        if (!Objects.equals(this.back, other.back)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sell{" + "food=" + food + ", shirt=" + shirt + ", knife=" + knife + ", boots=" + boots + ", water=" + water + ", medicine=" + medicine + ", back=" + back + '}';
    }
    
    
}
