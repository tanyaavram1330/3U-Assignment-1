/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1_tanya.avram;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author avrat1330
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating a new city called kitchener
        
        City kitchener = new City();
        
        //Creating the top wall of the box
        new Wall (kitchener, 1, 1, Direction.NORTH);
        new Wall (kitchener, 1, 2, Direction.NORTH);
        
        //Creating the left side of the box
        new Wall (kitchener, 1, 1, Direction.WEST);
        new Wall (kitchener, 2, 1, Direction.WEST);
        
        //Creating the right side of the box
        new Wall (kitchener, 1, 2, Direction.EAST);
        new Wall (kitchener, 2, 2, Direction.EAST);
        
        //Creating the bottom side of the box
        new Wall (kitchener, 2, 2, Direction.SOUTH);
        new Wall (kitchener, 2, 1, Direction.SOUTH);
        
        //Creating the Robot called bob
        Robot bob = new Robot (kitchener 0, 0, Direction.WEST);
        
    }
}
