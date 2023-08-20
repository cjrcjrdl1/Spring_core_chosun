package hello.core.cannonball;

import java.awt.*;

public class Region extends Rectangle {

    public Region(double x, double y, double width, double height) {
        super((int)x, (int)y, (int)width, (int) height);
    }

    public boolean isCollision(Region region) {
        return intersects(region); //교집합
    }

    public Region getIntersection(Region region) {
        Rectangle rect = intersection(region);

        return new Region(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
    }

}
