package chap09;

public class Ex0909 {
    public static void main(String[] args) {
        RegularPolygon p1 = new RegularPolygon();
        System.out.println(p1.getPerimeter());
        System.out.println(p1.getArea());

        System.out.println("___");
        RegularPolygon p2 = new RegularPolygon(6,4);
        System.out.println(p2.getPerimeter());
        System.out.println(p2.getArea());

        System.out.println("___");
        RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println(p3.getPerimeter());
        System.out.println(p3.getArea());

    }
}

class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;
    RegularPolygon() {}
    RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }
    RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return n * side * side / (4 * Math.tan(Math.PI / n));
    }
}
