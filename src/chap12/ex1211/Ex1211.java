package chap12.ex1211;

import java.io.File;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

public class Ex1211 {
    public static void main(String[] args) throws Exception {
        String stringToRemove = args[0];

        File file = new File("src/chap12/ex1211/JohnConnor.txt");
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }
        StringBuilder sb = new StringBuilder();
        Scanner fileInput = new Scanner(file);
        while (fileInput.hasNextLine()) {
            String line = fileInput.nextLine();
            line = line.replace(stringToRemove, "");
            System.out.println(line);
            sb.append(line).append("\n");
        }


        PrintWriter pw = new PrintWriter(file);
        pw.println(sb);
        pw.close();
    }
}
