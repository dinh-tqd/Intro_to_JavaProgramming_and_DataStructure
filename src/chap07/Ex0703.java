package chap07;

import java.util.Scanner;
import java.util.Arrays;

public class Ex0703 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputNumber = input.nextInt();
        int[] occurrences = new int[100];

        while (inputNumber != 0) {
            occurrences[inputNumber]++;
            inputNumber = input.nextInt();
        }

        for (int i = 1; i < 100; i++) {
            if (occurrences[i] != 0) {
                System.out.printf("%2d occurs %d time%s%n", i, occurrences[i], occurrences[i] > 1 ? "s" : "");
            }
        }
    }
}
