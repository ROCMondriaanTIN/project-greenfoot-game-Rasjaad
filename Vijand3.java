
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Vijand3 extends Mover {

    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;
    private final double gravity;
    private final double acc;
    private final double drag;
    private static boolean onPlatform = false;

    public Vijand3() {
        super();
        setImage("p2_stand.png");
        setImage("p2_jump.png");
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        walkRange = 20;
        firstAct = true;

        speed = 8;
    }

    @Override
    public void act() {
        int x = getX();
        int y = getY();
        velocityX *= drag;
        velocityY += acc;
        
        if (firstAct) {
            firstAct = false;
            xMin = x - walkRange / 2;
            xMax = x + walkRange / 2;
        }
        if (velocityY > gravity) {
            velocityY = gravity;
        }
      

        velocityX = speed;
        applyVelocity();
        if(getX() >= 625 && getX() <= 628 || 
        getX() >= 1251 && getX() <= 1254 || 
        getX() >= 1781 && getX() <= 1784 || getX() >= 2273 && getX() <= 2276 ||
         getX() >= 3083 && getX() <= 3086 || getX() >= 3439 && getX() <= 3442 || getX() >= 4447 && getX() <= 4450
         || getX() >= 5431 && getX() <= 5434
        ){
            setImage("p2_jump.png"); 
            velocityY = -18;
            
            
            

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
