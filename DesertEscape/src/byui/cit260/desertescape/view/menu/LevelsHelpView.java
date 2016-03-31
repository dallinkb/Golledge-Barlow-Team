/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.view.menu;

import byui.cit260.desertescape.view.View;
import desertescape.DesertEscape;
import java.util.Scanner;

/**
 *
 * @author Dallin Barlow
 */
public class LevelsHelpView extends View {
    
    public LevelsHelpView(){
        super("\n*********************************************"
                +"\n__________________Levels____________________"
                +"\n this is a list of the levels and what one  "
                +"\n can expect in each level, as well as how to"
                +"\n          prepare for each level.           "
                +"\nO - Overview"
                +"\nB - Base"
                +"\nD - Desert"
                +"\nP - Pyramid"
                +"\nS - Slave Camps"
                +"\nC - Caves"
                +"\nA - Alien Camp"
                +"\nL - Cliffs"
                +"\nH - Shop"
                +"\nM - Mountain"
                +"\nR - Return to Help Menu"
                +"                      OVERVIEW"
                +"\nEach level of the game is different from the items that the"
                +"\nplayer can obtain to the level's danger."
                +"\n"
                +"\nITEMS: Low Level Items are obtained from inspecting the area"
                +"\nwithout any other items. Medium Level Items are obtained when"
                +"\nthey are found inspecting the are with other items. High Level"
                +"\nItems are found when a level specific action is taken. These require"
                +"\nother items almost always. If attempted without the necessary items"
                +"\n the player will lose a life. When an item says + that is how much is"
                +"\nobtained of that item, when an items says - that is how much is used"
                +"\nof an item.|"
                +"\n"
                +"\nACTIONS: All levels but one have two basic actions: move and inspect."
                +"\nSome levels have specific actions associated with only that level. Each"
                +"\ntime an action is executed on the level, the danger calculator is ran."
                +"\nLevel specific actions often require certain items to execute, if they"
                +"\nare done without the item required the player will lose a life."
                +"\n"
                +"\nDANGER:The danger of the level is different depending on the level and"
                +"\ndifficulty the player has selected. Each time the level menu appears a"
                +"\ndanger calculator is ran. Example Desert on Medium is 1:20, so everytime"
                +"\nthe menu for Desert on medium appears after an action (inspect, or a move)"
                +"\nthe calculator is ran. Certain items in the game add to the player's chances."
                +"\nA laser gun can add + 7 turning the odds to be 1 in 27 rather than only 20."
                +"\nSo if a the player arrives at desert, the danger calculator will run once,"
                +"\nif the player inspects, it will run again, until the player leaves the level."
                +"\nOnly two levels don't have a danger factor. The player's first time on each level will "
                +"\nalways be 1/30 regardless of difficulty setting.|"
                +"                                                BASE"
                +"\nLow Level Items:+1 leather,+10 Money, +5 Food   |  Danger Easy:none"
                +"\nMedium Level Items: none                        |  Danger Medium: none"
                +"\nHigh Level Items:See Description                |  Danger Hard:none"
                +"\nItems Needed Medium:none                        |  Items Needed High:see description" 
                +"\nDESCRIPTION:1st level of the game, no danger regardless of setting."
                +"\nACTIONS:Run - Moving forward is desert, Moving Backward is Mountains (will lose"
                +"\na life if haven't completed the action on Mountain level).Moving forward/backward will"
                +"\n-1 food, -1 Boot count(see items help menu).|"
                +"\nInspect-Searches the area for items, list of items will change depending on"
                +"\nthe items that the player already has WITH him/her. Runs the Danger Calculator"
                +"\naccording to the level that the player is moving to.|"
                +"\nPause-Allows the player to see inventory, Save Game, View Inventory/Stats, exit "
                +"\nto the games main menu, and view the help menu. Will NOT run the Danger Calculator.|"
                +"\nMake something: allows the player to make: +1 boot=-2 leather;+1 invisible Potion=-4 Special Mushrooms;"
                +"\n+1 Slave Robe=-1 Cloth. If the player doesn't have the supplies to make item, game will let player know"
                +"\nthat he doesn't have the adequate supplies.|"
                +"\nBuild- allows the player to build an item:+1 Lasergun/-20 Metal,Lasergun Schematic,Laser Welder;"
                +"\n+1 Jetpack=-30 Metal,-10 Silver, Jetpack Schematic, Laser Welder;+1 Time Machine=-100 Metal,-30 Silver,"
                +"\n -3 Dark Crystals,Time Machine Scematic,Laser Welder. If the player attempts to build one of these things"
                +"\nwithout the required items, they will lose a life.|"
                +"\nDepository- Allows the player to store items and retrieve stored items. Allows the player"
                +"\nto be able to gather all the items necessary for completeing the game.|"
                +"                      PYRAMID"
                +"\nLow Level Items:+10 Money;+1 Pick       |  Danger Easy: 1/15"
                +"\nMedium Level Items:+1 Ruby;+1 Diamond   |  Danger Medium: 1/10"
                +"\nHigh Level Items:+1 Royal Necklace      |  Danger Hard: 1/5"
                +"\nItems Needed Medium:1 Flashlight        |  Items Needed High: -1 Code Breaker" 
                +"\nDescription:The third level of the game, the pyramids where the slaves work."
                +"\nThis level is rich in items that can be sold at the shop."
                +"\nACTIONS:Run-Moving Forward is Caves, Moving Backward is Desert"
                +"\nMoving forward/backward will -1 food, -1 Boot count(see items help menu)"
                +"\nand run Danger calculator according to the level that the player is moving to.|"
                +"\nInspect-Searches the area for items, list of items will change depending on"
                +"\nthe items that the player already has WITH him/her. Runs the Danger Calculator.|"
                +"\nPause-Allows the player to see inventory, Save Game, View Inventory/Stats, exit "
                +"\nto the games main menu, and view the help menu. Will NOT run the Danger Calculator.|"
                +"\nDecipher Code- The player enters the pyramid to obtain treasures, the code breaker"
                +"\nallows the player to know how to solve the puzzle. Without the code breaker, the player"
                +"\nwill lose a life. Runs the Danger Calculator.|"
                +"                                    SLAVE CAMP"
                +"\nLow Level Items:+1 Cloth;+1 Shovel;+1 Ax  |  Danger Easy:1/12"
                +"\nMedium Level Items:none                   |  Danger Medium:1/7"
                +"\nHigh Level Items:+1 Code Breaker          |  Danger Hard:1/3"
                +"\nItems Needed Medium:none                  |  Items Needed High:1 Slave Robe" 
                +"\nDescription:The dangerous fifth level, recommend obtaining protection to approach this level."
                +"\nIt does have items that are needed for later on in the game."
                +"\nACTIONS:Run-Moving Forward is Alien Camp, Moving Backward is Caves"
                +"\nMoving forward/backward will -1 food, -1 Boot count(see items help menu)"
                +"\nand run Danger calculator according to the level that the player is moving to.|"
                +"\nInspect-Searches the area for items, list of items will change depending on"
                +"\nthe items that the player already has WITH him/her. Runs the Danger Calculator.|"
                +"\nPause-Allows the player to see inventory, Save Game, View Inventory/Stats, exit "
                +"\nto the games main menu, and view the help menu. Will NOT run the Danger Calculator."
                +"\nTalk to Slaves-The player will do this to obtain a code breaker. Requires a slave robe,"
                +"\nif player attempts action without required items, they will lose a life. Runs the Danger Calculator|"
                +)"                                               CAVES"
                +"\nLow Level Items:+10 Money;+5 Food                                     |  Danger Easy:1/20"
                +"\nMedium Level Items:+5 Silver;+1 Ruby;+1 Diamond                       |  Danger Medium:1/15"
                +"\nHigh Level Items:none                                                 |  Danger Hard:1/10"
                +"\nItems Needed Medium:1 Metal Detector,1 Flashlight;1 Pick,1 Flashlight |  Items Needed High:none" 
                +"\nDescription:The fourth level of the game, no specific action is taken. But it is the only"
                +"\nlevel that the player can obtain Silver.|"
                +"\nACTIONS:Run-Moving Forward is , Moving Backward is "
                +"\nMoving forward/backward will -1 food, -1 Boot count(see items help menu)"
                +"\nand run Danger calculator according to the level that the player is moving to.|"
                +"\nInspect-Searches the area for items, list of items will change depending on"
                +"\nthe items that the player already has WITH him/her. Runs the Danger Calculator.|"
                +"\nPause-Allows the player to see inventory, Save Game, View Inventory/Stats, exit "
                +"\nto the games main menu, and view the help menu. Will NOT run the Danger Calculator.|"
                +"                                                ALIEN CAMP"
                +"\nLow Level Items:+30 money                  |  Danger Easy:1/10"
                +"\nMedium Level Items:+100 money              |  Danger Medium:1/5"
                +"\nHigh Level Items:+1 Dark Crystal;+1 Photo  |  Danger Hard:1/1"
                +"\nItems Needed Medium:-1 Invisible Potion    |  Items Needed High:-1 Invisible Potion,1 Plasma Cutter;"
                +"\n                                                                -1 Invisible Potion, 1 Camera;"
                +"\nDescription:The fifth and most dangerous level. This level has items and"
                +"\nactions that are required to win the game, but is very dangerous."
                +"\nIf on the hardest setting, the player will need items to help their chances.|"
                +"\nACTIONS:Run-Moving Forward is Cliffs, Moving Backward is Slave Camp."
                +"\nMoving forward/backward will -1 food, -1 Boot count(see items help menu)"
                +"\nand run Danger calculator according to the level that the player is moving to.|"
                +"\nInspect-Searches the area for items, list of items will change depending on"
                +"\nthe items that the player already has WITH him/her. Runs the Danger Calculator.|"
                +"\nPause-Allows the player to see inventory, Save Game, View Inventory/Stats, exit "
                +"\nto the games main menu, and view the help menu. Will NOT run the Danger Calculator.|"
                +"\nSteal-allows the player to steal dark crystals necessary to power the time machine."
                +"\nIf the player attempts action without required items, they will lose a life."
                +"\nRuns the Danger Calculator.|"
                +"\nTake a Photo- allows the player to snap a photo of the aliens. Must do this"
                +"\nin order to win the game. If the player attempts action without required items, they"
                +"\nwill lose a life.Runs the Danger Calculator.|"
                +"                                     CLIFFS"
                +"\nLow Level Items:+10 Units;+5 Food            |  Danger Easy:1/20"
                +"\nMedium Level Items+10 Metal                  |  Danger Medium:1/15"
                +"\nHigh Level Items:none                        |  Danger Hard:1/10"
                +"\nItems Needed Medium:1 Metal Detector,1 Pick  |  Items Needed High:1 Shovel" 
                +"\nDescription:The seventh level of the game, to be able to move forward from"
                +"\n this level the player must do the action fill in the pit, or they will lose a life.|"
                +"\nACTIONS:Run-Moving Forward is Shop, Moving Backward is Alien Camp."
                +"\nMoving forward/backward will -1 food, -1 Boot count(see items help menu)|"
                +"\nand run Danger calculator according to the level that the player is moving to.|"
                +"\nInspect-Searches the area for items, list of items will change depending on"
                +"\nthe items that the player already has WITH him/her. Runs the Danger Calculator.|"
                +"\nPause-Allows the player to see inventory, Save Game, View Inventory/Stats, exit "
                +"\nto the games main menu, and view the help menu. Will NOT run the Danger Calculator.|"
                +"\nFill in Pit: Must do this with the shovel. Must do this action to be able to move forward."
                +"\n If the action is attempted without the required items the player will lose a life.| "
                +"                      MOUNTAIN"
                +"\nLow Level Items:+10 Units;+1 Leather       |  Danger Easy:1/20"
                +"\nMedium Level Items:+2 Special Mushrooms    |  Danger Medium:1/15"
                +"\nHigh Level Items:none                      |  Danger Hard:1/10"
                +"\nItems Needed Medium:1 Smelling Goggles     |  Items Needed High:+1 Ax" 
                +"\nDescription:The last level of the game. Be sure to chop down a tree in"
                +"\norder to move forward.|"
                +"\nACTIONS:Run-Moving Forward is Base, Moving Backward is Shop"
                +"\nMoving forward/backward will -1 food, -1 Boot count(see items help menu)"
                +"\nand run Danger calculator according to the level that the player is moving to.|"
                +"\nInspect-Searches the area for items, list of items will change depending on"
                +"\nthe items that the player already has WITH him/her. Runs the Danger Calculator.|"
                +"\nPause-Allows the player to see inventory, Save Game, View Inventory/Stats, exit "
                +"\nto the games main menu, and view the help menu. Will NOT run the Danger Calculator.|"
                +"\nChop down Tree- The player must do this in order to proceed to move between the base"
                +"\nand the mountain. If they don't do this the player will lose a life. The player will"
                +"\nbe required to solve some math problem to complete the action. Runs the Danger calculator.|"
                +"                      "
                +"\nLow Level Items:+10 Units;                               |  Danger Easy:1/25"
                +"\nMedium Level Items:+20 units                             |  Danger Medium:1/20"
                +"\nHigh Level Items:none                                    |  Danger Hard:1/15"
                +"\nItems Needed Medium:1 Shovel;1 Metal Detector,1 shovel   |  Items Needed High:" 
                +"\nDescription:The second level of the game.|"
                +"\nACTIONS:Run-Moving Forward is Pyramid, Moving Backward is Base"
                +"\nMoving forward/backward will -1 food, -1 Boot count(see items help menu)"
                +"\nand run Danger calculator according to the level that the player is moving to.|"
                +"\nInspect-Searches the area for items, list of items will change depending on"
                +"\nthe items that the player already has WITH him/her. Runs the Danger Calculator.|"
                +"\nPause-Allows the player to see inventory, Save Game, View Inventory/Stats, exit "
                +"\nto the games main menu, and view the help menu. Will NOT run the Danger Calculator.|");
    }
   
    
    public boolean doAction(String value) {
        char input=value.charAt(0);
        switch (input) {
            case 'I':
                insPect();
                break;
            case 'A':
                completeAction();
                break;
            case 'N':
                moveNorth();
                break;
            case 'S':
                moveSouth();
                break;
            case 'E':
                moveEast();
                break;
            case 'W':
                moveWest();
                break;
            case 'M':
                viewMap();
                break;
            case 'V':
                viewInventory();
                break;
            case 'G':
                saveGame();
                break;
            case 'Q':
                break;
            default:
                System.out.println("\n*** Not valid ***  Please try again");
                break;
        }
        return false;
    }

    private void insPect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveNorth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveSouth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveEast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveWest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewMap() {
        System.out.println(DesertEscape.getGame().getMap().getMapString());
    }

    private void viewInventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void saveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void completeAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
    
   