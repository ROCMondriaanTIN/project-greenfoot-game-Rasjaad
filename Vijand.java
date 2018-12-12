
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
    public Vijand(int width, int height) {
        super();
        setImage("p2_jump.png");
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
        Jump1();
        
       
    }
    public void Jump1()
        {
            if(getX() >= 1586 && getX() <= 1588 || 
        getX() >= 2070 && getX() <= 2074 || 
        getX() >= 2611 && getX() <= 2617 || getX() >= 2967 && getX() <= 2971 ||
        getX() >= 4308 && getX() <= 4312 || getX() >= 4656 && getX() <= 4660 ||
        getX() >= 4929 && getX() <= 4933 || getX() >= 5346 && getX() <= 5350
        ){
            setImage("p2_jump.png"); 
            velocityY = -18;
            
            
            

        }
         if(getX() >= 1158 && getX() <= 1162 
        ){
            setImage("p2_jump.png"); 
            velocityY = -20;
            
            
            

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
