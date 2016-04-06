/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.control;

import byui.cit260.desertescape.model.Game;
import byui.cit260.desertescape.model.Inventory;
import byui.cit260.desertescape.model.Item;
import byui.cit260.desertescape.model.Location;
import byui.cit260.desertescape.model.LocationType;
import byui.cit260.desertescape.model.Player;
import byui.cit260.desertescape.view.StartProgramView;
import byui.cit260.desertescape.view.menu.GameMenuView;
import desertescape.DesertEscape;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.accessibility.AccessibleRole;

/**
 *
 * @author Dallin Barlow
 */
public class ActionsController {

    //Gets the player's locationn to determine what functions it should run
    public static Inventory[] getLocation(Game game) {
        // gets the player's location by the location type
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        LocationType type = currentLocation.getType();

        //gets the players inventory to add or take away from it and pass it on
        // then updates the inventory after the actions have ran
        Inventory[] inventory = DesertEscape.getGame().getItems();

        // gets the attributes from the Item list
        List<Item> item = DesertEscape.getGame().getPlayer().getItems();

        inspect(inventory, item, type);

        //BASE
        if (type == (type.base)) {
            buildTimeMachine(inventory);

        } //SHOP
        else if (type == (type.shop)) {
            shOp(inventory, item);
        } //Alien Camp
        else if (type == (type.alienCamp)) {
            solveAlienPuzzle(inventory, item);
        } //Pyramid
        else if (type == (type.pyramaid)) {
            calcPyramid(inventory, item);
        } //Desert, alien campsite
        else {
            error();
        }

        return inventory;
    }

    //gets the players inventory to add or take away from it and pass it on
    // then updates the inventory after the actions have ran
    public static void inspect(Inventory[] inventory, List<Item> item, LocationType type) {

    }

    public static void buildTimeMachine(Inventory[] inventory) {
        int amount = inventory[2].getAmountInStock();
        String out = "";
        if (amount < 1) {
            out = "\n You do not have sufficient supplies to complete this"
                    + "\nReturn when you have gather adequate supplies.";

            System.out.println(out);
        }
        winnercircle(out);

    }

    public static void winnercircle(String out) {
        out = "\nYou have won and saved all of humanity."
                + "\nCongradulations! And thanks for playing";
        StartProgramView view = new StartProgramView();
        view.startProgram();
    }

    public static void calcPyramid(Inventory[] inventory, List<Item> item) {
        int amount = inventory[7].getAmountInStock();
        int fail = amount - 1;

        int good = inventory[5].getAmountInStock();
        int great = good + 1;
//finds a number between 1 and 3 to assign which puzzle to solve
        Random rand = null;
        int min = 1;
        int max = 2;
        int randomNum = rand.nextInt((max - min) + 1) + min;

        //Strings for the user to see
        String intro = "\n__________Pyramid Volume___________"
                + "\nSolve the Volume of the Pyramid to receive a "
                + "\nprize. Careful, only three guess till"
                + "\nyou lose a life.";
        String problem = "";
        String died = "\nYou have answered incorrectly three times,"
                + "\nthe trap suddenly springs and you lose a life,"
                + "\nbetter luck next time.";
        String correct = "\n That is the correct answer"
                + "\nFor finding the Pyramid volume a great"
                + "\ntreasure is given to you: The Royal Necklace";
        boolean gotItRight = false;

        System.out.println(intro);

        if (randomNum == 1) {
            do {
                for (int chances = 3; chances >= 0; chances--) {
                    if (chances == 0) {
                        inventory[7].setAmountInStock(fail);
                        System.out.println(died);
                        gotItRight = true;
                    }

                    problem = "\nFind the Volume from the"
                            + "\n given Dimensions:"
                            + "\n Height = 30 Width = 10 Length = 10";
                    System.out.println(problem);
                    Scanner keyboard = new Scanner(System.in);
                    int response = keyboard.nextInt();

                    if (response == 1000) {
                        inventory[5].setAmountInStock(great);
                        System.out.println(correct);
                        gotItRight = true;
                    }
                    System.out.println("Incorrect, only " + (chances - 1) + "chances left");
                }

            } while (gotItRight == false);

            GameMenuView g = new GameMenuView();
            g.display();
        } else if (randomNum == 2) {
            do {
                for (int chances = 3; chances >= 0; chances--) {
                    if (chances == 0) {
                        inventory[7].setAmountInStock(fail);
                        System.out.println(died);
                        gotItRight = true;
                    }

                    problem = "\nFind the Volume from the"
                            + "\n given Dimensions:"
                            + "\n Height = 10 Width = 3 Length = 5";
                    System.out.println(problem);
                    Scanner keyboard = new Scanner(System.in);
                    int response = keyboard.nextInt();

                    if (response == 50) {
                        inventory[5].setAmountInStock(great);
                        System.out.println(correct);
                        gotItRight = true;
                    }
                    System.out.println("Incorrect, only " + (chances - 1) + "chances left");
                }

            } while (gotItRight == false);

            GameMenuView g = new GameMenuView();
            g.display();
        } else {
            do {
                for (int chances = 3; chances >= 0; chances--) {
                    if (chances == 0) {
                        inventory[7].setAmountInStock(fail);
                        System.out.println(died);
                        gotItRight = true;
                    }

                    problem = "\nFind the Volume from the"
                            + "\n given Dimensions:"
                            + "\n Height = 10 Width = 6 Length = 5";
                    System.out.println(problem);
                    Scanner keyboard = new Scanner(System.in);
                    int response = keyboard.nextInt();

                    if (response == 100) {
                        inventory[5].setAmountInStock(great);
                        System.out.println(correct);
                        gotItRight = true;
                    }
                    System.out.println("Incorrect, only " + (chances - 1) + "chances left");
                }

            } while (gotItRight == false);

            GameMenuView g = new GameMenuView();
            g.display();
        }

    }

