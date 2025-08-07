package chap13.ex1306;

import java.util.Comparator;

public class ComparableRectangle extends Rectangle implements Comparable<GeometricObject> {
    public ComparableRectangle() {
        this(1.0,1.0);
    }

    ComparableRectangle(double width, double height) {
        super(width,height);
    }

    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}
