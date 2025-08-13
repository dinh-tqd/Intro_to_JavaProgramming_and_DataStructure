package chap13.ex1307;

import java.awt.*;

public class Ex1307 {
    public static void main(String[] args) {
        GeometricObject[] a = {
                new Circle(2.0),
                new Rectangle(2.0, 2.0),
                new Square(3),
                new Circle(),
                new Rectangle(),
        };

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].getClass().getSimpleName());
            System.out.println(a[i].getArea());
            if (a[i] instanceof Colorable) {
                ((Colorable) a[i]).howToColor();
            }
            System.out.println("____________");
        }
    }
}
