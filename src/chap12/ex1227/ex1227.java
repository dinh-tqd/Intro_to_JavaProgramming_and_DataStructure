package chap12.ex1227;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex1227 {
    public static void main(String[] args) throws IOException {
//        createDirectory();
        System.out.println("Enter the file name: ");
        File file = new File("src/chap12/ex1227/myDir/" + args[0]);

        Scanner input = new Scanner(file);
        StringBuilder sb = new StringBuilder();
        while (input.hasNextLine()) {
            String line = input.nextLine();

            line = line.replaceAll("^Exercise([0-9])_([0-9])$", "Exercise0$1_0$2");
            sb.append(line + "\n");
        }

        PrintWriter out = new PrintWriter(file);
        out.println(sb.toString());
        out.close();

    }

    public static void createDirectory() throws IOException {
        File dir = new File("src/chap12/ex1227/myDir");
        if (!dir.exists()) {
            dir.mkdirs();
        }

        for (int i = 0; i < 10; i++) {
            int a = (int) (Math.random() * 10) + 1;
            int b = (int) (Math.random() * 10) + 1;
            File file = new File("src/chap12/ex1227/myDir/Exercise" + a + "_" + b);
            if (!file.exists()) {
                PrintWriter pw = new PrintWriter(file);
                pw.println("Exercise" + a + "_" + b + "\n");
                pw.close();
            }
        }
    }
}
