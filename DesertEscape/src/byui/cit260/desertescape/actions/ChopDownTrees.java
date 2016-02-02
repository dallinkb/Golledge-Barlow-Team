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
public class ChopDownTrees implements Serializable {
     
    private String chop;

    public ChopDownTrees() {
        
    }

    public String getChop() {
        return chop;
    }

    public void setChop(String chop) {
        this.chop = chop;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.chop);
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
        final ChopDownTrees other = (ChopDownTrees) obj;
        if (!Objects.equals(this.chop, other.chop)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ChopDownTrees{" + "chop=" + chop + '}';
    }
    
                  
}
