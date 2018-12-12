
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
    public static int Vijand_width;
    public static int Vijand_Height;
    
    //Lopen
    private GreenfootImage run1 = new GreenfootImage("p2_walk01.png");
    private GreenfootImage run2 = new GreenfootImage("p2_walk02.png"); 
    private GreenfootImage run3 = new GreenfootImage("p2_walk03.png"); 
    private GreenfootImage run4 = new GreenfootImage("p2_walk04.png"); 
    private GreenfootImage run5 = new GreenfootImage("p2_walk05.png"); 
    private GreenfootImage run6 = new GreenfootImage("p2_walk06.png"); 
    private GreenfootImage run7 = new GreenfootImage("p2_walk07.png"); 
    private GreenfootImage run8 = new GreenfootImage("p2_walk08.png"); 
    private GreenfootImage run9 = new GreenfootImage("p2_walk09.png"); 
    private GreenfootImage run10 = new GreenfootImage("p2_walk10.png"); 
    private GreenfootImage run11 = new GreenfootImage("p2_walk11.png"); 

    private int frame = 1;

    public Vijand4(int width, int height) {
        super();
        setImage("p2_stand.png");
        
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        walkRange = 20;
        firstAct = true;
         this.Vijand_width = width;
        this.Vijand_Height = height;
        getImage().scale(width, height);
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
      
        loop();
        velocityX = speed;
        applyVelocity();
        if(getX() >= 729 && getX() <= 732 || 
        getX() >= 1054 && getX() <= 1058 || 
        getX() >= 1537 && getX() <= 1540 ||
        getX() >= 1947 && getX() <= 1951 ||
        getX() >= 2970 && getX() <= 2974 ||
        getX() >= 3392 && getX() <= 3396 ||
        getX() >= 4552 && getX() <= 4556 || 
        getX() >= 5671 && getX() <= 5676 ||
        getX() >= 6328 && getX() <= 6334 ||
        getX() >= 8840 && getX() <= 8844 
         
         
        
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
        getX() >= 7298 && getX() <= 7300 ||
        getX() >= 9870 && getX() <= 9874)
        {
            setImage("p2_jump.png");
            velocityY = -10;
        }
        else if (getX() >= 9510 && getX() <= 9514 )
        
        {
            setImage("p2_jump.png");
            velocityY = -20;
        }
        else if (getX() >= 9990 && getX() <= 9994 )
        
        {
            Greenfoot.setWorld(new Lose());
        }
        else
        {
            setImage("p2_stand.png");
        }
        
      
       
       
    }
      public void loop()
    {
        if (frame == 1)
        {
            setImage(run1);
            getImage().scale(Vijand_width, Vijand_Height);
        }
        else if (frame == 2)
        {
            setImage(run2);
            getImage().scale(Vijand_width, Vijand_Height);
        }
        else if (frame == 3)
        {
            setImage(run3);
            getImage().scale(Vijand_width, Vijand_Height);
        }
        else if (frame == 4)
        {
            setImage(run4);
            getImage().scale(Vijand_width, Vijand_Height);
        }
        else if (frame == 5)
        {
            setImage(run5);
            getImage().scale(Vijand_width, Vijand_Height);
        }
        else if (frame == 6)
        {
            setImage(run6);
            getImage().scale(Vijand_width, Vijand_Height);
        }
        else if (frame == 7)
        {
            setImage(run7);
            getImage().scale(Vijand_width, Vijand_Height);
        }
        else if (frame == 8)
        {
            setImage(run8);
            getImage().scale(Vijand_width, Vijand_Height);
        }
        else if (frame == 9)
        {
            setImage(run9);
            getImage().scale(Vijand_width, Vijand_Height);
        }
        else if (frame == 10)
        {
            setImage(run10);
            getImage().scale(Vijand_width, Vijand_Height);
        }
        else if (frame == 11)
        {
            setImage(run11);
            getImage().scale(Vijand_width, Vijand_Height);
            frame=0;
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

        return isOnGround;
    }
}
