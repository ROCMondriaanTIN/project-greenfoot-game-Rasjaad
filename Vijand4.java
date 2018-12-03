
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Vijand4 extends Mover {

    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;
    private final double gravity;
    private final double acc;
    private final double drag;
    private static boolean onPlatform = false;

    public Vijand4() {
        super();
        setImage("p2_stand.png");
        
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
        if(getX() >= 729 && getX() <= 732 || 
        getX() >= 1537 && getX() <= 1540 ||
        getX() >= 3392 && getX() <= 3396 ||
        getX() >= 4552 && getX() <= 4556 || 
        getX() >= 5671 && getX() <= 5676 
         
        
        ){
            setImage("p2_jump.png"); 
            velocityY = -18;
            
            
            

        }
        else if (getX() >= 2003 && getX() <= 2006 ||
        getX() >= 2372 && getX() <= 2375 ||
        getX() >= 2790 && getX() <= 2796 ||
        getX() >= 3172 && getX() <= 3175 ||
        getX() >= 6183 && getX() <= 6186 ||
        getX() >= 7270 && getX() <= 7273 ||
        getX() >= 7298 && getX() <= 7300)
        {
            setImage("p2_jump.png");
            velocityY = -10;
        }
        else
        {
            setImage("p2_stand.png");
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
