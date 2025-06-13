package chap10;

public class Ex1011 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        //
        System.out.println(c1.contains(3, 3));
        System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));

        //
        System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}

class Circle2D {
    private double x;
    private double y;
    private double radius;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    public boolean contains(double x, double y) {
        double distanceToCentre = Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
        return distanceToCentre <= radius;
    }

    public boolean contains(Circle2D circle) {
        double distanceBetween2Centres = Math.sqrt((circle.getX() - this.x) * (circle.getX() - this.x) + (circle.getY() - this.y) * (circle.getY() - this.y));
        return (distanceBetween2Centres + circle.getRadius() <= this.radius);
    }

    public boolean overlaps(Circle2D circle) {
        double distanceBetween2Centres = Math.sqrt((circle.getX() - this.x) * (circle.getX() - this.x) + (circle.getY() - this.y) * (circle.getY() - this.y));
        return (distanceBetween2Centres < this.radius + circle.getRadius());
    }
}
