package chap13.ex1312;

public class Ex1312 {
    public static void main(String[] args) {
        GeometricObject[] array = {
                new Circle(2),
                new Circle(),
                new Rectangle(),
                new Rectangle(2,4) };
        System.out.println(array[0].getArea());
        System.out.println(array[1].getArea());
        System.out.println(array[2].getArea());
        System.out.println(array[3].getArea());
        System.out.println(sumArea(array));
    }

    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (GeometricObject o : a) {
            sum += o.getArea();
        }
        return sum;
    }
}
