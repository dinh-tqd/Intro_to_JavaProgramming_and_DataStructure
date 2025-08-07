package chap13.ex1310;

public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
    private double width;
    private double height;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "[Rectangle] width = " + width +
                " and height = " + height;
    }

    @Override
    public int compareTo(Rectangle obj) {
        if (this.getArea() > obj.getArea())
            return 1;
        else if (this.getArea() < obj.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            return this.getArea() == ((Rectangle) obj).getArea();
        }
        return false;
    }
}
