package chap12.ex1231;

import java.util.*;
import java.io.*;
import java.net.*;

public class Ex1231 {
    public static final int MALE = 1;
    public static final int FEMALE = 3;

    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = userInput.nextInt();
        System.out.println("Enter the Gender: ");
        char genderChar = userInput.next().charAt(0);

        System.out.println("Enter the name: ");
        String name = userInput.next();

        URL url = new URL("https://liveexample.pearsoncmg.com/data/babynamesranking" + year +".txt");
        File file = new File("src/chap12/ex1231/ex1231.txt");


        Scanner inputFromWeb = new Scanner(url.openStream());
        PrintWriter out = new PrintWriter(file);

        while (inputFromWeb.hasNextLine()) {
            String line = inputFromWeb.nextLine();
            out.println(line);
        }

        inputFromWeb.close();
        out.close();

        boolean nameFound = false;
        Scanner fileInput = new Scanner(file);
        while (fileInput.hasNextLine()) {
            String[] infos = fileInput.nextLine().split("\\s+");
            int x = (genderChar == 'M') ? MALE : FEMALE;
            if (infos[x].equals(name)) {
                nameFound = true;
                System.out.println(name + " is ranked #" + infos[0] + " in year " + year);
                System.out.println(infos[x + 1] + " babies");
                break;
            }
        }
        if (!nameFound) {
            System.out.println("The name " + name + " is not ranked in year " + year);
        }
    }
}
