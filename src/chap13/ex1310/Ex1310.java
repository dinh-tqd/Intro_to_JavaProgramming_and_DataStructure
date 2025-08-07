package chap13.ex1310;

public class Ex1310 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 4);
        Rectangle r2 = new Rectangle(1, 8);
        System.out.println(r1.compareTo(r2));
        System.out.println(r1.equals(r2));
    }
}
