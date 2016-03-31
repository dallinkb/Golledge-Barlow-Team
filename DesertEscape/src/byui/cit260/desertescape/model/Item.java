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
    private double amountAttained;
    private double counts;
    private double moneyworth;
    
    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmountAttained() {
        return amountAttained;
    }

    public void setAmountAttained(double amountAttained) {
        this.amountAttained = amountAttained;
    }

    public double getCounts() {
        return counts;
    }

    public void setCounts(double counts) {
        this.counts = counts;
    }

    public double getMoneyworth() {
        return moneyworth;
    }

    public void setMoneyworth(double moneyworth) {
        this.moneyworth = moneyworth;
    }
    
    
}
