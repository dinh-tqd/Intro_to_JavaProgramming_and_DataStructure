package chap13.ex1308;

public class Square extends GeometricObject implements Colorable {
    private double side;

    public Square() {
        this(0);
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all 4 sides. ");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "\n" +
                "Side: " + this.getSide() + "\n" +
                this.getDateCreated() + "\n" +
                "color: " + this.getColor() + " and filled: " + this.isFilled();
    }
}
