package chap12.ex1230;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Ex1230 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a file name: ");
        String fileName = input.nextLine();

        File file = new File("src/chap12/ex1230/" + fileName);
        if (!file.exists()) {
            System.out.println("The file " + fileName + " does not exist.");
            return;
        }

        Scanner fileInput = new Scanner(file);

        int[] occurrences = new int['Z' - 'A' + 1];
        while (fileInput.hasNextLine()) {
            String line = fileInput.nextLine();
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (Character.isLetter(ch)) {
                    ch = Character.toUpperCase(ch);
                    occurrences[ch - 'A']++;
                }
            }
        }

        for (int i = 0; i < occurrences.length; i++) {
            System.out.printf("Number of %cs: %d%n", (char)('A' + i), occurrences[i]);
        }
    }
}
