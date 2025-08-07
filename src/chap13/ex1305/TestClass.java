package chap13.ex1305;

public class TestClass {
    public static void main(String[] args) {
        GeometricObject o1 = new Triangle(1, 2, 3);
        GeometricObject o2 = new Triangle(4, 5, 3);
        GeometricObject o3 = new Rectangle(0.1,0.2);

        System.out.println(o1);
        System.out.println("---");
        System.out.println(o2);
        System.out.println("---");
        System.out.println(o3);
    }
}
