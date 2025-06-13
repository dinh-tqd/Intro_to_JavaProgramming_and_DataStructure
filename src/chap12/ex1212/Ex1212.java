package chap12.ex1212;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex1212 {
    public static void main(String[] args) throws Exception{
        File file = new File("src/chap12/ex1212/test.txt");
        System.out.println(file.exists());
        if (!file.exists()) {
            System.out.println("File doesn't exists.");
            return;
        }

        Scanner fileInput = new Scanner(file);
        StringBuilder sb = new StringBuilder();


        while (fileInput.hasNextLine()) {
            String line = fileInput.nextLine();
            if (line.contains("{")) {
                sb.deleteCharAt(sb.length() - 1);
                sb.append("{").append("\n");
            } else {
                sb.append(line).append("\n");
            }
        }

        PrintWriter pw = new PrintWriter(file);
        pw.print(sb.toString());
        pw.close();
    }
}
