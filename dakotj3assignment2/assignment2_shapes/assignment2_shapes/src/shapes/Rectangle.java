package shapes;

/**
 * Rectangle shape implementation.
 *
 * @author Dakota Johnson
 * @version Autumn 2026
 */
public final class Rectangle extends AbstractShape {

    /**
     * The length of the rectangle.
     */
    private final double myLength;

    /**
     * The width of the rectangle.
     */
    private final double myWidth;

    /**
     * Constructs a new Rectangle.
     */
    public Rectangle(final double theLength, final double theWidth) {
        super();
        if (theLength <= 0) {
            throw new IllegalArgumentException(
                    "Length must be greater than zero. Given: " + theLength);
        }
        if (theWidth <= 0) {
            throw new IllegalArgumentException(
                    "Width must be greater than zero. Given: " + theWidth);
        }
        myLength = theLength;
        myWidth = theWidth;
    }

    /**
     * Returns the length of the rectangle.
     *
     * @return the length
     */
    public double getLength() {
        return myLength;
    }

    /**
     * Returns the width of the rectangle.
     *
     * @return the width
     */
    public double getWidth() {
        return myWidth;
    }

    @Override
    public double area() {
        return myLength * myWidth;
    }
}