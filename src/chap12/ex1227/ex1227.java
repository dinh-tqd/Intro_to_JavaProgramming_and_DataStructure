package chap12.ex1227;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex1227 {
    public static void main(String[] args) throws Exception {
//        createDirectory();

        File folder = new File("src/chap12/ex1227/myDir/");

        if (args[0].length() > 0 && args[0].equals("*")) {
            for (File file : folder.listFiles()) {
                if (file.isFile())
                    modifyFile(file);
            }
        } else {
            File file = new File(folder.getAbsolutePath() + "/" + args[0]);
            modifyFile(file);
        }
    }

    public static void modifyFile(File file) throws Exception {
        Scanner input = new Scanner(file);
        StringBuilder sb = new StringBuilder();

        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (!word.matches("^exercise\\d+_\\d+$"))
                    sb.append(word).append(" ");
                else {

                }
            }
        }
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
