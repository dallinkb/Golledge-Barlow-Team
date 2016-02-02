/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.levels;

import byui.cit260.desertescape.actions.Buy;
import byui.cit260.desertescape.actions.Run;
import byui.cit260.desertescape.actions.Sell;
import byui.cit260.desertescape.menu.Pause;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Dallin Barlow
 */
public class Shop implements Serializable{
    
    private Run run;
    private Pause pause;
    private Buy buy;
    private Sell sell;

    public Shop() {
        
    }

    public Run getRun() {
        return run;
    }

    public void setRun(Run run) {
        this.run = run;
    }

    public Pause getPause() {
        return pause;
    }

    public void setPause(Pause pause) {
        this.pause = pause;
    }

    public Buy getBuy() {
        return buy;
    }

    public void setBuy(Buy buy) {
        this.buy = buy;
    }

    public Sell getSell() {
        return sell;
    }

    public void setSell(Sell sell) {
        this.sell = sell;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.run);
        hash = 59 * hash + Objects.hashCode(this.pause);
        hash = 59 * hash + Objects.hashCode(this.buy);
        hash = 59 * hash + Objects.hashCode(this.sell);
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
        final Shop other = (Shop) obj;
        if (!Objects.equals(this.run, other.run)) {
            return false;
        }
        if (!Objects.equals(this.pause, other.pause)) {
            return false;
        }
        if (!Objects.equals(this.buy, other.buy)) {
            return false;
        }
        if (!Objects.equals(this.sell, other.sell)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Shop{" + "run=" + run + ", pause=" + pause + ", buy=" + buy + ", sell=" + sell + '}';
    }
    
    
}