    public static void solveAlienPuzzle(Inventory[] inventory, List<Item> item) {
        int amount = inventory[7].getAmountInStock();
        int fail = amount - 1;

        int good = inventory[6].getAmountInStock();
        int great = good + 1;
        //finds a number between 1 and 3 to assign which puzzle to solve
        Random rand = null;
        int min = 1;
        int max = 2;
        int randomNum = rand.nextInt((max - min) + 1) + min;

        //Strings for the user to see
        String intro = "\n__________Alien Puzzle___________"
                + "\nSolve the Alien Puzzle to receive a "
                + "\nprize. Careful, only three guess till"
                + "\nyou lose a life.";
        String problem = "";
        String died = "\nYou have answered incorrectly three times,"
                + "\nthe trap suddenly springs and you lose a life,"
                + "\nbetter luck next time.";
        String correct = "\n That is the correct answer"
                + "\nFor solving the puzzle you came across"
                + "\nan Alien Artifact and added it to your Inventory.";
        boolean gotItRight = false;

        System.out.println(intro);

        if (randomNum == 1) {
            do {
                for (int chances = 3; chances >= 0; chances--) {
                    if (chances == 0) {
                        inventory[7].setAmountInStock(fail);
                        System.out.println(died);
                        gotItRight = true;
                    }

                    problem = "\nFind the pattern:"
                            + "\n 9, 12, 16, 21, 27, ___";
                    System.out.println(problem);
                    Scanner keyboard = new Scanner(System.in);
                    int response = keyboard.nextInt();

                    if (response == 34) {
                        inventory[6].setAmountInStock(great);
                        System.out.println(correct);
                        gotItRight = true;
                    }
                    System.out.println("Incorrect, only " + (chances - 1) + "chances left");
                }

            } while (gotItRight == false);

            GameMenuView g = new GameMenuView();
            g.display();
        } else if (randomNum == 2) {
            do {
                for (int chances = 3; chances >= 0; chances--) {
                    if (chances == 0) {
                        inventory[7].setAmountInStock(fail);
                        System.out.println(died);
                        gotItRight = true;
                    }

                    problem = "\nFind the pattern:"
                            + "\n 4, 8, 16, 32, 64, ___";
                    System.out.println(problem);
                    Scanner keyboard = new Scanner(System.in);
                    int response = keyboard.nextInt();

                    if (response == 128) {
                        inventory[6].setAmountInStock(great);
                        System.out.println(correct);
                        gotItRight = true;
                    }
                    System.out.println("Incorrect, only " + (chances - 1) + "chances left");
                }

            } while (gotItRight == false);

            GameMenuView g = new GameMenuView();
            g.display();
        } else {
            do {
                for (int chances = 3; chances >= 0; chances--) {
                    if (chances == 0) {
                        inventory[7].setAmountInStock(fail);
                        System.out.println(died);
                        gotItRight = true;
                    }

                    problem = "\nFind the pattern:"
                            + "\n 2, 22, 3, 33, 4, ___";
                    System.out.println(problem);
                    Scanner keyboard = new Scanner(System.in);
                    int response = keyboard.nextInt();

                    if (response == 44) {
                        inventory[6].setAmountInStock(great);
                        System.out.println(correct);
                        gotItRight = true;
                    }
                    System.out.println("Incorrect, only " + (chances - 1) + "chances left");
                }

            } while (gotItRight == false);

            GameMenuView g = new GameMenuView();
            g.display();
        }
    }

    public static void shOp(Inventory[] inventory, List<Item> item, char type) {
        String output = "\n You do not have sufficient"+
                 "\nitems to make that trade";
        int wallet = 0;
        int money = inventory[1].getAmountInStock();

        //All the money values in the game
        int $food = item.get(0).getWorth();
        int $boots = item.get(1).getWorth();
        int $ruby = item.get(3).getWorth();
        int $diamond = item.get(4).getWorth();
        int $necklace = item.get(5).getWorth();
        int $artifact = item.get(6).getWorth();
        int $schematic = item.get(8).getWorth();

        // all the values of how much you get for buying or selling
        int left = 0;
        int food = item.get(0).getAmountAdded();
        int boots = item.get(1).getAmountAdded();
        int ruby = item.get(3).getAmountAdded();
        int diamond = item.get(4).getAmountAdded();
        int necklace = item.get(5).getAmountAdded();
        int artifact = item.get(6).getAmountAdded();
        int schematic = item.get(8).getAmountAdded();
        
        if (type == 'F'){
            if(money < $food){
                System.out.println(output);
            }
            wallet = money - $food;
            inventory[1].setAmountInStock(wallet);
        }

               if(money < $food){

                System.out.println("\n*** Not valid ***  Please try again");
                break;
        }

    }

    private static void error() {
        String out = "\nThere are no actions to complete on this level"
                + "\n other than inspect.";

        System.out.println(out);
    }
}
