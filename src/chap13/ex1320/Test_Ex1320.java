// Uncomment some code lines in Ex1320 to run this

package chap13.ex1320;

public class Test_Ex1320 {
    public static void main(String[] args) {
        // Discriminant = 0
        Ex1320.main(new String[]{"1", "2", "1"});
        System.out.println("---");

        // Discriminant < 0
        Ex1320.main(new String[]{"1", "2", "3"});

        // Discriminant > 0
        System.out.println("---");
        Ex1320.main(new String[]{"1", "3", "1"});

    }
}
