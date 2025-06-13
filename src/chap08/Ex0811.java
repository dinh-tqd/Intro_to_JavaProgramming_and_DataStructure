package chap08;

import java.util.Scanner;

public class Ex0811 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 511: ");
        int decNumber = input.nextInt();

        int altNumber = decNumber;
        int binNumber = 0;
        while (altNumber != 0) {
            binNumber = altNumber % 2 * 10 + binNumber;
            altNumber = altNumber / 2;
        }

        System.out.println(binNumber);
        for (int i = 8; i >= 0 ; i--) {
            if (i % 3 == 2) {
                System.out.println();
            }
            System.out.print((binNumber / (int)Math.pow(10, i)) == 0 ? "H " : "T " );
        }
    }
}
