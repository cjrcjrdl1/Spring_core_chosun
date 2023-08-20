package hello.core.cannonball;

import java.awt.*;

public class Ball {
    Point location;
    double radius;
    Color color;

    public Ball(Point location, double radius, Color color) {
        this.location = location;
        this.radius = radius;
        this.color = color;
    }

    public double getX() {
        return location.getX();
    }

    public double getY() {
        return location.getY();
    }

    public double getRadius() {
        return radius;
    }

//    public Region getRegion() {
//        return new Region(location.getX() - radius, location.getY() - radius, 2 * radius, 2 * radius);
//    }
}
