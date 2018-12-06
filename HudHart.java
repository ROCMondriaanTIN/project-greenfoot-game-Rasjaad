import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HudHart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HudHart extends Actor
{
    public static int leven = 2;
    
    
    /**
     * Act - do whatever the HudHart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       
       verliesLevens();
       
        
    }    
    
    public void verliesLevens()
    {
     
     if(leven==2)
     {
         setImage("hud_heartFull.png"); 
        }
        else if(leven==1)
        {
         setImage("hud_heartHalf.png");
        }
        else if(leven==0)
        {
         setImage("hud_heartEmpty.png");
         Music.bg1.stop();
         Music.bg2.stop();
         Music.bg3.stop();
         Music.bg4.stop();
         Greenfoot.setWorld(new Lose());
         leven += 2;
        }
       
        return;
    }
}
