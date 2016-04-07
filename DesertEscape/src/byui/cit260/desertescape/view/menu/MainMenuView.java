/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.view.menu;

import byui.cit260.desertescape.control.ProgramController;
import byui.cit260.desertescape.view.View;
import byui.cit260.desertescape.view.menu.HelpMenuView;
import java.util.Scanner;
import desertescape.DesertEscape;

/**
 *
 * @author Dallin Barlow
 */
public class MainMenuView extends View {
    
    public MainMenuView(){
        super("\n"
            +"\n___________Desert Escape Main Menu__________"
            + "\nN = New Game"
            + "\nR = Resume Saved Game"
            + "\nO = Options"
            + "\nH = Help Menu"
            + "\nQ = Exit Game");
    }
    
    
    @Override
    public boolean doAction(String value){
        char input=value.charAt(0);
        
        switch (input) {
            case 'N': // Start a new game
                startNewGame();
                break;
            case 'R': // get and start an exiting game
                loadSavedGame();
                break;
            case 'O': // display the options menu
                displayOptionsMenu();
                break;
            case 'H': // help menu
                displayHelpMenu();
                break;
            case 'Q': // exit Menu
            default:
                System.out.println("\n*** Not valid ***  Please try again");
                break;
        }
        return false;
    }
    
    
    private void startNewGame() {
        
        
        String out ="\n**************************************************************************************************************************"
                + "\n_______________________________________________________New Game__________________________________________________________"
                + "\n has just woken up. You don't know what happened, why it's so glum. Suddenly you hear an something bark something at you."
                + "\nYou turn to see an alien, he puts a collar on you and turns it on. Suddenly his barking becomes understandable,"
                + "\nYou shouldn't be here, you need to get back to your group. He continues to put a chain on the collar and lead you away."
                + "\n"
                + "\nYou are put in a group of hungry looking people. What is going on? you ask one of them."
                + "\nWhat do you mean? he responds, This is where we bed down for the night, we have to get some sleep so that"
                + "\nwe are able to work hard tommorrow. If we don't the task master here will beat us bad, if we continue to not "
                + "\nperform to our duties they will throw us in the ring to fight to the death for their amusement."
                + "\n"
                + "\nBut why are their aliens here, where did they come from? Why are they here?"
                + "\nThey came to earth 20 years ago and attacked us.We would have won if we would have fought, but the people of earth decided "
                + "\nthat it would be better to try and befriend them. he responds,If we could go back and change that, we would have won the war,"
                + "\nbut they struck first, crippling our defenses. Now we build them weapons so that they can conquer other planets."
                + "\n"
                + "\nAs you climb into bed you realize that your collar is loose. You wait till eveyone is asleep, "
                + "\nand you sneak out to find a safe place."
                + "\n"
                + "\nYou steal a backpack, a map, food pouch, coin purse and a pair of boots. You find a place on the man"
                + "\nlabeled no one's land, you decide it to be safe so you go there and fall asleep. Then you wake up with the determination"
                + "\nthat you have to save humanity from this terrible tragedy. You must find a way to get back to your time and tell the others about this.";
       
        ProgramController.createNewGame(DesertEscape.getPlayer(),DesertEscape.getPlayer().getLives());
        
        System.out.print(out);
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void loadSavedGame() {
        System.out.println("Called Resume game - not implemented yet");
    }

    private void displayOptionsMenu() {
        OptionsView optionsView = new OptionsView();
        optionsView.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
}