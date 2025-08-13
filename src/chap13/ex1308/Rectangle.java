package chap13.ex1308;

import java.util.Arrays;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
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
        if (sides != null && sides.length == 2) {}
        this.width = sides[0];
        this.height = sides[1];
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
}
