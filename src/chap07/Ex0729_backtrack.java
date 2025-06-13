// Common Algorithmic Technique: backtracking
// Learn later in chap 22

// ➡ Nếu ưu tiên hiệu suất: dùng vòng lặp for.
// ➡ Nếu ưu tiên code ngắn, dễ mở rộng: dùng backtracking.

package chap07;

public class Ex0729_backtrack {
    static final String[] ranks = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    static final String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
    static int pickCount = 0;
    static int[] combo = new int[4];

    public static void main(String[] args) {
        backtrack(0, 0);
        System.out.println("Total picks: " + pickCount);
    }

    public static void backtrack(int pos, int selected) {
        if (selected == 4) {
            int sum = 0;
            for (int card : combo) {
                sum += (card % 13 + 1); // giá trị lá bài
            }
            if (sum == 24) {
                pickCount++;
                System.out.println("Pick " + pickCount + ":");
                for (int card : combo) {
                    System.out.println(ranks[card % 13] + " of " + suits[card / 13]);
                }
                System.out.println();
            }
            return;
        }
        for (int i = pos; i < 52; i++) {
            combo[selected] = i;
            backtrack(i + 1, selected + 1);
        }
    }
}
