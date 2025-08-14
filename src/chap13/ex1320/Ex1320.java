// If want to run Test_Ex1320,
// comment out 12-16
// and line 17-19

package chap13.ex1320;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1320 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a, b, c: ");
//        double a = input.nextDouble();
//        double b = input.nextDouble();
//        double c = input.nextDouble();

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        System.out.println("The discriminant is: " + getDiscriminant(a, b, c));
        solveEquation(a, b, c);
    }

    public static double getDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static void solveEquation(double a, double b, double c) {
        ArrayList<Object> list = new ArrayList<Object>();

        double delta = getDiscriminant(a, b, c);
        if (delta == 0) {
            list.add(-b / (2 * a));
        } else if (delta > 0) {
            list.add((-b + Math.sqrt(delta)) / (2 * a));
            list.add((-b - Math.sqrt(delta)) / (2 * a));
        } else {
            list.add(new Complex(-b / (2*a), Math.sqrt(Math.abs(delta)) / (2 * a)));
            list.add(new Complex(-b / (2*a), - Math.sqrt(Math.abs(delta)) / (2 * a)));
        }

        if (list.size() == 1) {
            System.out.println("The root is " +  list.get(0));
        } else {
            System.out.println("The roots are " + list.get(0) + " and " + list.get(1));
        }
    }
}
