
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
    public static int Hero_width;
    public static int Hero_height;
    private GreenfootImage run1 = new GreenfootImage("p1_walk01.png");  
    
    
    private GreenfootImage run12 = new GreenfootImage("p1_walk012.png");
    private int frame = 1;

    public Hero() {
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
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor Water : getIntersectingObjects(Water.class)) {
            if (Water != null) {

            //    setLocation(598, 432);
                 
                 
                return;
            }
        }
        for (Actor Lava : getIntersectingObjects(Lava.class)) {
            if (Lava != null) {

            //    setLocation(598, 432);
                 
                 
                return;
            }
        }
        for (Actor DoorM : getIntersectingObjects(DoorM.class)) {
            if (DoorM != null) {

                Greenfoot.setWorld(new Level2());
                return;
            }
        }
        for (Actor DoorT : getIntersectingObjects(DoorT.class)) {
            if (DoorT != null) {

                Greenfoot.setWorld(new Level2());
                return;
            }
        }
        for (Actor DoorTC : getIntersectingObjects(DoorTC.class)) {
            if (DoorTC != null) {

                Greenfoot.setWorld(new Level4());
                return;
            }
        }
        for (Actor DoorMC : getIntersectingObjects(DoorMC.class)) {
            if (DoorMC != null) {

                Greenfoot.setWorld(new Level4());
                return;
            }
        }
        for (Actor Enemy : getIntersectingObjects(Enemy.class)) {
            if (Enemy != null) {

                setLocation(598, 432);
                return;
            }
        }
        for (Actor LadderT : getIntersectingObjects(LadderT.class)) {
            if (LadderT != null) {

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
            getWorld().showText("You won!", 500, 400);


        }
        
    }
    public void touchVijand2(){
        if (isTouching(Vijand2.class)){
            removeTouching(Vijand2.class);
            getWorld().showText("You won!", 500, 400);


        }
        
    }

    public void touchCollision()
    {
        if(isTouching(Platform.class)){
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

        }
        if (Greenfoot.isKeyDown("s")){
            velocityY = 5;
            setImage("p1_duck.png"); 
        }

        if (Greenfoot.isKeyDown("a")) {
            velocityX = -10;
            loopLinks();
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 10;
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
         getImage().scale(Hero_width, Hero_height);
    }
}
public void loopLinks()
    {
     if (frame == 12)
     {
         setImage(run12);
         getImage().scale(Hero_width, Hero_height);
    }
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

        return isOnGround;
    }

}
    


  
