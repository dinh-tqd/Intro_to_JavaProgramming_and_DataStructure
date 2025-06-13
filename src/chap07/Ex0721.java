package chap07;

import java.util.Arrays;

public class Ex0721 {
    public static void main(String[] args) {
        // Try with Cli arguments: 1 2 3 4 5

        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
        System.out.println(Arrays.toString(numbers));
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }

        System.out.println(result);
    }
}
