package chap10;

import java.lang.StringBuilder;

public class Ex1023 {
    public static void main(String[] args) {
        MyString2 str = new MyString2("hello wORLd");
        System.out.println(str.toUpperCase().toString());
        MyString2 str2 = new MyString2("0123456789");
        System.out.println(str.substring(4).toString());
    }
}

class MyString2 {
    private char[] chars;

    public MyString2(String s) {
        this.chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
    }

    public MyString2(char[] chars) {
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
    }

    public int compare(String s) {
//        Compare char-by-char Unicode
//        Return difference at first mismatch
//        If no mismatch, shorter string is smaller
//        Equal strings return 0

        int n = Math.min(chars.length, s.length());
        for (int i = 0; i < n; i++) {
            if (chars[i] != s.charAt(i)) {
                return (int) (chars[i] - s.charAt(i));
            }
        }
        return (chars.length - s.length());
    }

    public MyString2 substring(int begin) {
        char[] temp = new char[chars.length - begin];
        System.arraycopy(chars, begin, temp, 0, chars.length - begin);
        return new MyString2(temp);
    }

    public MyString2 toUpperCase() {
        char[] temp = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                temp[i] = (char)(chars[i] - 'a' + 'A');
            } else {
                temp[i] = chars[i];
            }
        }
        return new MyString2(temp);
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            str.append(chars[i]);
        }
        return str.toString();
    }

    public char[] toChars() {
        char[] temp = new char[chars.length];
        System.arraycopy(chars, 0, temp, 0, chars.length);
        return temp;
    }
}


