package chap09;

import java.util.Scanner;

public class Ex0910 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Phương trình ax^2 + by + c = 0");
        System.out.println("Nhập a b c:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation eq1 = new QuadraticEquation(a, b, c);
        if (eq1.getDiscriminant() > 0) {
            System.out.println(eq1.getRoot1());
            System.out.println(eq1.getRoot2());
        } else if (eq1.getDiscriminant() == 0) {
            System.out.println(eq1.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }

    }
}

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) return 0;
        return (-b + Math.sqrt(getDiscriminant())) / (2*a);
    }

    public double getRoot2() {
        if (getDiscriminant() < 0) return 0;
        return (-b - Math.sqrt(getDiscriminant())) / (2*a);
    }
}
