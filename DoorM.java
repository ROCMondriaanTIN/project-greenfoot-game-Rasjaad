import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoorM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoorM extends Tile
{
    /**
     * Act - do whatever the DoorM wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        touchVijand();
    }    
    public DoorM(String image, int width, int heigth) { super (image,width,heigth);}
    public void touchVijand(){
if (isTouching(Vijand.class)){
removeTouching(Vijand.class);
}
}
}
