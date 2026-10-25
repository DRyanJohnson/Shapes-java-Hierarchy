package shapes;

/**
 * Square shape implementation.
 *
 * @author Dakota Johnson
 * @version Autumn 2026
 */
public final class Square extends AbstractShape {

    /**
     * The side length of the square.
     */
    private final double mySideLength;

    /**
     * Constructs a new Square.
     */
    public Square(final double theSideLength) {
        super();
        if (theSideLength <= 0) {
            throw new IllegalArgumentException(
                    "Side length must be greater than zero. Given: " + theSideLength);
        }
        mySideLength = theSideLength;
    }

    /**
     * Returns the side length of the square.
     *
     * @return the side length
     */
    public double getSideLength() {
        return mySideLength;
    }

    @Override
    public double area() {
        return mySideLength * mySideLength;
    }
}