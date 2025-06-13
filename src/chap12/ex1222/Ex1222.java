package chap12.ex1222;

import java.util.*;
import java.net.*;
import java.io.*;

public class Ex1222 {
    public static final String DIR_PATH = "src/chap12/ex1222/";

    public static void main(String[] args) throws Exception{
        File dir = new File(args[0]);
        System.out.println(dir.exists());

        String oldString = args[1];
        String newString = args[2];
        // Swap these 2 Strings to undo the change.

        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.getName().matches("^JohnConnor_\\d+\\.txt$")) {

                Scanner input = new Scanner(file);
                StringBuilder sb = new StringBuilder();
                while (input.hasNextLine()) {
                    String line = input.nextLine();
                    line = line.replace(oldString, newString);
                    sb.append(line).append("\n");
                }

                PrintWriter pw = new PrintWriter(file);
                pw.print(sb);
                pw.close();
            }
        }
    }
}
