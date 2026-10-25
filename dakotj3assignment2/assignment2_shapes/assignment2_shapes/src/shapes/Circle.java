package shapes;

/**
 * Circle shape implementation.
 *
 * @author Dakota Johnson
 * @version Autumn 2026
 */
public final class Circle extends AbstractShape {

    /**
     * The radius of the circle.
     */
    private final double myRadius;

    /**
     * Constructs a new Circle with the specified radius.
     *
     * @param theRadius the radius of the circle
     * @throws IllegalArgumentException if the radius is less than or equal to zero
     */
    public Circle(final double theRadius) {
        super();
        if (theRadius <= 0) {
            throw new IllegalArgumentException(
                    "Radius must be greater than zero. Given: " + theRadius);
        }
        myRadius = theRadius;
    }

    /**
     * Returns the radius of the circle.
     *
     * @return the radius
     */
    public double getRadius() {
        return myRadius;
    }

    @Override
    public double area() {
        return Math.PI * myRadius * myRadius;
    }
}