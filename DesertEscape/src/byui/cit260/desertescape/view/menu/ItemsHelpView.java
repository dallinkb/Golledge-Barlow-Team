/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.view.menu;

import java.util.Scanner;

/**
 *
 * @author Dallin Barlow
 */
public class ItemsHelpView {
    public void displayBanner(){
        String banner = "";
        banner= "\n*********************************************"
                +"\n__________________Items_____________________"
                +"\n this is a list of the items and what each  "
                +"\n  one does, as well as where to find them   ";
        System.out.println(banner);
    }
    private final String menu=
            "\nA - Map         |"+" K - Shovel            |"+" U - Slave Robe             |"+
            "\nB - Backpack    |"+" L - Flashlight        |"+" V - Camera                 |"+
            "\nC - Boots       |"+" M - Knife             |"+" W - Invisible Potion       |"+
            "\nD - Food        |"+" N - Ruby              |"+" X - Schematic Time Machine |"+
            "\nE - Leather     |"+" O - Diamond           |"+" Y - Schematic Jetpack      |"+" 6 - Lasergun"+
            "\nF - Metal       |"+" P - Royal necklace    |"+" 1 - Scematic Lasergun      |"+" 7 - Smelling Goggles"+
            "\nG - Money       |"+" Q - Dark Crystals     |"+" 2 - Laser Welder           |"+" 8 - Silver"+
            "\nH - Cloth       |"+" R - Code breaker      |"+" 3 - Plasma Cutter          |"+" 9 - Metal Detector"+
            "\nI - Pick        |"+" S - Armor             |"+" 4 - Time Machine           |"+
            "\nJ - Ax          |"+" T - Special Mushrooms |"+" 5 - Jetpack                |"+
            "\n                                       Z - Back to Help Menu                ";
    
    public void displayMenu(){
        char selection= ' ';
        
        //while loop will continue to show the help menu screen unless user inputs B
        while('Z' != selection){
            //displays banner
            displayBanner();
            //displays user's choices for menu
            System.out.println(menu);
            
            String input = getInput();
            selection = input.charAt(0);
            
            doAction(selection);
        }  
    }
    public void doAction(char input){
        String out = "";
        switch(input){
            case 'A':
                mAp(out);
                break;
            case 'B':
                backPack(out);
                break;
            case 'C':
                booTs(out);
                break;
            case 'D':
                foOd(out);
                break;
            case 'E':
                leaTher(out);
                break;
            case 'F':
                meTal(out);
                break;
            case 'G':
                moNey(out);
                break;
            case 'H':
                cloTh(out);
                break;
            case 'I':
                pick(out);
                break;
            case 'J':
                aX(out);
                break;
            case 'K':
                shoVel(out);
                break;
            case 'L':
                flashLight(out);
                break;
            case 'M':
                knIfe(out);
                break;
            case 'N':
                ruBy(out);
                break;
            case 'O':
                diamOnd(out);
                break;
            case 'P':
                royalNecklace(out);
                break;
            case 'Q':
                darkCrystal(out);
                break;
            case 'R':
                codeBreaker(out);
                break;
            case 'S':
                arMor(out);
                break;
            case 'T':
                specialMushrooms(out);
                break;
            case 'U':
                slaveRobe(out);
                break;
            case 'V':
                camera(out);
                break;
            case 'W':
                invisiblePotion(out);
                break;
            case 'X':
                schematicTimeMachine(out);
                break;
            case 'Y':
                schematicJetpack(out);
                break;
            case '1':
                schematicLasergun(out);
                break;
            case '2':
                laserWelder(out);
                break;
            case '3':
                plasmaCutter(out);
                break;
            case '4':
                timeMachine(out);
                break;
            case '5':
                jetPack(out);
                break;
            case '6':
                lasergun(out);
                break;
            case '7':
                smellingGoggles(out);
                break;
            case '8':
                silVer(out);
                break;
            case '9':
                metalDetector(out);
                break;
            case 'Z':
                break;
            default:
                System.out.println("\n*** Not valid ***  Please try again");
                break;
        }
    }
    public String getInput(){
        Scanner keyboard = new Scanner(System.in);
        String input = null;
        boolean isValid = false;
        
        while(!isValid){
            System.out.println("Please select an option:  ");
            input = keyboard.nextLine();
            input = input.trim();
            
            if (input == null || input.length() == 0) {
                System.out.println("Invalid input please input a correct character");
            } 
            else {
                isValid = true;
            }
        }
        return input.toUpperCase();
    }
    
