package chap07;

import java.util.Scanner;

public class Ex0710 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 numbers: ");
        double[] array = new double[10];
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
        }
        System.out.println("Index of the smallest Element is " + indexOfSmallestElement(array));
    }

    public static int indexOfSmallestElement(double[] array) {
        int result = 0;
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                result = i;
            }
        }
        return result;
    }
}
