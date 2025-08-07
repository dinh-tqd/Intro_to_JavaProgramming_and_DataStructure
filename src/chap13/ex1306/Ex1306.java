package chap13.ex1306;

public class Ex1306 {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(3);
        ComparableCircle c2 = new ComparableCircle(4);
        ComparableRectangle r1 = new ComparableRectangle(2, 5);

        System.out.println(r1.compareTo(c1));
        System.out.println(c1.compareTo(c2));
    }
}
