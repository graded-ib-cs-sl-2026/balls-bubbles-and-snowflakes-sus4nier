
class Snowflake {
    // ONLY THE DRAW METHOD IS INCLUDED. YOU MUST FINISH THE REST.
    // instance variables that were previously mimssing, similar as ball.j
    private Sketch s;
    private float radius;
    private float x;
    private float y;
    private float xSpeed;
    private float ySpeed;
    private int fillColor;
    private int borderColor;
     // constructor
     public Snowflake(Sketch sketch) {
        s = sketch;
        radius = 15;
        x = 50;
        y = 500;
        xSpeed = 0;
        ySpeed = 1;
        fillColor = s.color(180, 180, 255);
        borderColor = s.color(0, 0, 0);
     }
     // constructor overload 
    public Snowflake(Sketch sketch, float d, float x, float y, float xspeed){
        this.s = sketch;
        this.radius = d;
        this.x = x;
        this.y = y;
        this.xSpeed = xspeed;
        this.ySpeed = 1;
        fillColor = s.color(180, 180, 255);
        borderColor = s.color(0, 0, 0);
    }
    // accessors for the radius, diameter, x, and y values 
    public float getRadius() {
        return radius;
    }

    public float getDiameter() {
        return radius * 2;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void draw() {
        s.line(x + radius, y, x - radius, y);
        s.line(x, y + radius, x, y - radius);
        s.line(x + radius * .707f, y + radius * .707f,
               x - radius * .707f, y - radius * .707f);
        s.line(x + radius * .707f, y - radius * .707f,
               x - radius * .707f, y + radius * .707f);
    }
    public void move() { // copied from bubble.j since it was missing // calculates how and where the object moves
        x = x + xSpeed;
        y = y + ySpeed;
        if (x > s.width - radius) {
            x = radius;
        } else if(x < radius) {
            x = s.width - radius;
        } else if (y > s.height - radius) {
            y = radius;
        } else if (y < radius) {
            y = s.height - radius;
        }
    }
}