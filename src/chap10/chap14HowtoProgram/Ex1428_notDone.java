package chap10.chap14HowtoProgram;

import java.util.Scanner;
import java.util.Arrays;

public class Ex1428_notDone {
    public static final String[][] smsLanguage = {
            {"imo", "in my opinion", "in memory of", "International Maritime Organization"},
            {"u", "you"},
            {"idk", "I don't know"},
            {"brb", "Be right back"},
            {"lol", "laughing out loud"},
            {"ttyl", "talk to you later"},
            {"w/", "with"},
            {"w/o", "without"},
            {"b/c", "because", "Before Christ"},
            {"wat", "what"},
            {"2day", "today"},
            {"2moro", "tomorrow"},
            {"cud", "could"}
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println("Enter your message in SMS Language: ");
//        String message = input.nextLine();
        String message = "imo u are crazy b/c idk i will ttyl See you 2moro";

        String[] messageInArray = message.split(" ");
        String[] convertedMessageInArray = new String[messageInArray.length];

        for (int i = 0; i < messageInArray.length; i++) {
            int found = foundInSMSLanguage(messageInArray[i]);
            if (found != -1) {
                if (smsLanguage[found].length > 2) {
                    // Print all word choices:
                    System.out.println(messageInArray[i] + " found!");
                    System.out.println("Which word do you wanna use ?:");
                    for (int choice = 1; choice < smsLanguage[found].length; choice++) {
                        System.out.println(choice + "> " + smsLanguage[found][choice]);
                    }
                    int playerChoice = input.nextInt();
                    convertedMessageInArray[i] = smsLanguage[found][playerChoice];

                } else {
                    convertedMessageInArray[i] = smsLanguage[found][1];
                }
            } else {
                convertedMessageInArray[i] = messageInArray[i];
            }
        }

        System.out.println(Arrays.toString(convertedMessageInArray));
    }

    public static int foundInSMSLanguage(String s) {
        for (int i = 0; i < smsLanguage.length; i++) {
            if (smsLanguage[i][0].equals(s)) {
                return i;
            }
        }
        return -1;
    }
}
