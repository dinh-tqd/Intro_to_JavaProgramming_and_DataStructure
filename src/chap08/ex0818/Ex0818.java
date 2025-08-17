package chap08.ex0818;

import java.util.Arrays;

public class Ex0818 {
    public static void main(String[] args) {
        int[][] m = {
                {1,2},
                {3,4},
                {5,6},
                {7,8},
                {9,10}
        };

        shuffle(m);
        for (int[] r : m) {
            System.out.println(Arrays.toString(r));
        }
    }

    public static void shuffle(int[][] m) {
        // Fischer-Yates Shuffle
        for (int i = m.length - 1; i > 0; i--) {
            // Choose a random index to swap
            int randomIndex = (int)(Math.random() * (i + 1));

            // Swap
            int[] temp = m[i];
            m[i] = m[randomIndex];
            m[randomIndex] = temp;
        }
    }
}
