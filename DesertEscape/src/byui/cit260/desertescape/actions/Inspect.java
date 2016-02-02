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
public class Inspect implements Serializable{
    
    private String continues;
    private String collect;
    private String leaveit;

    public Inspect() {
        
    }

    public String getContinues() {
        return continues;
    }

    public void setContinues(String continues) {
        this.continues = continues;
    }

    public String getCollect() {
        return collect;
    }

    public void setCollect(String collect) {
        this.collect = collect;
    }

    public String getLeaveit() {
        return leaveit;
    }

    public void setLeaveit(String leaveit) {
        this.leaveit = leaveit;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.continues);
        hash = 97 * hash + Objects.hashCode(this.collect);
        hash = 97 * hash + Objects.hashCode(this.leaveit);
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
        final Inspect other = (Inspect) obj;
        if (!Objects.equals(this.continues, other.continues)) {
            return false;
        }
        if (!Objects.equals(this.collect, other.collect)) {
            return false;
        }
        if (!Objects.equals(this.leaveit, other.leaveit)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inspect{" + "continues=" + continues + ", collect=" + collect + ", leaveit=" + leaveit + '}';
    }
    
    
}
