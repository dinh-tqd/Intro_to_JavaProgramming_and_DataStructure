package chap08.ex0803;

import java.util.Arrays;

public class Ex0803 {
    public static void main(String[] args) {
        // Students' answers to the questions
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };

        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C' ,'D', 'A', 'E', 'A', 'D'};

        int[][] ranking = new int[answers.length][2];

        // Grade all answer
        for (int i = 0; i < answers.length; i++) {

            // Student name is ranking[i][0];
            ranking[i][0] = i;

            // Student score is ranking[i][1]
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    ranking[i][1]++;
            }
        }

        System.out.println("Ranking before sorting: ");
        for (int[] r : ranking)
            System.out.println(Arrays.toString(r));

        System.out.print("\n\n---\n\n");
        for (int i = 0; i < ranking.length; i++) {
            for (int j = i + 1; j < ranking.length; j++) {
                if (ranking[i][1] > ranking[j][1]) {
                    int[] temp = ranking[i];
                    ranking[i] = ranking[j];
                    ranking[j] = temp;
                }
            }
        }
        System.out.println("Ranking after sorting: ");
        for (int[] r : ranking)
            System.out.println(Arrays.toString(r));
    }
}
