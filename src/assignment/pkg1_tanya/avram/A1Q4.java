/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1_tanya.avram;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author anisoaraavram
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating new city called kitchener
        City kitchener = new City();
        
        //Creating wall
        new Wall (kitchener, 0, 1, Direction.WEST);
        new Wall (kitchener, 1, 1, Direction.WEST);
        new Wall (kitchener, 1, 1, Direction.SOUTH);
        
        //Creating first robot named bob
        Robot bob = new Robot (kitchener, 0, 0, Direction.SOUTH);
        
        //Creating second robot named karel
        Robot karel = new Robot (kitchener, 0, 1, Direction.SOUTH);
        
        //Move robot bob
        bob.move();
        bob.move();
        bob.turnLeft();
        bob.move();
        
        //Move robot karel
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        
    }
    
}
