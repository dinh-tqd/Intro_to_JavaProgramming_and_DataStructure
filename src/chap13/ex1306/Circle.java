package chap13.ex1306;

public class Circle extends GeometricObject{
    private double radius;

    Circle() {}

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "\nRadius: " + radius
                + "\nCreated on " + getDateCreated() + "\ncolor: " + getColor() + " and filled: " + isFilled();
    }
}
