package chap12.ex1214;

import java.io.File;
import java.io.PrintWriter;

public class generateScoresTxt {
    public static void main(String[] args) throws Exception{
        File file = new File("src/chap12/ex1214/scores.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());

        PrintWriter pw = new PrintWriter(file);
        for (int i = 0; i < (int)(Math.random() * 1000) + 1; i++) {
            int score = (int)(Math.random() * 100) + 1;
            pw.print(score);
            pw.print("\n");
        }
        pw.close();
    }
}
