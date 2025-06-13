package chap11;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex1116 {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        System.out.println(number1 + " + " + number2 +" = ?" );
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> answers = new ArrayList<>();

        int answer = input.nextInt();

        while (number1 + number2 != answer) {
            if (answers.contains(answer)) {
                System.out.printf("You already entered %d.%n" , answer);
            } else {
                answers.add(answer);
                System.out.println("Wrong answer. Try again.");
            }
            answer = input.nextInt();
        }
        answers.add(answer);

        System.out.println(answers);
    }
}
