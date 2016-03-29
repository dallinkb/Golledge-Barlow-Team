/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.view.menu;

import byui.cit260.desertescape.view.View;
import java.util.Scanner;

/**
 *
 * @author Dallin Barlow
 */
public class NewGameView extends View {

    public NewGameView() {
        super("\n**************************************************************************************************************************"
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
                + "\nthat you have to save humanity from this terrible tragedy. You must find a way to get back to your time and tell the others about this.");
       
    }

    private final String menu
            = "\nC - Continue to Base and Start Game"
            + "\nM - Return to Main Menu";

    public void displayMenu() {
        char selection = ' ';

        //while loop will continue to show the help menu screen unless user inputs B
        while ('M' != selection) {
            //displays banner
            displayBanner();
            //displays user's choices for menu
            System.out.println(menu);

            //gets the input from the user
            String input = getInput();
            selection = input.charAt(0);

            //executes the action that was input by the user
            doAction(selection);
        }
    }

    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String input = null;
        boolean isValid = false;

        while (!isValid) {
            System.out.println("Please select an option:  ");
            input = keyboard.nextLine();
            input = input.trim();

            if (input == null || input.length() == 0) {
                System.out.println("Invalid input please input a correct character");
            } else {
                isValid = true;
            }
        }
        return input.toUpperCase();
    }

    public void doAction(char choice) {
        if (choice == 'C') {
            bAse();
        } else if (choice == 'M') {

        } else {
            System.out.println("\n*** Not valid ***  Please try again");
        }
    }

    private void bAse() {
        System.out.println("not yet implemented");
    }
}
