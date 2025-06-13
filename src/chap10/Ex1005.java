package chap10;

public class Ex1005 {
    public static void main(String[] args) {
        StackOfIntegers st1 = new StackOfIntegers();

        int number = 120;
        int i = 2;
        while (number != 1) {
            if (number % i == 0) {
                st1.push(i);
                number = number / i;
            } else {
                i++;
            }
        }

        while (st1.getSize() != 0) {
            System.out.println(st1.pop());
        }

    }
}

