package chap12.ex1214;

import java.io.File;
import java.util.Scanner;

public class Ex1214 {
    public static void main(String[] args) throws Exception{
        File file = new File("src/chap12/ex1214/scores.txt");
        if (!file.exists()) {
            System.out.println("File scores.txt not found!");
            return;
        }

        int sum = 0;
        int count = 0;
        Scanner fileInput = new Scanner(file);
        while (fileInput.hasNext()) {
            int score = fileInput.nextInt();
            sum += score;
            count++;
        }

        System.out.println("Score Total: " + sum);
        System.out.println("Count      : " + count);
        System.out.println("Avg        : " + String.format("%.2f", (double)sum / count)) ;
    }
}
