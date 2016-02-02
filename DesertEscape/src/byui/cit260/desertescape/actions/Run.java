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
public class Run implements Serializable {
    
    private String proceed;
    private String returnback;

    public String getProceed() {
        return proceed;
    }

    public void setProceed(String proceed) {
        this.proceed = proceed;
    }

    public String getReturnback() {
        return returnback;
    }

    public void setReturnback(String returnback) {
        this.returnback = returnback;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.proceed);
        hash = 97 * hash + Objects.hashCode(this.returnback);
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
        final Run other = (Run) obj;
        if (!Objects.equals(this.proceed, other.proceed)) {
            return false;
        }
        if (!Objects.equals(this.returnback, other.returnback)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Run{" + "proceed=" + proceed + ", returnback=" + returnback + '}';
    }
    
    
}
