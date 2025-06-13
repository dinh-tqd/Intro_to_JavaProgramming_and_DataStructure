package chap11;


import java.util.ArrayList;

public class Ex1118 {
    public static void main(String[] args) {
        String myString = "Hello World";
        System.out.println(toCharacterArray(myString));
    }

    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        return list;
    }
}
