package chap13.ex1301;

public class Ex1301 {
    public static void main(String[] args) {
        double side1 = 3;
        double side2 = 4;
        double side3 = 5;
        String color = "red";
        boolean filled = true;

        GeometricObject o1 = new Triangle(side1, side2, side3, color, filled);
        System.out.println(o1.getClass().getSimpleName());
        System.out.println(o1.getArea());
        System.out.println(o1.getPerimeter());
        System.out.println(o1.toString());
    }
}
