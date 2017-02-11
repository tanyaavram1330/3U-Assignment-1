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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Creating new city called kitchener
        City kitchener = new City();
        
        //Creating the walls
        new Wall (kitchener, 2, 3, Direction.WEST);
        new Wall (kitchener, 2, 3, Direction.NORTH);
        new Wall (kitchener, 2, 3, Direction.EAST);
        new Wall (kitchener, 3, 3, Direction.EAST);
        new Wall (kitchener, 3, 3, Direction.SOUTH);
        
        //Creating robot maria
        Robot maria = new Robot (kitchener, 0, 1, Direction.WEST);
        
        //Creating robot karel
        Robot karel = new Robot (kitchener, 3, 3, Direction.EAST);
        
        //Creating all of the things that 'fell'
        new Thing (kitchener, 0, 0);
        new Thing (kitchener, 1, 0);
        new Thing (kitchener, 1, 1);
        new Thing (kitchener, 1, 2);
        new Thing (kitchener, 2, 2);
        
        //Making karel pick up things and move
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        
        //Making maria pick up things and move
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        
         }
}
