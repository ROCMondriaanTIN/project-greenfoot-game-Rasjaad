import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitelScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitelScreen extends World
{

    /**
     * Constructor for objects of class TitelScreen.
     * 
     */
    public TitelScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false); 
        Greenfoot.start();
        setBackground("TitelScreen.png");
    }
    public void act() {
        if (Greenfoot.isKeyDown("space")) Greenfoot.setWorld(new Level1());
    
    }
}
