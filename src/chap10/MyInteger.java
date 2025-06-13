package chap10;

public class MyInteger {
    private int i;

    MyInteger(int value) {
        this.i = value;
    }

    public int getValue() {
        return i;
    }

    public boolean isEven() {
        return i % 2 == 0;
    }

    public boolean isOdd() {
        return i % 2 == 1;
    }

    public boolean isPrime() {
        if (i < 2) return false;
        for (int i = 2; i <= (int) Math.sqrt(this.i); i++) {
            if (this.i % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int i) {
        return i % 2 == 0;
    }

    public static boolean isOdd(int i) {
        return i % 2 == 1;
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger i) {
        return i.getValue() % 2 == 0;
    }

    public static boolean isOdd(MyInteger i) {
        return i.getValue() % 2 == 1;
    }
    public static boolean isPrime(MyInteger numberObject) {
        int value = numberObject.getValue();
        return MyInteger.isPrime(value);
    }

    public boolean equals(int i) {
        return this.i == i;
    }

    public boolean equals(MyInteger numberObject) {
        return i == numberObject.getValue();
    }

    public static int parseInt(char[] charArray) {
        int result = 0;
        for (int i = charArray.length - 1; i >= 0; i-- ) {
            result += (charArray[i] - '0') * (int)(Math.pow(10, charArray.length - 1 - i))  ;
        }
        return result;
    }

    public static int parseInt(String s) {
        char[] array = s.toCharArray();
        return parseInt(array);
    }
}

