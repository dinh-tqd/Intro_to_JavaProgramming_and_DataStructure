package chap10;

import java.util.Arrays;

public class Ex1022 {
    public static void main(String[] args) {
        MyString1 myString = MyString1.valueOf(-1995);
        System.out.println(Arrays.toString(myString.toChars()));
    }
}

class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        char[] chars = new char[end - begin];
        System.arraycopy(this.chars, begin, chars, 0, end - begin);
        return new MyString1(chars);
    }

    public MyString1 toLowerCase() {
        char[] chars = new char[length()];
        for (int i = 0; i < chars.length; i++) {
            if (this.chars[i] >= 'A' && this.chars[i] <= 'Z') {
                chars[i] = (char)(this.chars[i] - 'A' + 'a');
            } else {
                chars[i] = this.chars[i];
            }
        }
        return new MyString1(chars);
    }

    public boolean equals(MyString1 s) {
        if (this == s) return true;
        if (length() != s.length()) return false;
        for (int i = 0; i < length(); i++) {
            if (s.toChars()[i] != chars[i]) {
                return false;
            }
        }
        return true;
    }

    public static MyString1 valueOf(int i) {
        boolean negative = i < 0;
        int alt = (int)Math.abs(i);
        int digitCount = 0;
        if (i == 0) {
            return new MyString1(new char[] {'0'});
        }

        char[] temp = new char[40];
        while (alt != 0) {
            temp[digitCount] = (char)(alt % 10 + '0');
            alt /= 10;
            digitCount++;
        }

        int size = negative ? digitCount + 1: digitCount;
        char[] temp2 = new char[size];
        for (int count =  0; count < digitCount; count++) {
            temp2[size - count - 1] = temp[count];
        }

        if (negative) {
            temp2[0] = '-';
        }

        return new MyString1(temp2);
    }

    public char[] toChars() {
        return chars;
    }
}


