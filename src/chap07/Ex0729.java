// Cách dùng 4 nested-loop này siêu dài
// Nghiên cứu cách dùng backtrack

package chap07;

public class Ex0729 {
    public static void main(String[] args) {
        final String[] ranks = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        final String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        int[] deck = new int[52];
        for (int i = 0; i < 52; i++) {
            deck[i] = i;
        }

        int pickCount = 0;
        for (int a = 0; a < 52; a++) {
            for (int b = a + 1; b < 52; b++) {
                for (int c = b + 1; c < 52; c++) {
                    for (int d = c + 1; d < 52; d++) {
                        if (a % 13 + b % 13 + c % 13 + d % 13 + 4 == 24) {
                            System.out.println("Pick " + (pickCount + 1) + ":");
                            System.out.println(ranks[a % 13] + " of " + suits[a / 13]);
                            System.out.println(ranks[b % 13] + " of " + suits[b / 13]);
                            System.out.println(ranks[c % 13] + " of " + suits[c / 13]);
                            System.out.println(ranks[d % 13] + " of " + suits[d / 13]);
                            System.out.println();
                            pickCount++;
                        }
                    }
                }
            }
        }

        System.out.println(pickCount);
    }
}
