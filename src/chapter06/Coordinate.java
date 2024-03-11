package chapter06;

public class Coordinate {
    private double x = 0.0;
    private double y = 0.0;

    public Coordinate() {}

    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Coordinate(Coordinate c) {
        this(c.getX(), c.getY());
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    void set(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean equalTo(Coordinate c) {
        return x == c.getX() && y == c.getY();
    }

    public String toString() {
        return "{" + x + ", " + y + "}";
    }
}