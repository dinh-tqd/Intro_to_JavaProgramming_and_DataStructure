package chap07;

import java.util.Scanner;

public class Ex0728 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integers: ");
        int[] list = new int[10];
        for (int i = 0; i < 10; i++) {
            list[i] = input.nextInt();
        }
        pick2Numbers(list);
    }

    public static void pick2Numbers(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                System.out.println(list[i] + " and " + list[j]);
            }
        }
    }
}
