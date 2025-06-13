package chap07;

import java.util.Arrays;

public class Ex0706 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;

        int[] primeList = new int[NUMBER_OF_PRIMES];

        while (count < NUMBER_OF_PRIMES) {
            boolean isPrime = true;
            for (int p : primeList) {
                if (p == 0) break;
                if (p * p > number) break;
                if (number % p == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeList[count] = number;
                count++;
            }
            number++;
        }

        System.out.println(Arrays.toString(primeList));
    }
}
