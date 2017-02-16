/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1_tanya.avram;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author avrat1330
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating new city called kitchener
        City kitchener = new City();

        //Creating the top sections of the wall
        new Wall(kitchener, 1, 2, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.NORTH);

        //Creating the Left side section of the wall
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.WEST);

        //Creating the RIght side of the wall
        new Wall(kitchener, 1, 2, Direction.EAST);

        //creating the bottom of the wall
        new Wall(kitchener, 2, 1, Direction.SOUTH);
        new Wall(kitchener, 1, 2, Direction.SOUTH);

        //Creating a robot named bob
        Robot bob = new Robot(kitchener, 1, 2, Direction.SOUTH);

        //Creating a circle thing
        new Thing(kitchener, 2, 2);

    }
}
