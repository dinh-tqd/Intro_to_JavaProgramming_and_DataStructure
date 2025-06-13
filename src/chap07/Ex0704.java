package chap07;

import java.util.Scanner;
import java.util.Arrays;

public class Ex0704 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[100];
        System.out.println("Enter maximum 100 scores.");
        System.out.println("Enter score: ");
        int count = 0;
        scores[count] = input.nextInt();
        while(scores[count] >= 0) {
            count++;
            scores[count] = input.nextInt();
        }
        System.out.println(Arrays.toString(scores));

        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += scores[i];
        }
        double avg = sum / count;
        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
        System.out.println("Average: " + avg);

        int belowAvgCount = 0;
        int aboveAvgCount = 0;
        for (int i = 0; i < count; i++) {
            if (scores[i] >= avg) {
                aboveAvgCount++;
            } else {
                belowAvgCount++;
            }
        }
        System.out.println("Above average count: " + aboveAvgCount);
        System.out.println("Below average count: " + belowAvgCount);
    }
}
