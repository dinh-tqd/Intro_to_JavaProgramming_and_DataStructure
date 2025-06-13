package chap12.ex1213;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Ex1213 {
    public static void main(String[] args) throws Exception {
        File file = new File("src/chap12/ex1213/JohnConnor.txt");
        if (!file.exists()) {
            System.out.println("File not found!");
            return;
        }

        Scanner fileInput = new Scanner(file);

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        while (fileInput.hasNextLine()) {
            // Count lines
            lineCount++;
            String line = fileInput.nextLine();

            // Count chars
            charCount += line.length();

            // Count words
            String[] wordsInLine = line.split("\\s+");
            wordCount += wordsInLine.length;
        }

        System.out.println("line count: " + lineCount);
        System.out.println("word count: " + wordCount);
        System.out.println("char count: " + charCount);
    }
}
