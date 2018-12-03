import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WindowC2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WindowC2 extends Tile
{
    /**
     * Act - do whatever the WindowC2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        touchVijand3();
    }    
        public WindowC2(String image, int width, int heigth) { super (image,width,heigth);}
       public void touchVijand3(){
if (isTouching(Vijand3.class)){
removeTouching(Vijand3.class);
}
}
}
