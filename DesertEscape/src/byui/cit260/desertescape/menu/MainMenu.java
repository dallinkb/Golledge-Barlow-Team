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
public class MainMenu implements Serializable {
    private Prologue newgame;
    private Resume resumegame;
    private Options options;
    private String help;
    private String back;

    public MainMenu() {
        
    }

    
    public Prologue getNewgame() {
        return newgame;
    }

    public void setNewgame(Prologue newgame) {
        this.newgame = newgame;
    }

    public Resume getResumegame() {
        return resumegame;
    }

    public void setResumegame(Resume resumegame) {
        this.resumegame = resumegame;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.newgame);
        hash = 79 * hash + Objects.hashCode(this.resumegame);
        hash = 79 * hash + Objects.hashCode(this.options);
        hash = 79 * hash + Objects.hashCode(this.help);
        hash = 79 * hash + Objects.hashCode(this.back);
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
        final MainMenu other = (MainMenu) obj;
        if (!Objects.equals(this.help, other.help)) {
            return false;
        }
        if (!Objects.equals(this.back, other.back)) {
            return false;
        }
        if (!Objects.equals(this.newgame, other.newgame)) {
            return false;
        }
        if (!Objects.equals(this.resumegame, other.resumegame)) {
            return false;
        }
        if (!Objects.equals(this.options, other.options)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MainMenu{" + "newgame=" + newgame + ", resumegame=" + resumegame + ", options=" + options + ", help=" + help + ", back=" + back + '}';
    }
    
    
}
