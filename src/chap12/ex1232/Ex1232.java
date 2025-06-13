package chap12.ex1232;

import java.util.Arrays;
import java.io.File;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

public class Ex1232 {
    public static final int MALE = 1;
    public static final int FEMALE = 3;

    public static void main(String[] args) throws Exception {
        // Download txt files
        for (int i = 1; i <= 10; i++) {
            URL url = new URL("https://liveexample.pearsoncmg.com/data/babynamesranking20" + ((i == 10) ? i : "0" + i) + ".txt");
            File folder = new File("src/chap12/ex1232/babyNamesRanking");
            folder.mkdir();
            File file = new File("src/chap12/ex1232/babyNamesRanking/20" + ((i == 10) ? i : "0" + i) + ".txt");
            Scanner streamInput = new Scanner(url.openStream());
            PrintWriter streamOutput = new PrintWriter(file);
            while (streamInput.hasNextLine()) {
                streamOutput.println(streamInput.nextLine());
            }
            streamInput.close();
            streamOutput.close();
        }

        System.out.printf("Year");
        System.out.printf("%15s%15s%15s%15s%15s", "Rank 1", "Rank 2", "Rank 3", "Rank 4", "Rank 5");
        System.out.printf("%15s%15s%15s%15s%15s", "Rank 1", "Rank 2", "Rank 3", "Rank 4", "Rank 5");
        System.out.println();
        File[] files = new File("src/chap12/ex1232/babyNamesRanking").listFiles();


        for (int i = 0; i < files.length; i++) {
            for (int j = i + 1; j < files.length; j++) {
                if (files[i].getName().compareTo(files[j].getName()) < 0) {
                    File temp = files[i];
                    files[i] = files[j];
                    files[j] = temp;
                }
            }
        }

        for (File file : files) {
            System.out.println(file.getName());
        }

        int year = 2010;
        for (File file : files) {
            System.out.print(year);

            Scanner fileInput = new Scanner(file);
            String[] top5MaleNames = new String[5];
            String[] top5FemaleNames = new String[5];
            int count = 1;
            while (fileInput.hasNextLine()) {
                String[] infos = fileInput.nextLine().split("\\s+");
                top5MaleNames[count - 1] = infos[MALE];
                top5FemaleNames[count - 1] = infos[FEMALE];
                count++;
                if (count > 5) break;
            }

            for (String femaleName : top5FemaleNames) {
                System.out.printf("%15s", femaleName);
            }
            for (String maleName : top5MaleNames) {
                System.out.printf("%15s", maleName);
            }
            System.out.println();
            year--;
        }
    }
}
