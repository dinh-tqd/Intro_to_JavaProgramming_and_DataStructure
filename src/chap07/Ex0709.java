package chap07;

import java.util.Scanner;

public class Ex0709 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 numbers: ");
        double[] array = new double[10];
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
        }
        System.out.println("Min = " + min(array));
    }

    public static double min(double[] array) {
        double result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < result) {
                result = array[i];
            }
        }
        return result;
    }
}
