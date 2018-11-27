import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LadderT here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LadderT extends Tile
{
    /**
     * Act - do whatever the Window wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        touchVijand2();
    }  
    public LadderT(String image, int width, int heigth) { super (image,width,heigth);}
          public void touchVijand2(){
if (isTouching(Vijand2.class)){
removeTouching(Vijand2.class);
}
}
}
