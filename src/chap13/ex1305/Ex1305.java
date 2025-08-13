package chap13.ex1305;

public class Ex1305 {
    public static void main(String[] args) {
        GeometricObject c1 = new Circle(1);
        GeometricObject c2 = new Circle(3);
        System.out.println(GeometricObject.max(c1, c2));

        System.out.println("---");

        GeometricObject t1 = new Triangle(3, 4, 5);
        GeometricObject t2 = new Triangle(1, 4, 3.5);
        System.out.println(GeometricObject.max(t1, t2));
    }
}
