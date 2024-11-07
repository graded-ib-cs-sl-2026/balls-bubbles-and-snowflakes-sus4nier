import processing.core.PApplet;

public class Sketch extends PApplet {

    /** Represents the 4 different balls */
    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;
    private Bubble bub1;
    private Bubble bub2;
    private Bubble bub3;
    private Bubble bub4;
    private Snowflake sf1;
    private Snowflake sf2;
    private Snowflake sf3;
    private Snowflake sf4;

    /**
     * This method can only be used to change the window size. It runs before the
     * window is created.
     */
    public void settings() {
        size(500, 500);
    }

    /**
     * Runs once at the beginning of the program, after the window is created. Use
     * this to initialize the sketch.
     */
    public void setup() {
        ball1 = new Ball(this, 10, 10, 80, -6, 8); // constructor overload for Ball object
        ball1.setColors(color(35, 196, 145), 0); // color in RGB (Red, Green, Blue) format 
        ball2 = new Ball(this, 17, 50, 40, 7, 7);
        ball2.setColors(color(181, 27, 155), 0);
        ball3 = new Ball(this, 20, 100, 30, 7, -5);
        ball4 = new Ball(this);
        bub1 = new Bubble(this);
        bub2 = new Bubble(this, 20, 10, 50, -4); // constructor overload for Bubble object
        bub3 = new Bubble(this, 10, 30, 40, -3);
        bub4 = new Bubble(this, 15, 70, 30, -1);
        sf1 = new Snowflake(this);
        sf2 = new Snowflake(this, 20, 30, 40, 1); // constructor overload for Snowflake object
        sf3 = new Snowflake(this, 16, 40, 65, -1);
        sf4 = new Snowflake(this, 30, 70, 10, -2);

        
        
       

    }

    /**
     * This method runs over and over and over, approximately 60 times per second!
     * By moving objects a tiny bit each frame, you can get the appearance of
     * movement.
     */
    public void draw() {
        background(180, 180, 255);
        ball1.draw();
        ball1.move();
        ball2.draw();
        ball2.move();
        ball3.draw();
        ball3.move();
        ball4.draw();
        ball4.move();
        bub1.draw();
        bub1.move();
        bub2.draw();
        bub2.move();
        bub3.draw();
        bub3.move();
        bub4.draw();
        bub4.move();
        sf1.draw();
        sf1.move();
        sf2.draw();
        sf2.move();
        sf3.draw();
        sf3.move();
        sf4.draw();
        sf4.move();
        
    }

    /** All processing sketches have to use this main method. Don't touch this! */
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
