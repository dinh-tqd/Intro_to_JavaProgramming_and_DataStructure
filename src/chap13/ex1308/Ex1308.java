package chap13.ex1308;

public class Ex1308 {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(new Circle(1));
        s.push(new Square(2));
        s.push(new Rectangle(1, 2));

        System.out.println(s.toString());

        System.out.print("\n\n\n\n\n");

        System.out.println(s.pop());
        System.out.print("\n\n\n");
        System.out.println(s.toString());
    }
}
