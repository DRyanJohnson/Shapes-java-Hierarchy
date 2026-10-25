package shapes;

import java.util.Objects;

/**
 * AbstractShape provides common behavior for all shapes in the hierarchy.
 *
 * @author Dakota Johnson
 * @version Autumn 2026
 */
public abstract class AbstractShape implements Comparable<AbstractShape> {

    /**
     * Factor used for rounding area to two decimal places.
     */
    private static final double ROUNDING_FACTOR = 100.0;

    /**
     * Constructs a new abstract shape.
     */
    protected AbstractShape() {
        super();
    }

    /**
     * Calculates and returns the area of the shape.
     *
     * @return the area of the shape
     */
    public abstract double area();

    /**
     * Returns the name of the shape based on its class.
     *
     * @return the shape name
     */
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public final int compareTo(final AbstractShape theOtherShape) {
        int result = name().compareTo(theOtherShape.name());
        if (result == 0) {
            result = Double.compare(area(), theOtherShape.area());
        }
        return result;
    }

    @Override
    public final String toString() {
        // Formats the area to 2 decimal places manually to avoid format strings
        final double roundedArea = Math.round(area() * ROUNDING_FACTOR) / ROUNDING_FACTOR;
        return "Name: " + name() + ", Area: " + roundedArea;
    }

    @Override
    public final boolean equals(final Object theOtherObject) {
        if (this == theOtherObject) {
            return true;
        }
        if (theOtherObject == null || getClass() != theOtherObject.getClass()) {
            return false;
        }
        final AbstractShape other = (AbstractShape) theOtherObject;
        return compareTo(other) == 0;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(name(), area());
    }
}