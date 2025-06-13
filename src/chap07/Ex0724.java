package chap07;

import java.util.Arrays;

public class Ex0724 {
    public static void main(String[] args) {
        final String[] rank = {"A", "2", "3", "4", "5","6", "7", "8", "9", "10", "J", "Q", "K"};
        final String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};

        int[] deck = new int[52];
        for (int i = 0; i < 52; i++) {
            deck[i] = i;
        }

        int[] pick = new int[52];
        Arrays.fill(pick, -1);

        boolean[] suitFound = new boolean[4];
        int suitCount = 0;
        for (int pickCount = 0; pickCount < 52; pickCount++) {
            int x = (int)(Math.random() * 52);
            if (!suitFound[x / 13]) {
                suitFound[x/13] = true;
                suitCount++;
            }
            System.out.println(rank[x % 13] + " of " + suit[x / 13]);
            if (suitCount == 4) {
                System.out.println("Number of picks: " + (pickCount + 1));
                break;
            }
        }
    }
}
