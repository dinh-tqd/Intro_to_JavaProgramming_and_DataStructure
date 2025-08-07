package chap13.ex1306;

public class ComparableCircle extends Circle implements Comparable<GeometricObject>{
    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(GeometricObject circle) {
        if (this.getArea() == circle.getArea()) {
            return 0;
        } else if (this.getArea() > circle.getArea()) {
            return 1;
        }
        return -1;
    }
}
