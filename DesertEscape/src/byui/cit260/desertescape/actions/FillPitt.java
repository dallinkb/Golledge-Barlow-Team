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
public class FillPitt implements Serializable{
    
    private String fill;

    public FillPitt() {
        
    }

    public String getFill() {
        return fill;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.fill);
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
        final FillPitt other = (FillPitt) obj;
        if (!Objects.equals(this.fill, other.fill)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FillPitt{" + "fill=" + fill + '}';
    }
    
}
