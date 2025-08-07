/***********************************************************************************************************
 * (Enable Rectangle comparable) Rewrite the Rectangle class in Listing 13.3 to                            *
 * extend GeometricObject and implement the Comparable interface. Override                                 *
 * the equals method in the Object class. Two Rectangle objects are equal if                               *
 * their areas are the same. Draw the UML diagram that involves Rectangle, GeometricObject, and Comparable.*
 ***********************************************************************************************************/

package chap13.ex1309;

public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /* Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }

    @Override
    public int compareTo(Circle o) {
        return Double.compare(this.radius, o.radius);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            return Double.compare(this.radius, ((Circle)o).radius) == 0;
        }
        else  {
            return false;
        }
    }
}
