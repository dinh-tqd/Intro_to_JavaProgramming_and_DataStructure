package chap13.ex1306;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle(double radius) {
        super(radius);
    }

    public int compareTo(ComparableCircle o) {
        if (this.getArea() == o.getArea()) {
            return 0;
        } else if (this.getArea() > o.getArea()) {
            return 1;
        }
        return -1;
    }
}
