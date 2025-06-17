package chap13.ex1301;

public class Main {
    public static void main(String[] args) {
        double side1 = 3;
        double side2 = 4;
        double side3 = 5;
        String color = "red";
        boolean filled = true;

        Triangle triangle = new Triangle(side1, side2, side3, color, filled);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.toString());
    }
}
