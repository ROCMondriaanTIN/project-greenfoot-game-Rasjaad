
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Enemy extends Mover {

    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;

    public Enemy() {
        super();
        setImage("slimeWalk1.png");
        setImage("slimeWalk2.png");
        getImage().mirrorHorizontally();
        walkRange = 95;
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
            setImage("slimeWalk2.png");
        } else if (getX() <= xMin) {
            speed *= -1;
            x = xMin;
            getImage().mirrorHorizontally();
        }
    }
public void touchHero(){
if (isTouching(Hero.class)){
Greenfoot.delay(100);
getWorld().showText("You lose!", 500,400);
Greenfoot.delay(180);
getWorld().showText("", 500,400);



}
}
}
