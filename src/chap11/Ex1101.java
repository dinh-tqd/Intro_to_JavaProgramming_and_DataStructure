package chap11;

import java.util.Scanner;

public class Ex1101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter triangle's 3 sides: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        input.nextLine();
        Triangle shape1 = new Triangle(side1, side2, side3);

        System.out.println("Enter color : ");
        String color = input.nextLine();
        System.out.println("The triangle is filled ? true/false");
        boolean filled = input.nextBoolean();

        shape1.setColor(color);
        shape1.setFilled(filled);

        System.out.println(shape1.toString());
        System.out.println("Area: " + shape1.getArea());
        System.out.println("Perimeter: " + shape1.getPerimeter());

        System.out.println("color: " + shape1.getColor());
        System.out.println("filled?: " + shape1.isFilled());

    }
}

class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    Triangle() {
        this(1.0, 1.0, 1.0);
    }

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return super.toString() + "\nTriangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}

class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }
}
