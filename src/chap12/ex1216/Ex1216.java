package chap12.ex1216;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex1216 {
    public static void main(String[] args) throws Exception{
        if (args.length != 3) {
            System.out.println(
                    "Usage: java ex1216 file oldString newString");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File " + args[0] + " doesn't exists.");
            System.exit(2);
        }

        String oldString = args[1];
        String newString = args[2];

        StringBuilder sb = new StringBuilder();
        Scanner fileInput = new Scanner(file);

        while (fileInput.hasNextLine()) {
            String s1 = fileInput.nextLine();
            String s2 = s1.replaceAll(oldString, newString);
            sb.append(s2).append("\n");
        }
        PrintWriter pw = new PrintWriter(file);
        pw.print(sb);
        pw.close();
    }
}


// java Ex1216 src/chap12/ex1216/JohnConnor.txt John Dinh
// Replace "John" with "Dinh" in JohnConnor.txt