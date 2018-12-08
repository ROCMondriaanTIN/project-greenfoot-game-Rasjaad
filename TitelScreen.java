import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitelScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitelScreen extends World
{
    /*
     * Made by Wild Pup Studios
     */
    public GreenfootSound bg = new GreenfootSound("Titlescreen.wav");
    /**
     * Constructor for objects of class TitelScreen.
     * 
     */
    public TitelScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false); 
        bg.playLoop();
        Greenfoot.start();
        setBackground("TitleScreen.png");
    }
    public void act() {
        if (Greenfoot.isKeyDown("space"))
        {
            bg.stop();
            
        }
        if (Greenfoot.isKeyDown("space")) Greenfoot.setWorld(new Level1());
        
    
    }
    public void stopped()
    {
        bg.setVolume(0);
    }
    public void started()
    {
        bg.setVolume(100);
    }
    
}
