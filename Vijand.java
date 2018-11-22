
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Vijand extends Mover {

    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;
    private final double gravity;
    private final double acc;
    private final double drag;
    private static boolean onPlatform = false;

    public Vijand() {
        super();
        setImage("p2_stand.png");
        //setImage("Vijand2.png");
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
        touchVijand();
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
        if(getX() >= 1160 && getX() <= 1165 || getX() >= 1586 && getX() <= 1588 || 
        getX() >= 2070 && getX() <= 2074 || 
        getX() >= 2611 && getX() <= 2617 || getX() >= 2967 && getX() <= 2971
        ){
            velocityY = -18;
            
            
            

        }
        /*if(getY() >= 446 && getY() <= 445 )
        {
            velocityX = -2;
        }*/
       
    }

    public void touchVijand(){
        if (isTouching(Hero.class)){
            removeTouching(Vijand.class);


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
