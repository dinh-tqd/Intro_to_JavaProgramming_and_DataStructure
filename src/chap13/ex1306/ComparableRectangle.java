package chap13.ex1306;

import java.util.Comparator;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {
    ComparableRectangle(double width, double height) {
        super(width,height);
    }

    @Override
    public int compareTo(ComparableRectangle o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}
