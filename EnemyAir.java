
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class EnemyAir extends Mover {

    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;
    private int time = 0;

    public EnemyAir() {
        super();
        setImage("flyFly1.png");
        setImage("flyFly2.png");
        getImage().mirrorHorizontally();
        walkRange = 140;
        firstAct = true;
        
        speed = 1;
    }

    @Override
    public void act() {
        int x = getX();
        int y = getY();
        touchHero();
        if (firstAct) {
            firstAct = false;
            xMin = x - walkRange / 2;
            xMax = x + walkRange / 2;
        }

        velocityX = speed;
        applyVelocity();
        if (getX() >= xMax) {
            speed *= -1;
            x = xMax;
            setImage("flyFly2.png");
            time++;
            int delay = 8;
            if(time%delay==1)
            {
                setImage("flyFly1.png");
                getImage().mirrorHorizontally();
            }
            
        } else if (getX() <= xMin) {
            speed *= -1;
            x = xMin;
            setImage("flyFly2.png");
            time++;
            int delay = 8;
            if(time%delay==0)
            {
                setImage("flyFly1.png");
                getImage().mirrorHorizontally();
            }
            
        }
    }
public void touchHero(){
if (isTouching(Hero.class)){
removeTouching(Hero.class);
getWorld().showText("You lose!", 500,400);

}
}
}
