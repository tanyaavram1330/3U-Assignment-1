/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
 * @author anisoaraavram
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Creating new city called kitchener
        City kitchener = new City();  
        
        //Creating the left side section of the wall
        new Wall (kitchener, 3, 2, Direction.WEST);
        new Wall (kitchener, 2, 3, Direction.WEST);
        new Wall (kitchener, 1, 3, Direction.WEST);
        
        //Creating the right side section of the wall
        new Wall (kitchener, 1, 3, Direction.EAST);
        new Wall (kitchener, 2, 4, Direction.EAST);
        new Wall (kitchener, 3, 4, Direction.EAST);
        
        //Creating the bottom side of the wall
        new Wall (kitchener, 3, 2, Direction.SOUTH);
        new Wall (kitchener, 3, 3, Direction.SOUTH);
        new Wall (kitchener, 3, 4, Direction.SOUTH);
        
        //Creating the top side of the wall
        new Wall (kitchener, 3, 2, Direction.NORTH);
        new Wall (kitchener, 1, 3, Direction.NORTH);
        new Wall (kitchener, 2, 4, Direction.NORTH);
        
        //Creating the robot named bob
        Robot bob = new Robot (kitchener, 3, 0, Direction.EAST);
        
        //Creating the thing
        new Thing (kitchener, 3, 1);
        
        //Moving robot before moving thing.
        bob.move();
        
        //Picking up thing
        bob.pickThing();
        
        //Moving bob to the drop off
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.move();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        
        //Droping thing
        bob.putThing();
                
        //Moving bob again to the finish 
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.move();
        bob.turnLeft();
        

        
        
    }
    
}
