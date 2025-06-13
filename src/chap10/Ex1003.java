package chap10;

public class Ex1003 {
    public static void main(String[] args) {
        MyInteger numberObj1 = new MyInteger(5);
        System.out.println(numberObj1.getValue());

        System.out.println();
        //

        System.out.println(numberObj1.isEven());
        System.out.println(numberObj1.isOdd());
        System.out.println(numberObj1.isPrime());

        System.out.println();
        //

        System.out.println(MyInteger.isEven(2));
        System.out.println(MyInteger.isOdd(2));
        System.out.println(MyInteger.isPrime(2));

        System.out.println();
        //

        System.out.println(MyInteger.isEven(numberObj1));
        System.out.println(MyInteger.isOdd(numberObj1));
        System.out.println(MyInteger.isPrime(numberObj1));

        System.out.println();
        //

        System.out.println(MyInteger.parseInt("1995"));
        System.out.println(MyInteger.parseInt(new char[] {'1', '2' ,'2'}));
    }
}

