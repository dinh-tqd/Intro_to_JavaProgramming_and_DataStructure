package chap10.chap14HowtoProgram;

public class Ex1416 {
    public static void main(String[] args) {
        MyString s = new MyString("Hello World World");
        System.out.println(s.toString());

        System.out.println();
        System.out.println(s.indexOf('o'));
        System.out.println(s.indexOf("ello"));
        System.out.println(s.indexOf("World"));

        System.out.println();
        System.out.println(s.lastIndexOf('o'));
        System.out.println(s.lastIndexOf("ello"));
        System.out.println(s.lastIndexOf("World"));
    }
}

class MyString {
    private char[] chars;

    MyString(String s) {
        chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
    }

    public String toString() {
        return new String(chars);
    }

    public int indexOf(char c) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                return i;
            }
        }
        return -1;
    }

    public int indexOf(String substring) {
        for (int i = 0; i + substring.length() <= chars.length; i++) {
            int j;
            for (j = 0; j < substring.length(); j++) {
                if (chars[i + j] != substring.charAt(j)) {
                    break;
                }
            }
            if (j == substring.length()) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(char c) {
        for (int j = chars.length - 1; j >= 0; j--) {
            if (chars[j] == c) {
                return j;
            }
        }
        return -1;
    }

    public int lastIndexOf(String substring) {
        for (int i = chars.length - substring.length() ; i >= 0; i--) {
            int j;
            for (j = 0; j < substring.length(); j++) {
                if (chars[i + j] != substring.charAt(j)) {
                    break;
                }
            }
            if (j == substring.length()) {
                return i;
            }
        }
        return -1;
    }
}
