package chap13.ex1316;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1316 {
    public static void main(String[] args) {
//        System.out.println(args[0]);
//        System.out.println(args[1]);
//        System.out.println(args[2]);

        String[] r1 = args[0].split("/");
        Rational r1Num = new Rational(Integer.parseInt(r1[0]), Integer.parseInt(r1[1]));
        String[] r2 = args[2].split("/");
        Rational r2Num = new Rational(Integer.parseInt(r2[0]), Integer.parseInt(r2[1]));

        Rational result = new Rational();
        String operator = args[1];

        switch (operator) {
            case "+":
                result = r1Num.add(r2Num);
                break;
            case "-":
                result = r1Num.subtract(r2Num);
                break;
            case "*":
                result = r1Num.multiply(r2Num);
                break;
            case "/":
                result = r1Num.divide(r2Num);
                break;
        }

        System.out.println(r1Num + " " + args[1] + " " + r2Num + " = " + result);
    }
}
