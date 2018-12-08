import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crystal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crystal extends Mover
{
   public static int crystal = 2;
    /**
     * Act - do whatever the Crystal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
        applyVelocity();
        // Add your action code here.
        setImage("Crystal.png"); 
    }    
}
