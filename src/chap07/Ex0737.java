package chap07;

import java.util.Scanner;
import java.util.Arrays;

public class Ex0737 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of balls to drop: ");
        int ballCount = input.nextInt();

        System.out.println("Enter the number of slots in the bean machine: ");
        int slotCount = input.nextInt();
        int[] slots = new int[slotCount];

        for (int ball = 0; ball < ballCount; ball++) {
            char[] ballMoves = new char[slotCount - 1];
            int rCount = 0;
            for (int i = 0; i < ballMoves.length; i++) {
                ballMoves[i] = ((int)(Math.random() * 2) == 0) ? 'L' : 'R';
                if (ballMoves[i] == 'R') {
                    rCount++;
                }
            }
            System.out.println(new String(ballMoves));
            slots[rCount]++;
        }

        System.out.println();
        System.out.println(Arrays.toString(slots));
        System.out.println();
        for (int line = ballCount - 1; line >= 0; line--) {
            for (int column = 0; column < slotCount; column++) {
                if (slots[column] > line) {
                    System.out.print("*");
                } else {
                    System.out.print("_");
                }
                if (column == slotCount - 1) {
                    System.out.println();
                }
            }
        }
    }
}
