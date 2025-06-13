package chap07;

public class Ex0714_notDone {
    public static void main(String[] args) {
        System.out.println(gcd(80, 40));
        System.out.println(gcd(80, 40, 100));
        System.out.println(gcd(80, 40, 1000, 200));
    }

    public static int gcd(int... numbers) {
        if (numbers.length == 0 || numbers.length == 1) {
            return 0;
        }
        else if (numbers.length == 2) {
            return gcd(numbers[0], numbers[1]);
        }
        int result = 0;
        int x = gcd(numbers[0], numbers[1]);
        for (int i = 2; i <  numbers.length; i++) {
            result = gcd(x, numbers[i]);
            x = result;
        }
        return result;

    }

    public static int gcd(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }
}
