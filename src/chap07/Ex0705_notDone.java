package chap07;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Ex0705_notDone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        int[] temp = new int[10];
        int distinctCount = 0;
        
        for (int i = 0; i < 10; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (numbers[j] == numbers[i]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[distinctCount] = numbers[i];
                distinctCount++;
            }
        }

        System.out.println(Arrays.toString(temp));
        int[] distinctList = Arrays.copyOf(temp, distinctCount);
        System.out.println(Arrays.toString(distinctList));
    }
}
