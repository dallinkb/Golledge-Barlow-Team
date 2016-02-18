/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.levels;

import byui.cit260.desertescape.actions.Inspect;
import byui.cit260.desertescape.actions.Run;
import byui.cit260.desertescape.menu.Pause;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Dallin Barlow
 */
public class Mountain implements Serializable {
    
    private Run run;
    private Inspect inspect;
    private Pause pause;

    public Mountain() {
        
    }
    

    public Run getRun() {
        return run;
    }

    public void setRun(Run run) {
        this.run = run;
    }

    public Inspect getInspect() {
        return inspect;
    }

    public void setInspect(Inspect inspect) {
        this.inspect = inspect;
    }

    public Pause getPause() {
        return pause;
    }

    public void setPause(Pause pause) {
        this.pause = pause;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.run);
        hash = 97 * hash + Objects.hashCode(this.inspect);
        hash = 97 * hash + Objects.hashCode(this.pause);
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
        final Mountain other = (Mountain) obj;
        if (!Objects.equals(this.run, other.run)) {
            return false;
        }
        if (!Objects.equals(this.inspect, other.inspect)) {
            return false;
        }
        if (!Objects.equals(this.pause, other.pause)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mountain{" + "run=" + run + ", inspect=" + inspect + ", pause=" + pause + '}';
    }
    
    
}