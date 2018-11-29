import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoorMC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoorMC extends Tile
{
    /**
     * Act - do whatever the DoorMC wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
     public DoorMC(String image, int width, int heigth) { super (image,width,heigth);}
        public void touchVijand(){
if (isTouching(Vijand.class)){
removeTouching(Vijand.class);
}
}
}
