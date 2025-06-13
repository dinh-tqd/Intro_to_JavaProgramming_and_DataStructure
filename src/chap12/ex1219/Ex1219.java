package chap12.ex1219;

import java.net.URL;
import java.util.Scanner;
import java.util.Arrays;

public class Ex1219 {
    public static final String URLString = "http://liveexample.pearsoncmg.com/data/Lincoln.txt";

    public static void main(String[] args) throws Exception {
        URL url = new URL(URLString);
        Scanner input = new Scanner(url.openStream());

        StringBuilder sb = new StringBuilder();
        int wordCount = 0;
        while (input.hasNextLine()) {
            String line = input.nextLine();

            // If line is empty this still counts "\n" as 1 ...
            if (!line.isEmpty()) {
                String[] words = line.split("[^a-zA-Z0-9]+");
                System.out.println(words.length + "      " + Arrays.toString(words));
                wordCount += words.length;
            }
        }

        System.out.println(wordCount);
    }
}
