package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import shapes.AbstractShape;
import shapes.ShapeFactory;

/**
 * Driver class to test shape creation, list sorting, and output display.
 *
 * @author Dakota Johnson
 * @version Autumn 2026
 */
public final class ShapeTester {

    // D is short for Dimension
    /**
     * Dimension value of 1.0.
     */
    private static final double D_ONE = 1.0;

    /**
     * Dimension value of 1.5.
     */
    private static final double D_ONE_POINT_FIVE = 1.5;

    /**
     * Dimension value of 2.0.
     */
    private static final double D_TWO = 2.0;

    /**
     * Dimension value of 2.5.
     */
    private static final double D_TWO_POINT_FIVE = 2.5;

    /**
     * Dimension value of 3.0.
     */
    private static final double D_THREE = 3.0;

    /**
     * Dimension value of 4.0.
     */
    private static final double D_FOUR = 4.0;

    /**
     * Dimension value of 5.0.
     */
    private static final double D_FIVE = 5.0;

    /**
     * Dimension value of 6.0.
     */
    private static final double D_SIX = 6.0;

    /**
     * Dimension value of 7.0.
     */
    private static final double D_SEVEN = 7.0;

    /**
     * Private constructor to prevent instantiation of the utility class.
     */
    private ShapeTester() {
        // Utility class
    }

    /**
     * The main entry point for the shape tester application.
     *
     * @param theArgs command line arguments
     */
    public static void main(final String[] theArgs) {
        final List<AbstractShape> shapes = new ArrayList<>();

        // 5 Circles with duplicates
        shapes.add(ShapeFactory.createCircle(D_FIVE));
        shapes.add(ShapeFactory.createCircle(D_TWO_POINT_FIVE));
        shapes.add(ShapeFactory.createCircle(D_FIVE));
        shapes.add(ShapeFactory.createCircle(D_SEVEN));
        shapes.add(ShapeFactory.createCircle(D_ONE_POINT_FIVE));

        // 5 Squares with duplicates
        shapes.add(ShapeFactory.createSquare(D_FOUR));
        shapes.add(ShapeFactory.createSquare(D_THREE));
        shapes.add(ShapeFactory.createSquare(D_FOUR));
        shapes.add(ShapeFactory.createSquare(D_SIX));
        shapes.add(ShapeFactory.createSquare(D_TWO));

        // 5 Triangles with duplicates
        shapes.add(ShapeFactory.createTriangle(D_THREE, D_FOUR));
        shapes.add(ShapeFactory.createTriangle(D_TWO, D_FIVE));
        shapes.add(ShapeFactory.createTriangle(D_THREE, D_FOUR));
        shapes.add(ShapeFactory.createTriangle(D_FIVE, D_FIVE));
        shapes.add(ShapeFactory.createTriangle(D_ONE, D_TWO));

        // 5 Rectangles with duplicates
        shapes.add(ShapeFactory.createRectangle(D_FOUR, D_THREE));
        shapes.add(ShapeFactory.createRectangle(D_TWO, D_TWO));
        shapes.add(ShapeFactory.createRectangle(D_FOUR, D_THREE));
        shapes.add(ShapeFactory.createRectangle(D_FIVE, D_SIX));
        shapes.add(ShapeFactory.createRectangle(D_ONE_POINT_FIVE, D_THREE));

        System.out.println("=== SHAPES BEFORE SORTING ==="); // NOPMD
        printShapes(shapes);

        Collections.sort(shapes);

        System.out.println("\n=== SHAPES AFTER SORTING ==="); // NOPMD
        printShapes(shapes);
    }

    private static void printShapes(final List<AbstractShape> theShapes) {
        int count = 1;
        for (final AbstractShape s : theShapes) {
            System.out.println("  " + count + ". " + s); // NOPMD
            count++;
        }
    }
}