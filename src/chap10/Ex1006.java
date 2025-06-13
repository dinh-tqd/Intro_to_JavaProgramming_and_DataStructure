package chap10;

public class Ex1006 {
    public static void main(String[] args) {
        StackOfIntegers st1 = new StackOfIntegers();

        for (int i = 0; i <= 120; i++) {
            if (MyInteger.isPrime(i)) {
                st1.push(i);
            }
        }

        while (st1.getSize() != 0) {
            System.out.println(st1.pop());
        }
    }
}
