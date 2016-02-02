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
public class Prologue implements Serializable{
    
    private String continues;
    private MainMenu mainmenu;

    public Prologue() {
        
    }
    

    public MainMenu getMainmenu() {
        return mainmenu;
    }

    public void setMainmenu(MainMenu mainmenu) {
        this.mainmenu = mainmenu;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.mainmenu);
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
        final Prologue other = (Prologue) obj;
        if (!Objects.equals(this.mainmenu, other.mainmenu)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Prologue{" + "mainmenu=" + mainmenu + '}';
    }
    
    
}