    private void mAp(String out) {
        out =   "                             MAP                            "
                +"\nLevel:Base                  |   Items required: none   "
                +"\nBackpack Space:0 space      |   Action required: none  "
                +"\nDescription/Purpose: The map of the game is obtained the "
                +"\nfirst level. It will give a view of all the levels in the "
                +"\ngame. It can be accessed in the pause menu of the game. Also "
                +"\n   used to help calculate the fast  travel move option.";
                System.out.print(out);
    }

    private void backPack(String out) {
        out =   "                      BACKPACK                    "
                +"\nLevel Obtained:Base    |  Items required: none "
                +"\nBackpack Space:0 space |  Action required:none "
                +"\nDescription/Purpose:The backpack of the game is obtained the first"
                +"\nlevel. The backpack allows the player to carry items around to "
                +"\ncomplete tasks. Backpack only has ten spaces in it, items "
                +"\ntakes up a certain amount of space. It is not always "
                +"\n 1 item = 1 space, depending on the item it can be 5 = 1 space.";
                System.out.print(out);
    }
    private void booTs(String out) {
        out =   "                                  Boots"
                +"\nLevel:Base/Shop                  |  Items required:2 leather/40 Units "
                +"\nBackpack Space:2 boots = 1 space |  Action required:construct/buy "
                +"\nDescription/Purpose: Boots are needed to be able to be able"
                +"\nto move forward/backward. If the player doesn't have boots"
                +"\nand they attempt to move forward/backward they will lose a"
                +"\nlife. 1 pair of boots is good for 18 moves, then the player"
                +"\nneeds to have another pair of boots in the backpack. The"
                +"\nplayer can buy them or construct them at the base. No boot "
                +"\nno boot is lost when player uses fast travel.";
                System.out.print(out);
    }
    private void foOd(String out) {
        out =   "                                   FOOD"
                +"\nLevel Obtained:Base/Caves/Shop/Cliff |  Items required:none/10 units"
                +"\nBackpack Space:5 food = 1 space      |  Action required:inspect/buy"
                +"\nDescription/Purpose:Food is needed to move forward/backward."
                +"\nThe player will lose a life if they attempt to move without"
                +"\nfood. Each move the player loses 1 food, every 5 food takes"
                +"\nup 1 space in the backpack. Not required when player uses"
                +"\nthe fast travel option.";
                System.out.print(out);
    }
    private void leaTher(String out) {
        out =   "                                LEATHER"
                +"\nLevel Obtained:Base/Mountain       |  Items required:none "
                +"\nBackpack Space:1 leather = 1 space |  Action required:inspect "
                +"\nDescription/Purpose:Leather is used for making boots. Once "
                +"\nobtained the player will need to return to the base to "
                +"\nuse the leather to construct the boots.See boots for more "
                +"\ndetails on what is required to make boots.";
                System.out.print(out);
    }
    private void meTal(String out) {
        out =   "                                METAL"
                +"\nLevel Obtained:Cliffs/Desert      |  Items required:Pick+Metal Detector/Shovel+Metal Detector "
                +"\nBackpack Space:10 metal = 1 space |  Action required:inspect "
                +"\nDescription/Purpose:Metal is used to build many things at"
                +"\nbase. It is used to make the Jetpack, Lasergun, and Time"
                +"\nMachine. Each build project requires a different amount. ";
                System.out.print(out);
    }
    private void moNey(String out) {
        out =   "                                 MONEY/UNITS"
                +"\nLevel Obtained:All but Shop/Slave Camp |  Items required: none"
                +"\nBackpack Space:0                       |  Action required:inspect "
                +"\nDescription/Purpose:Money is very useful in the game, many of the items"
                +"\nthat need to be obtained require the user to spend money at the shop."
                +"\nNot all items are sold, but many are. Some items are only obtained"
                +"\nthrough actions and other items, others can be bought, other items"
                +"\nonly can be bought. The currency is called units in the game."
                +"\nplayer can hold an infinite amount of money in coin purse.";
                System.out.print(out);
    }

    private void cloTh(String out) {
        out =   "                                   Cloth                        "
                +"\nLevel Obtained:Slave Camp             |   Items required:none "
                +"\nBackpack Space:1 Cloth = 1 Space      |   Action required:inspect "
                +"\nDescription/Purpose:Cloth is used to make a slave robe. User"
                +"\nmust return to the base to make robe. This item cannot be bought or sold."
                +"\n";
                System.out.print(out);
    }

