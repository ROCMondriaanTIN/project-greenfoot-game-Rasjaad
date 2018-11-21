
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    
    

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
        for (Actor EnemyAir : getIntersectingObjects(EnemyAir.class)) {
            if (EnemyAir != null) {
                setLocation(598, 432);
                
          return;
            }
        }
        for (Actor Enemy : getIntersectingObjects(Enemy.class))
        {
         if (Enemy != null)
         {
             setLocation(598, 432);

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
}
    boolean onGround()
    {
    Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Tile.class);
    return under != null;
    }
    
    
    public void handleInput() {
        int x = getX(), y = getY();
        if ((Greenfoot.isKeyDown("w")) && (onGround() == true)) {
            velocityY = -20;
            setImage("p1_jump.png"); 
            
        }
        if (Greenfoot.isKeyDown("s")){
            velocityY = 5;
            setImage("p1_duck.png"); 
        }

        if (Greenfoot.isKeyDown("a")) {
            velocityX = -5;
            setImage("p12.png");
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 5;
            setImage("p1.png");
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
            public boolean didBumpHead()
            {
               boolean bumpedHead = false;
                int imageWidth = getImage().getWidth();
             int imageHeight = getImage().getHeight();
             if (getOneObjectAtOffset(imageWidth / -2, imageHeight / 2, Platform.class) != null ||
             getOneObjectAtOffset(imageWidth / 2, imageHeight / 2, Platform.class) != null) 
             bumpedHead = true;
             
             return bumpedHead;
            }
}

    
  

