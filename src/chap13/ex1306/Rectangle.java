package chap13.ex1306;

import java.util.Arrays;

public class Rectangle extends GeometricObject implements Comparable<GeometricObject> {
    private double width;
    private double height;
    java.util.Date dateCreated;

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        dateCreated = new java.util.Date();
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        this(width, height);
        setColor(color);
        setFilled(filled);
    }

    public double[] getSides() {
        return new double[]{width, height};
    }

    public void setSides(double[] sides) {
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()
                + "\nSides: " + Arrays.toString(this.getSides())
                + "\nCreated on " + dateCreated + "\ncolor: " + this.getColor() + " and filled: " + this.isFilled();
    }

    @Override
    public int compareTo(GeometricObject o) {
        return (Double.compare(this.getArea(), o.getArea()));
    }
}
