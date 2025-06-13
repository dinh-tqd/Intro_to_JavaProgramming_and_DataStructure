package chap07;

import java.util.Scanner;

public class Ex0702 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 int numbers: ");
        int[] m = new int[10];
        for (int i = 0; i < 10; i++) {
            m[i] = input.nextInt();
        }

        for (int i = m.length - 1; i >= 0; i--) {
            System.out.print(m[i] + " ");
        }
    }
}