    private void pick(String out) {
        out =   "                                PICK                "
                +"\nLevel Obtained:Pyramid           |  Items required:none "
                +"\nBackpack Space:1 Pick = 1 space  |  Action required:inspect "
                +"\nDescription/Purpose:The pick is needed at other stages of the "
                +"\ngame to obtain items that can only be obtained with the pick. If"
                +"\nthe player finds another pick it can be sold for 20 units at the"
                +"\nshop.";
                System.out.print(out);
    }

    private void aX(String out) {
        out =   "                                AX"
                +"\nLevel Obtained:Slave Camp       |  Items required:none "
                +"\nBackpack Space:1 Ax= 1 space   |  Action required:inspect "
                +"\nDescription/Purpose:The ax is used for the action of chopping"
                +"\ndown a tree at the mountain level. If the player find another"
                +"\nAx, it can be sold for 20 units at the shop. Cannot buy at shop."
                +"\n"
                +"\n"
                +"\n";
                System.out.print(out);
    }
    private void shoVel(String out) {
        out =   "                               Shovel"
                +"\nLevel Obtained:Slave Camp          |  Items required:none "
                +"\nBackpack Space:1 Shovel = 1 space |  Action required:inspect "
                +"\nDescription/Purpose:The shovel is used to help fill in the pit"
                +"\nat the cliff level. Cannot buy at the shop. If the player finds"
                +"\nanother shovel, it can be sold for 20 units at the shop.";
                System.out.print(out);
    }
    private void flashLight(String out) {
        out =   "                                   FLASHLIGHT"
                +"\nLevel Obtained:Shop                    |  Items required:30 units "
                +"\nBackpack Space:1 Flashlight = 1 space |  Action required:Buy "
                +"\nDescription/Purpose:The flashlight is useful at levels such as"
                +"\nthe cave and pyramid in helping the user find treasures. Can"
                +"\nonly be bought, cannot sell.";
                System.out.print(out);
    }
    private void knIfe(String out) {
        out =   "                                  KNIFE"
                +"\nLevel Obtained:Alien Camp/Shop   |  Items required:Invisible Potion/85 units "
                +"\nBackpack Space:1 knife = 1 space |  Action required:Inspect/Buy "
                +"\nDescription/Purpose:Knife is useful for the player on every level."
                +"\nIt decreases the players chances of losing a life by +3. It can be bought,"
                +"\nit can be sold for 35 units.";
                System.out.print(out);
    }
    private void ruBy(String out) {
        out =   "                                  RUBY"
                +"\nLevel Obtained:Pyramid/Caves       |  Items required:Flashlight/Flashlight+Pick "
                +"\nBackpack Space:1 Ruby = 2 spaces  |  Action required:inspect "
                +"\nDescription/Purpose:The ruby is only good for selling. It allows"
                +"\nthe player to find a quicker way to achieve certain things in "
                +"\nthe game. 1 Ruby sells for 100 units. Cannot be bought or made, must be found.";
                System.out.print(out);
    }
    private void diamOnd(String out) {
        out =   "                           DIAMOND"
                +"\nLevel Obtained:Pyramid/Caves       |  Items required:Flashlight/Flashlight+Pick "
                +"\nBackpack Space:1 Diamond = 3 space |  Action required:inspect "
                +"\nDescription/Purpose:The Diamond is only good for selling. It allows"
                +"\nthe player to find a quicker way to achieve certain things in"
                +"\ngame. 1 Diamond sells for 150 units. Cannot be bought or made, must be found.";
                System.out.print(out);
    }
    private void royalNecklace(String out) {
        out =   "                        ROYAL NECKLACE"
                +"\nLevel Obtained:Pyramid               |  Items required:Code Breaker+Flashlight "
                +"\nBackpack Space:1 Necklace - 5 spaces |  Action required: translate hieroglyphics"
                +"\nDescription/Purpose:The Royal necklace comes from translating"
                +"\nthe hieroglyphics at the Pyramids. One Royal necklace sells"
                +"\nfor 1500 units at the shop. Cannot be bought or made, must be found.";
                System.out.print(out);
    }
    private void darkCrystal(String out) {
        out =   "                           DARK CRYSTAL"
                +"\nLevel Obtained:Alien Camp               |  Items required:Invisible Potion+Plasma Cutter "
                +"\nBackpack Space:1 Dark Crystal= 2 spaces |  Action required:Steal "
                +"\nDescription/Purpose:The Dark crystal helps power the time machine,"
                +"\nthe player will need it to help complete the time machine."
                +"\nThis item cannot be bought, if the player tries to sell this"
                +"\nitem, he will lose a life. Cannot be bought or made, must be found.";
                System.out.print(out);
    }
    private void codeBreaker(String out) {
        out =   "                                    CODE BREAKER"
                +"\nLevel Obtained:Slave Camp               |  Items required:Slave Robe "
                +"\nBackpack Space:1 Code Breaker = 1 Space |  Action required:Talk to Slave"
                +"\nDescription/Purpose:This is used to obtain the royal necklace. If"
                +"\naction to obtain the royal necklace is taken without the Code "
                +"\nBreaker, the player will lose a life. Cannot be bought, sold, or made, must be found.";
                System.out.print(out);
    }
    private void arMor(String out) {
        out =   "                            ARMOR"
                +"\nLevel Obtained:Shop  |   Items required:200 units "
                +"\nBackpack Space:0     |   Action required:Buy "
                +"\nDescription/Purpose:The armor provides the player with more"
                +"\n protection, and increase the players chances by 5 protection."
                +"Cannot be sold, found, or made, must be bought.";
                System.out.print(out);
    }
    private void specialMushrooms(String out) {
        out =   "                               SPECIAL MUSHROOMS"
                +"\nLevel Obtained:Mountain              |  Items required:Smelling Goggles "
                +"\nBackpack Space:2 Mushrooms = 1 space |  Action required:inspect "
                +"\nDescription/Purpose:Special mushrooms are used to make the"
                +"\n invisible potion. Cannot be bought, sold, or made, must be found.";
                System.out.print(out);
    }
    private void slaveRobe(String out) {
        out =   "                          SLAVE ROBE"+
                "\nLevel Obtained:base  |  Items required: 1 cloth "
                +"\nBackpack Space: 0   |  Action required: construct "
                +"\nDescription/Purpose:The slave robe is used to help the user"
                +"\n in talking to slaves in the slave camp to obtain certain"
                +"\nitems. If attempted without the slave robe, the player will"
                +"\nlose a life if they attempt to talk to the slaves.Cannot be"
                +"\nbought, sold, or made, must be found.";
                System.out.print(out);
    }
    private void camera(String out) {
        out =   "                                 CAMERA"+
                "\nLevel Obtained:Shop                |  Items required:75 units "
                +"\nBackpack Space:1 camera = 1 space |  Action required:Buy "
                +"\nDescription/Purpose: This item is used for taking a picture"
                +"\n of aliens. The player must take a picture of the aliens"
                +"\n in order to travel back to the past for proof. If the player"
                +"\n travels without the photo, game over. Take a photo at Alien"
                +"\nCamp.Cannot be sold, found, or sold, must be bought."
                +"\n";
                System.out.print(out);
    }
    private void invisiblePotion(String out) {
        out =   "                                INVISIBLE POTION"
                +"\nLevel Obtained:Shop/Base          |   Items required:500 units/4 mushrooms "
                +"\nBackpack Space:1 potion = 1 space |   Action required:Buy/Construct "
                +"\nDescription/Purpose:The invisible potion is used for taking "
                +"\na picture of the aliens and stealing the dark crystal both"
                +"\nthat are activities in the alien camp. Can be bought, or"
                +"\nmade in the base level. Cannot be found or sold, must be bought or made."
                +"\n"
                +"\n";
                System.out.print(out);
    }
    private void schematicTimeMachine(String out) {
        out =   "                           SCHEMATIC TIME MACHINE"
                +"\nLevel Obtained:Shop                   |  Items required: 1000 units "
                +"\nBackpack Space:1 Schematic = 1 space  |  Action required:buy "
                +"\nDescription/Purpose: The time machine schematic is necessary"
                +"\nfor the player to win the game. They must obtain the schematic"
                +"\nto build the time machine, if they attempt to build the time"
                +"\nmachine without it they will lose a life. Cannot be sold,"
                +"\nfound, or made.";
                System.out.print(out);
    }
    private void schematicJetpack(String out) {
        out =   "                        SCHEMATIC JET PACK"
                +"\nLevel Obtained:Shop                   |  Items required:200 units "
                +"\nBackpack Space:1 Schematic = 1 space  | Action required:Buy "
                +"\nDescription/Purpose:Used to construct Jetpack on base level."
                +"\nCannot be sold, found, or made, must be bought.";
                System.out.print(out);
    }
    private void schematicLasergun(String out) {
        out =   "                               SCHEMATIC LASER GUN"
                +"\nLevel Obtained:Shop                    |  Items required: 100 units"
                +"\nBackpack Space: 1 Schematic = 1 space  |  Action required:100 units "
                +"\nDescription/Purpose: Used to build a Laser gun on the base level."
                +"\nCannot be sold,found, or made, must be bought.";
                System.out.print(out);
    }
    private void laserWelder(String out) {
        out =   "                          LASER WELDER"
                +"\nLevel Obtained:Shop                |  Items required:150 units "
                +"\nBackpack Space:1 Welder = 4 space  |  Action required: Buy"
                +"\nDescription/Purpose:Needed to build anything at the base that"
                +"\nalso requires a schematic, time machine, jetpack, lasergun."
                +"\nCannot be sold, found, or made, must be bought.";
                System.out.print(out);
    }
    private void plasmaCutter(String out) {
        out =   "                           PLASMA CUTTER"
                +"\nLevel Obtained:Shop               |  Items required: 50 units"
                +"\nBackpack Space:1 Cutter = 1 space |  Action required:Buy "
                +"\nDescription/Purpose:Used to help steal a Dark Crystal. Must"
                +"\nhave inorder to not lose a life.Cannot be sold, found, or made,"
                +"\nmust be bought.";
                System.out.print(out);
    }
    private void timeMachine(String out) {
        out =   "                                   Time Machine"
                +"\nLevel Obtained:Base |   Items required:1 Schematic, 100 Metal, 30 Silver, 1 Laser Welder,3 Dark Crystals"
                +"\nBackpack Space:0    |   Action required:Build Time Machine "
                +"\nDescription/Purpose:Wins the game. If the player attempts"
                +"\nto build the time machine without all necessary items, they"
                +"\nwill lose a life.Cannot be bought, sold, or found, must be made.";
                System.out.print(out);
    }
    private void jetPack(String out) {
        out =   "                                  JET PACK"
                +"\nLevel Obtained:Base   |  Items required:1 Jetpack Schematic, 30 metal, 10 silver, 1 laser welder "
                +"\nBackpack Space:0      |  Action required:Build Jet Pack "
                +"\nDescription/Purpose: This will unlock the ability to fast"
                +"\ntravel when selecting move. Also helps the player not to need"
                +"\nfood or boots as much.Cannot be bought, sold, or found, must"
                +"\nbe made.";
                System.out.print(out);
    }
    private void lasergun(String out) {
        out =   "                               LASER GUN"
                +"\nLevel Obtained:Base  |  Items required:1 Lasergun Schematic, 20 metal, 1 laser welder "
                +"\nBackpack Space:0     |  Action required:Build Laser gun "
                +"\nDescription/Purpose:used to increase player's chances at each"
                +"\nlevel by 7. Cannot be bought, sold, or found, must be made.";
                System.out.print(out);
    }
    private void smellingGoggles(String out) {
        out =   "                         SMELLING GOGGLES"
                +"\nLevel Obtained:Shop                |   Items required: 70 units "
                +"\nBackpack Space:1 goggle = 1 space  |   Action required:Buy "
                +"\nDescription/Purpose:Used to find the special mushrooms. Cannot"
                +"\nbe sold, found, or made, must be bought.";
                System.out.print(out);
    }

    private void silVer(String out) {
        out =   "                                    SILVER"
                +"\nLevel Obtained:Cave                 |  Items required: 1 Metal Detector, 1 Flashlight "
                +"\nBackpack Space:5 silver = 1 space   |  Action required:inspect "
                +"\nDescription/Purpose:Used to build time machine, and jetpack. Can"
                +"\nbe sold 1 silver = 10 units. Cannot be bought or made. Must be found.";
                System.out.print(out);
    }

    private void metalDetector(String out) {
        out =   "                            METAL DETECTOR"
                +"\nLevel Obtained:Shop                  |   Items required: 50 units "
                +"\nBackpack Space:1 detector = 1 space  |   Action required:Buy "
                +"\nDescription/Purpose:Used to find silver and metal, must be paired"
                +"\nwith something else to find things. Cannot be sold, found, or made"
                +"\n must be bought.";
                System.out.print(out);
    }
    
}
