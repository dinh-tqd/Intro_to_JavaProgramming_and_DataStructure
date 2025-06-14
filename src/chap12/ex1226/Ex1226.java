package chap12.ex1226;

import java.io.File;
import java.util.Scanner;

public class Ex1226 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a directory name: ");
        String dirName = userInput.nextLine();

        File file = new File("src/chap12/ex1226/" + dirName);
        if (!file.exists()) {
            file.mkdir();
            System.out.println("Directory " + dirName + " created successfully.");
        } else {
            System.out.println("Directory already exists!");
        }
    }
}
