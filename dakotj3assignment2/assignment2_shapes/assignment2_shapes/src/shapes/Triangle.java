package shapes;

/**
 * Triangle shape implementation.
 *
 * @author Dakota Johnson
 * @version Autumn 2026
 */
public final class Triangle extends AbstractShape {

    /**
     * Factor used for triangle area calculation.
     */
    private static final double HALF = 0.5;

    /**
     * The base of the triangle.
     */
    private final double myBase;

    /**
     * The height of the triangle.
     */
    private final double myHeight;

    /**
     * Constructs a new Triangle with the specified base and height.
     *
     * @param theBase   the base of the triangle
     * @param theHeight the height of the triangle
     * @throws IllegalArgumentException if base or height is less than or equal to zero
     */
    public Triangle(final double theBase, final double theHeight) {
        super();
        if (theBase <= 0) {
            throw new IllegalArgumentException(
                    "Base must be greater than zero. Given: " + theBase);
        }
        if (theHeight <= 0) {
            throw new IllegalArgumentException(
                    "Height must be greater than zero. Given: " + theHeight);
        }
        myBase = theBase;
        myHeight = theHeight;
    }

    /**
     * Returns the base of the triangle.
     *
     * @return the base
     */
    public double getBase() {
        return myBase;
    }

    /**
     * Returns the height of the triangle.
     *
     * @return the height
     */
    public double getHeight() {
        return myHeight;
    }

    @Override
    public double area() {
        return HALF * myBase * myHeight;
    }
}
