

class Bubble {

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
    public Bubble(Sketch sketch) {
        s = sketch;
        radius = 20;
        x = 100;
        y = 100;
        xSpeed = 0;
        ySpeed = -1;
        fillColor = s.color(180, 180, 255);
        borderColor = s.color(0, 0, 0);
    }
    // constructor overload 
    public Bubble(Sketch sketch, float d, float x, float y, float xspeed){
        this.s = sketch;
        this.radius = d;
        this.x = x;
        this.y = y;
        this.xSpeed = xspeed;
        this.ySpeed = -1;
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
        s.stroke(borderColor);
        s.fill(fillColor);
        s.circle(x, y, radius*2);
    }
    // calculates how and where the object moves
    public void move() {
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