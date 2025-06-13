package chap12.ex1223;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

public class Ex1223 {
    public static final String URLString = "https://liveexample.pearsoncmg.com/data/Scores.txt";
    public static void main(String[] args) throws IOException {

        // Download Scores.txt
        File file = new File("src/chap12/ex1223/Scores.txt");
        URL url = new URL(URLString);
        Scanner streamInput = new Scanner(url.openStream());
        PrintWriter out = new PrintWriter(file);
        while (streamInput.hasNextLine()) {
            out.println(streamInput.nextLine());
        }
        streamInput.close();
        out.close();

        // Find total, count and avg
        Scanner fileInput = new Scanner(file);
        int total = 0;
        int count = 0;
        while (fileInput.hasNext()) {
            count++;
            total += fileInput.nextInt();
        }
        System.out.println(total);
        System.out.println(count);
        System.out.println(String.format("%.2f", (double) total / count));
    }
}
