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
public class BuildTimeMachine implements Serializable {
    
    private String build;

    public BuildTimeMachine() {
        
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.build);
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
        final BuildTimeMachine other = (BuildTimeMachine) obj;
        if (!Objects.equals(this.build, other.build)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BuildTimeMachine{" + "build=" + build + '}';
    }
    
    
}
