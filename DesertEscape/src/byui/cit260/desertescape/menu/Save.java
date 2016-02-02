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
public class Save implements Serializable {
     
    private String savegame;

    public Save() {
        
    }

    public String getSavegame() {
        return savegame;
    }

    public void setSavegame(String savegame) {
        this.savegame = savegame;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.savegame);
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
        final Save other = (Save) obj;
        if (!Objects.equals(this.savegame, other.savegame)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Save{" + "savegame=" + savegame + '}';
    }
    
    
}
