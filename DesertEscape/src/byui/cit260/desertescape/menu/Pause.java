/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.menu;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Dallin Barlow
 */
public class Pause implements Serializable {
    
    private Map map;
    private MainMenu mainmenu;
    private Save save;
    private String back;
    List<Inventory> inventory;
    
    public Pause() {
        inventory = new ArrayList<>();
    }

    
    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public MainMenu getMainmenu() {
        return mainmenu;
    }

    public void setMainmenu(MainMenu mainmenu) {
        this.mainmenu = mainmenu;
    }

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.map);
        hash = 41 * hash + Objects.hashCode(this.mainmenu);
        hash = 41 * hash + Objects.hashCode(this.save);
        hash = 41 * hash + Objects.hashCode(this.back);
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
        final Pause other = (Pause) obj;
        if (!Objects.equals(this.back, other.back)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.mainmenu, other.mainmenu)) {
            return false;
        }
        if (!Objects.equals(this.save, other.save)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pause{" + "map=" + map + ", mainmenu=" + mainmenu + ", save=" + save + ", back=" + back + '}';
    }
    
    
}
