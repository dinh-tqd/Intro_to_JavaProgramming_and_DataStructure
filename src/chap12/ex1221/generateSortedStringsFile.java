package chap12.ex1221;

import java.io.File;
import java.io.PrintWriter;

public class generateSortedStringsFile {
    public static void main(String[] args) throws Exception {
        File file = new File("src/chap12/ex1221/SortedStrings.txt");

        String[] strings = {
                "banana",
                "apple",
                "orange",
                "grape",
                "watermelon",
                "cherry",
                "peach",
                "mango",
                "lemon",
                "blueberry"
        };

        // Sort the array
//        Arrays.sort(strings);

        PrintWriter pw = new PrintWriter(file);
        for (String s : strings) {
            pw.println(s);
        }
        pw.close();
    }
}
