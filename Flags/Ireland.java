/*
 * code for flag GUI
 */

import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/**
 * creates flag of ireland in the GUI
 * 
 * @fleur
 * @21/3/2025
 */
public class Ireland
{

    /**
     * Constructor for objects of class ireland
     */
    public Ireland()
    {
        UI.initialise();
        UI.addButton("Quit", UI::quit);
    }

    // draws the flag of ireland
    private void drawIreland(){
        UI.setColor(Color.orange); // sets pen to orange
        UI.fillRect(0,0,20,60); //draws rectangle
        
        UI.setColor(Color.green); // sets pen to green
        UI.fillRect(40,0,20,60); //draws rectangle
    }
    
    public static void main(String[] args){
        Ireland obj = new Ireland();
        obj.drawIreland();
    }
}
