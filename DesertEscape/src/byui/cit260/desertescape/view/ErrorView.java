/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertescape.view;

import desertescape.DesertEscape;
import java.io.PrintWriter;

/**
 *
 * @author Dallin Barlow
 */
public class ErrorView {
    private static final PrintWriter errorFile = DesertEscape.getOutFiles();
    private static final PrintWriter logFile = DesertEscape.getLogFiles();
    
    public static void display(String className, String errorMsg) {
        errorFile.println("***************************************" +
                "\nERROR: " + errorMsg +
                "\n*******************************************");
        
        logFile.println(className + " - " + errorMsg);
        logFile.flush();
    }
}
