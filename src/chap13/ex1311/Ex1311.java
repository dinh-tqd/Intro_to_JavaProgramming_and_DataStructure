package chap13.ex1311;

public class Ex1311 {
    public static void main(String[] args) {
        Octagon o1 = new Octagon(5);
        System.out.println(o1.getArea());
        System.out.println(o1.getPerimeter());

        Octagon o2 = o1.clone();
        System.out.println(o2.getArea());
        System.out.println(o2.getPerimeter());

        System.out.println(o1.compareTo(o2));
    }
}
