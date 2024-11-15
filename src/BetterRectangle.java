import java.awt.*;
/**
 * Title: BetterRectangle Program
 *
 * Description: The java.awt.Rectangle class of the standard Java library
 * does not supply a method to compute the area or perimeter
 * of a rectangle. Provide a subclass BetterRectangle of
 * the Rectangle class that has getPerimeter and getArea methods.
 */
public class BetterRectangle extends Rectangle {

    public BetterRectangle(int x, int y, int width, int height) {
        setLocation(x, y);
        setSize(width, height);
    }

    public double getArea() {
        return getWidth() * getHeight();
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }
}
