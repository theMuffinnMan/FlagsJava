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
        UI.setColor(Color.green); // sets pen to green
        UI.fillRect(0,0,200,500); //draws rectangle
        
        UI.setColor(Color.orange); // sets pen to orange
        UI.fillRect(400,0,200,500); //draws rectangle
    }
    
    // main function
    public static void main(String[] args){
        Ireland obj = new Ireland();
        obj.drawIreland();
    }
}
