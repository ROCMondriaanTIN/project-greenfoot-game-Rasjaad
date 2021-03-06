import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * @author R. Springer
 */
public class Level3 extends World {

    private CollisionEngine ce;

    /**
     * Constructor for objects of class Level2.
     *
     */
    public Level3() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false);
        Music.bg3.playLoop();
        this.setBackground("bg3.jpg");

        int[][] map = {
           {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,49,49,-1,-1,49,49,49,49,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,72,43,43,49,49,43,43,43,43,43,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,55,55,55,55,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,73,43,43,43,43,43,43,43,43,43,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,55,55,55,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,55,55,55,55,52,52,52,52,55,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,55,55,55,55,55,55,55,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,43,43,43,43,43,43,43,43,43,43,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,55,55,55,55,-1,-1,-1,-1,-1,55,52,52,52,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,16,52,52,52,52,52,52,52,52,56,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,55,55,52,52,52,52,52,52,52,55,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,67,43,43,43,43,43,43,43,43,43,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,55,55,55,55,52,52,52,52,55,55,-1,-1,55,52,16,16,52,55,-1,-1,-1,-1,-1,-1,-1,1,1,-1,-1,-1,-1,16,52,52,52,52,52,52,52,52,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,54,55,52,52,52,52,52,52,52,52,52,52,55,55,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,68,43,43,43,43,43,43,43,43,43,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,55,55,52,52,52,52,52,52,52,52,52,52,55,55,16,16,16,16,16,16,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,16,16,52,52,52,52,52,52,52,-1,-1,-1,-1,-1,-1,0,1,-1,-1,-1,-1,52,52,52,52,52,52,52,52,52,52,52,52,52,52,55,55,55,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,55,55,55,55,-1,-1,-1,-1,-1,55,55,55,43,43,43,43,43,43,43,43,43,43,-1,-1,-1,-1,-1,-1,-1},
{-1,55,52,52,52,52,52,52,52,52,52,52,52,52,16,16,16,16,16,16,16,16,11,11,11,11,11,11,11,11,11,11,11,11,11,16,16,16,16,16,52,52,52,52,11,11,11,11,11,11,11,11,11,11,11,11,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,55,55,-1,-1,-1,-1,-1,-1,-1,-1,52,52,52,52,55,55,-1,-1,-1,52,52,52,43,43,43,43,43,43,43,43,43,43,-1,-1,-1,-1,-1,-1,-1},
{-1,52,52,52,52,52,52,52,52,52,52,52,52,52,16,16,16,16,16,16,16,16,10,10,10,10,10,10,10,10,10,10,10,10,10,16,16,16,16,16,52,52,52,52,10,10,10,10,10,10,10,10,10,10,10,10,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,11,11,11,11,11,11,11,11,52,52,52,52,52,52,55,55,55,52,52,52,43,43,43,43,43,43,43,43,43,43,-1,-1,-1,-1,-1,-1,-1},
{-1,52,52,52,52,52,52,52,52,52,52,52,52,52,16,16,16,16,16,16,16,16,10,10,10,10,10,10,10,10,10,10,10,10,10,16,16,16,16,16,52,52,52,52,10,10,10,10,10,10,10,10,10,10,10,10,16,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,52,10,10,10,10,10,10,10,10,52,52,52,52,52,52,52,52,52,52,52,52,43,43,43,43,43,43,43,43,43,43,-1,-1,-1,-1,-1,-1,-1},
{62,52,52,52,52,52,52,52,52,52,52,52,52,52,16,16,16,16,16,16,16,16,10,10,10,10,10,10,10,10,10,10,10,10,10,16,16,16,16,16,52,52,52,52,10,10,10,10,10,10,10,10,10,10,10,10,16,52,52,16,16,52,52,52,52,52,52,52,52,52,52,52,52,52,52,10,10,10,10,10,10,10,10,52,52,52,52,52,52,52,52,52,52,52,52,16,43,43,43,43,43,43,43,43,43,-1,-1,-1,-1,-1,-1,-1},
{61,52,52,52,52,52,52,52,52,52,52,52,52,52,16,16,16,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,16,16,16,16,16,52,52,52,52,10,10,10,10,10,10,10,10,10,10,10,10,16,52,52,16,16,52,52,52,52,52,52,52,52,52,52,52,52,52,52,10,10,10,10,10,10,10,10,52,52,52,52,52,52,52,52,52,52,52,52,16,16,43,43,43,43,43,43,43,43,-1,-1,-1,-1,-1,-1,-1},
{61,52,52,52,52,52,52,52,52,52,52,52,52,52,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,16,16,16,16,16,52,52,52,52,10,10,10,10,10,10,10,10,10,10,10,10,16,52,52,16,16,52,52,52,52,52,52,52,52,52,52,52,52,52,52,10,10,10,10,10,10,10,10,52,52,52,52,52,52,52,52,52,52,52,52,16,16,16,43,43,43,43,43,43,43,-1,-1,-1,-1,-1,-1,-1},
{61,52,52,52,52,52,52,52,52,52,52,52,52,52,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,16,16,16,16,16,52,52,52,52,10,10,10,10,10,10,10,10,10,10,10,10,16,52,52,16,16,52,52,52,52,52,52,52,52,52,52,52,52,52,52,10,10,10,10,10,10,10,10,52,52,52,52,52,52,52,52,52,52,52,52,16,16,16,16,43,43,43,43,43,43,-1,-1,-1,-1,-1,-1,-1},
{16,52,52,52,52,52,52,52,52,52,52,52,52,52,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,16,16,16,16,16,52,52,52,52,10,10,10,10,10,10,10,10,10,10,10,10,16,52,52,16,16,16,52,52,52,52,52,52,52,52,52,52,52,52,52,10,10,10,10,10,10,10,10,52,52,52,52,52,52,52,52,52,52,52,16,16,16,16,16,52,43,43,43,43,43,-1,-1,-1,-1,-1,-1,-1},
{16,52,52,52,52,52,52,52,52,52,52,52,52,52,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,16,16,16,16,52,52,52,52,52,10,10,10,10,10,10,10,10,10,10,10,10,16,16,16,16,16,16,52,52,52,52,52,52,52,52,52,52,52,52,52,10,10,10,10,10,10,10,10,52,52,52,52,52,52,52,52,52,52,52,16,16,16,16,16,52,52,43,43,43,43,-1,-1,-1,-1,-1,-1,-1},
{16,52,52,52,52,52,52,52,52,52,52,52,52,52,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,52,52,52,52,52,52,52,52,52,52,52,52,52,10,10,10,10,10,10,10,10,52,52,52,52,52,52,52,52,52,52,52,52,16,16,16,16,52,52,52,43,43,43,-1,-1,-1,-1,-1,-1,-1},
{16,52,52,52,52,52,52,52,52,52,52,52,52,52,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,52,52,52,52,52,52,52,52,52,52,52,52,52,16,16,16,16,16,16,16,16,16,52,52,52,52,52,52,52,52,52,52,52,16,16,16,16,52,52,52,52,43,43,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},

            };
        // Declareren en initialiseren van de TileEngine klasse om de map aan de world toe te voegen
        TileEngine te = new TileEngine(this, 60, 60, map);
        // Declarenre en initialiseren van de camera klasse met de TileEngine klasse 
        // zodat de camera weet welke tiles allemaal moeten meebewegen met de camera
        Camera camera = new Camera(te);
        // Declareren en initialiseren van een main karakter van het spel mijne heet Hero. Deze klasse 
        // moet de klasse Mover extenden voor de camera om te werken
        Hero hero = new Hero(47, 66);
        Vijand3 v3 = new Vijand3(66, 92);
        // Laat de camera een object volgen. Die moet een Mover instatie zijn of een extentie hiervan.
        camera.follow(hero);
        
        // Alle objecten toevoegen aan de wereld: camera, main karakter en mogelijke enemies
        addObject(camera, 0, 0);
        addObject(hero, 327, 386);
        addObject(new Platform(), 1500, 357);
        addObject(new Platform(), 1930, 327);
        addObject(new Platform(), 2880, 277);
        addObject(new Platform(), 3200, 277);
        addObject(new Platform(), 4671, 427);
        addObject(new Crystal(), 612, 325);
        addObject(new Crystal(), 2181, 265);
        addObject(new Star(), 5049, 442);
     
         addObject(v3, 529, 329);

        // Force act zodat de camera op de juist plek staat.
        camera.act();
        hero.act();
   
   
   
        // Initialiseren van de CollisionEngine zodat de speler niet door de tile heen kan lopen.
        // De collision engine kijkt alleen naar de tiles die de variabele solid op true hebben staan.
        ce = new CollisionEngine(te, camera);
        // Toevoegen van de mover instantie of een extentie hiervan
        ce.addCollidingMover(hero);
        ce.addCollidingMover(v3);
        prepare();
    }

    @Override
    public void act() {
        ce.update();
    }
    public void stopped()
    {
        Music.bg3.setVolume(0);
    }
    public void started()
    {
        Music.bg3.setVolume(25);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        HudHart hart = new HudHart();
        addObject(hart,473,30);
        Hud3 h3 = new Hud3();
        addObject(h3,973,29);
    }
}
