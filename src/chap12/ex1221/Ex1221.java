package chap12.ex1221;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex1221 {
    public static void main(String[] args) throws Exception {
        File file = new File("src/chap12/ex1221/SortedStrings.txt");

        Scanner input = new Scanner(file);
        ArrayList<String> list = new ArrayList<>();

        while (input.hasNext()) {
            list.add(input.next());
        }

        boolean isSorted = true;
        outerLoop:
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    System.out.println(list.get(i));
                    System.out.println(list.get(j));
                    isSorted = false;
                    break outerLoop;
                }
            }
        }

        if (isSorted) {
            System.out.println("Strings are sorted !");
        }
    }
}
