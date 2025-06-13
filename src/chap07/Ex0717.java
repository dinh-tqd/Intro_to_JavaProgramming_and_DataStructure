package chap07;

import java.util.Scanner;
import java.util.Arrays;

public class Ex0717 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        String[] student = new String[numberOfStudents];
        double[] score = new double[numberOfStudents];
        System.out.println("Enter student's name (without space) and their score: ");
        for (int i = 0 ; i < numberOfStudents; i++) {
            student[i] = input.next();
            score[i] = input.nextInt();
        }

        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = i + 1; j < numberOfStudents; j++) {
                if (score[i] < score[j]) {
                    double scoreTemp = score[i];
                    String studentTemp = student[i];
                    score[i] = score[j];
                    student[i] = student[j];
                    score[j] = scoreTemp;
                    student[j] = studentTemp;
                }
            }
        }

        System.out.println(Arrays.toString(student));
        System.out.println(Arrays.toString(score));
    }
}
