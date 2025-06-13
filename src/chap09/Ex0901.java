package chap09;

public class Ex0901 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        System.out.println(r1.width);
        System.out.println(r1.height);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        System.out.println();

        Rectangle r2 = new Rectangle(3.5, 35.9);
        System.out.println(r2.width);
        System.out.println(r2.height);
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
    }
}

class Rectangle {
    double width = 1;
    double height = 1;

    Rectangle() {
    }
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }


}
