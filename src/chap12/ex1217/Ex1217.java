package chap12.ex1217;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Ex1217 {
    public static void main(String[] args) throws Exception{
        File file = new File("src/chap12/ex1217/hangman.txt");
        Scanner fileInput = new Scanner(file);

        ArrayList<String> list = new ArrayList<>();
        while (fileInput.hasNext()) {
            list.add(fileInput.next());
        }

//        System.out.println(list);
        char playChoice = 'n';
        Scanner userInput = new Scanner(System.in);
        do {
            int wordIndex = (int)(Math.random() * list.size());
            String word = list.get(wordIndex);
            StringBuilder guessWord = new StringBuilder("*".repeat(word.length()));

            while (guessWord.indexOf("*") != -1) {
                System.out.println("Guess letter: ");
                char guessChar = userInput.next().charAt(0);

                if (word.indexOf(guessChar) == -1) {
                    System.out.println("Wrong guess !");
                    System.out.println(guessWord);
                } else if (guessWord.indexOf(String.valueOf(guessChar)) != -1) {
                    System.out.println("You already guess letter " + guessChar );
                } else {
                    for (int i = 0; i < word.length(); i++) {
                        if (word.charAt(i) == guessChar) {
                            guessWord.setCharAt(i, guessChar);
                        }
                    }
                    System.out.println("Nice. The guess word is : " + guessWord);
                }
            }
            System.out.println("The word is : " + word);

            System.out.println("Do you wanna play again ? (y/n)");
            playChoice = userInput.next().charAt(0);
        } while (playChoice == 'y');
    }
}
