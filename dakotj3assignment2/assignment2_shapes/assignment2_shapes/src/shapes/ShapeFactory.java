package shapes;

/**
 * Factory class for building shape instances.
 *
 * @author Dakota Johnson
 * @version Autumn 2026
 */
public final class ShapeFactory {

    /**
     * Private constructor to prevent instantiation of the factory utility class.
     */
    private ShapeFactory() {
        // Utility class
    }

    /**
     * Creates and returns a new Circle with the specified radius.
     *
     * @param theRadius the radius of the circle
     * @return a new Circle instance
     */
    public static Circle createCircle(final double theRadius) {
        return new Circle(theRadius);
    }

    /**
     * Creates and returns a new Square with the specified side length.
     *
     * @param theSideLength the side length of the square
     * @return a new Square instance
     */
    public static Square createSquare(final double theSideLength) {
        return new Square(theSideLength);
    }

    /**
     * Creates and returns a new Triangle with the specified base and height.
     *
     * @param theBase   the base of the triangle
     * @param theHeight the height of the triangle
     * @return a new Triangle instance
     */
    public static Triangle createTriangle(final double theBase, final double theHeight) {
        return new Triangle(theBase, theHeight);
    }

    /**
     * Creates and returns a new Rectangle with the specified length and width.
     *
     * @param theLength the length of the rectangle
     * @param theWidth  the width of the rectangle
     * @return a new Rectangle instance
     */
    public static Rectangle createRectangle(final double theLength, final double theWidth) {
        return new Rectangle(theLength, theWidth);
    }
}
