package chap13.ex1316;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1316 {
    public static void main(String[] args) {

        String inputString = args[0];
        String[] inputArray = inputString.split(" ");

        String[] r1 = inputArray[0].split("/");
        Rational r1Num = new Rational(Integer.parseInt(r1[0]), Integer.parseInt(r1[1]));
        String[] r2 = inputArray[2].split("/");
        Rational r2Num = new Rational(Integer.parseInt(r2[0]), Integer.parseInt(r2[1]));

        Rational result = new Rational();
        String operator = inputArray[1];

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

        System.out.println(r1Num + " " + inputArray[1] + " " + r2Num + " = " + result);
    }
}
