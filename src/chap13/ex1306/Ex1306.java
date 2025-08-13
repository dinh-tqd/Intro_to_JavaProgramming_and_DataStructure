package chap13.ex1306;

public class Ex1306 {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(3);
        ComparableCircle c2 = new ComparableCircle(4);
        System.out.println(c2.compareTo(c1));

        System.out.println("---");

        ComparableRectangle r1 = new ComparableRectangle(2, 5);
        System.out.println(GeometricObject.max(c1, r1));

    }
}
