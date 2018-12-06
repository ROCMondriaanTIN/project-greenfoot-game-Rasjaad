
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Vijand2 extends Mover {

    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    public double speed;
    private final double gravity;
    private final double acc;
    private final double drag;
    private static boolean onPlatform = false;

    public Vijand2() {
        super();
        setImage("p2_stand.png");
        setImage("p2_jump.png");
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        walkRange = 20;
        firstAct = true;

        speed = 5;
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
        if(getX() >= 1192 && getX() <= 1197 || getX() >= 1586 && getX() <= 1588 || 
        getX() >= 2070 && getX() <= 2074 || 
        getX() >= 2611 && getX() <= 2617 || getX() >= 2721 && getX() <= 2725 ||
        getX() >= 2967 && getX() <= 2971 || getX() >= 3500 && getX() <= 3504 ||
        getX() >= 3563 && getX() <= 3566 || getX() >= 3789 && getX() <= 3793 ||
        getX() >= 5072 && getX() <= 5076 || getX() >= 5842 && getX() <= 5846 ||
        getX() >= 6205 && getX() <= 6207 || getX() >= 6510 && getX() <= 6514 
        ){
            setImage("p2_jump.png"); 
            velocityY = -18;
            
            
            

        }
        if(getX() >= 820 && getX() <= 825)
        {
            setImage("p2_jump.png");
            velocityY = -15;
            
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
