package chap07;

import java.util.Arrays;

public class Ex0707 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int[] occurrences = new int[10];

        for (int i = 0; i < 100; i++) {
            numbers[i] = (int)(Math.random() * 10) ;
            occurrences[numbers[i]]++;
        }
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " appears " + occurrences[i] + " " + ((occurrences[i] == 1) ? "time" : "times")  );
        }
    }
}
