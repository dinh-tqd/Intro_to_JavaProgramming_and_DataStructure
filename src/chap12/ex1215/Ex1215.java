package chap12.ex1215;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex1215 {
    public static void main(String[] args) throws Exception {
        // Generate file with 100 random integer.
        File file = new File("src/chap12/ex1215/Exercise12_15.txt");

        PrintWriter pw = new PrintWriter(file);
        for (int count = 0; count < 100; count++) {
            int number = (int)(Math.random() * 1000) + 1;
            pw.print(number + "\n");
        }
        pw.close();

        // Read data back from file
        Scanner fileInput = new Scanner(file);
        ArrayList<Integer> list = new ArrayList<>();
        while (fileInput.hasNext()) {
            list.add(fileInput.nextInt());
        }

        // Display in increasing order
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }
}
