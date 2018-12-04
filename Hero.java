
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    private static boolean onPlatform = false;
    private static int Hero_width;
    public static int Hero_Height;
    
    
    //Kijkt naar rechts.
    private GreenfootImage run1 = new GreenfootImage("p1_walk01.png");
    private GreenfootImage run2 = new GreenfootImage("p1_walk02.png"); 
    private GreenfootImage run3 = new GreenfootImage("p1_walk03.png"); 
    private GreenfootImage run4 = new GreenfootImage("p1_walk04.png"); 
    private GreenfootImage run5 = new GreenfootImage("p1_walk05.png"); 
    private GreenfootImage run6 = new GreenfootImage("p1_walk06.png"); 
    private GreenfootImage run7 = new GreenfootImage("p1_walk07.png"); 
    private GreenfootImage run8 = new GreenfootImage("p1_walk08.png"); 
    private GreenfootImage run9 = new GreenfootImage("p1_walk09.png"); 
    private GreenfootImage run10 = new GreenfootImage("p1_walk10.png"); 
    private GreenfootImage run11 = new GreenfootImage("p1_walk11.png"); 
    
    //Kijkt naar links.
    private GreenfootImage run12 = new GreenfootImage("p1_walk01L.png");
    private GreenfootImage run13 = new GreenfootImage("p1_walk02L.png"); 
    private GreenfootImage run14 = new GreenfootImage("p1_walk03L.png"); 
    private GreenfootImage run15 = new GreenfootImage("p1_walk04L.png"); 
    private GreenfootImage run16 = new GreenfootImage("p1_walk05L.png"); 
    private GreenfootImage run17 = new GreenfootImage("p1_walk06L.png"); 
    private GreenfootImage run18 = new GreenfootImage("p1_walk07L.png"); 
    private GreenfootImage run19 = new GreenfootImage("p1_walk08L.png"); 
    private GreenfootImage run20 = new GreenfootImage("p1_walk09L.png"); 
    private GreenfootImage run21 = new GreenfootImage("p1_walk10L.png"); 
    private GreenfootImage run22 = new GreenfootImage("p1_walk11L.png"); 
    
    
    
    private int frame = 1;
    

    public Hero(int width, int height) {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        
        setImage("p1.png");
    }

    @Override
    public void act() {
        handleInput();
        velocityX *= drag;
        velocityY += acc;
        touchCollision();
        touchVijand();
        touchVijand2();
        touchVijand3();
        touchVijand4();
        
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor Water : getIntersectingObjects(Water.class)) {
            if (Water != null) {

                setLocation(598, 432);
                 
                 
                return;
            }
        }
        for (Actor Lava : getIntersectingObjects(Lava.class)) {
            if (Lava != null) {
                
                setLocation(175, 1406);
                 
                 
                return;
            }
        }
        for (Actor DoorM : getIntersectingObjects(DoorM.class)) {
            if (DoorM != null) {
                Music.bg1.stop();
                Greenfoot.setWorld(new Level2());
                return;
            }
        }
        for (Actor DoorT : getIntersectingObjects(DoorT.class)) {
            if (DoorT != null) {
                Music.bg1.stop();
                Greenfoot.setWorld(new Level2());
                return;
            }
        }
        for (Actor DoorTC : getIntersectingObjects(DoorTC.class)) {
            if (DoorTC != null) {
                Music.bg3.stop();
                Greenfoot.setWorld(new Level4());
                return;
            }
        }
        for (Actor DoorMC : getIntersectingObjects(DoorMC.class)) {
            if (DoorMC != null) {
                Music.bg3.stop();
                Greenfoot.setWorld(new Level4());
                return;
            }
        }
        for (Actor Enemy : getIntersectingObjects(Enemy.class)) {
            if (Enemy != null) {
                Music.bg1.stop();
                Music.bg2.stop();
                Music.bg3.stop();
                Music.bg4.stop();
                setLocation(598, 432);
                return;
            }
        }
        for (Actor LadderT : getIntersectingObjects(LadderT.class)) {
            if (LadderT != null) {
                Music.bg2.stop();
                Greenfoot.setWorld(new Level3());
                return;
            }
        }
        for (Actor Coin : getIntersectingObjects(Coin.class)) {
            if (Coin != null) {

                removeTouching(Coin.class);
                return;
            }
        }

    }
    boolean onGround()
    {
        if(onPlatform == true){
            onPlatform = false;
            return true;
        }
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Tile.class);
        return under != null;
    }
     public void touchVijand(){
        if (isTouching(Vijand.class)){
            removeTouching(Vijand.class);
            Greenfoot.setWorld(new YouWin());


        }
        
    }
    public void touchVijand2(){
        if (isTouching(Vijand2.class)){
            removeTouching(Vijand2.class);
            Greenfoot.setWorld(new YouWin());


        }
        
    }
    public void touchVijand3(){
        if (isTouching(Vijand3.class)){
            removeTouching(Vijand3.class);
            Greenfoot.setWorld(new YouWin());


        }
        
    }
    public void touchVijand4(){
        if (isTouching(Vijand4.class)){
            removeTouching(Vijand4.class);
            Greenfoot.setWorld(new YouWin());


        }
        
    }

    public void touchCollision()
    {
        if(isTouching(Platform.class)){
            setLocation(getX(), getY() - 15);  
            onPlatform = true;
        }
            else if(isTouching(PlatformC.class)){
            setLocation(getX(), getY() - 15);  
            onPlatform = true;
        }
        else{
            onPlatform = false;
        }

    }

    public void handleInput() {
        int x = getX(), y = getY();
        if ((Greenfoot.isKeyDown("w")) && (onGround() == true)) {
            velocityY = -15;
            setImage("p1_jump.png"); 
            Music.j.play();
            Music.j.setVolume(19);
            
            

        }
        if (Greenfoot.isKeyDown("s")){
            velocityY = 5;
            setImage("p1_duck.png"); 
        }

        if (Greenfoot.isKeyDown("a")) {
            velocityX = -10;
          //  Music.leftW.play();
          //  Greenfoot.playSound("LeftW.mp3");
            loopLinks();
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 10;
         //   Music.rightW.play();
        // Greenfoot.playSound("RightW.mp3");
            loopRechts();
        }
        if(Greenfoot.isKeyDown("l")){
            System.out.println(getX() + ", " + getY());
            Greenfoot.delay(10);
        }

    }
    public void loopRechts()
    {
     if (frame == 1)
     {
         setImage(run1);
     }
     else if (frame == 2)
     {
         setImage(run2);
     }
     else if (frame == 3)
     {
         setImage(run3);
     }
     else if (frame == 4)
     {
         setImage(run4);
     }
     else if (frame == 5)
     {
         setImage(run5);
     }
     else if (frame == 6)
     {
         setImage(run6);
     }
     else if (frame == 7)
     {
         setImage(run7);
     }
     else if (frame == 8)
     {
         setImage(run8);
     }
     else if (frame == 9)
     {
         setImage(run9);
     }
     else if (frame == 10)
     {
         setImage(run10);
     }
     else if (frame == 11)
     {
         setImage(run11);
     }
     else 
     {
         setImage("p1.png");
        }
        frame++;
        return;
}
 public void loopLinks()
    {
     if (frame == 12)
     {
         setImage(run12);
     }
     else if (frame == 13)
     {
         setImage(run13);
     }
     else if (frame == 14)
     {
         setImage(run14);
     }
     else if (frame == 15)
     {
         setImage(run15);
     }
     else if (frame == 16)
     {
         setImage(run16);
     }
     else if (frame == 17)
     {
         setImage(run17);
     }
     else if (frame == 18)
     {
         setImage(run18);
     }
     else if (frame == 19)
     {
         setImage(run19);
     }
     else if (frame == 20)
     {
         setImage(run20);
     }
     else if (frame == 21)
     {
         setImage(run21);
     }
     else if (frame == 22)
     {
         setImage(run22);
     }
     else 
     {
         setImage("p12.png");
        }
        frame++;
     return;
}

    public boolean isOnSolidGround()
    {
        boolean isOnGround = false;

        if (getY() > getWorld().getHeight() - 50) isOnGround = true;

        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        if (getOneObjectAtOffset(imageWidth / -2, imageHeight / 2, Platform.class) != null ||
        getOneObjectAtOffset(imageWidth / 2, imageHeight / 2, Platform.class) != null) 
            isOnGround = true;
            if (getOneObjectAtOffset(imageWidth / -2, imageHeight / 2, PlatformC.class) != null ||
        getOneObjectAtOffset(imageWidth / 2, imageHeight / 2, PlatformC.class) != null) 
            isOnGround = true;

        return isOnGround;
    }
    

}
    


  
