package chap13.ex1304;

public class TestEx1304 {
    public static void main(String[] args) {
        // Case 1: 1 parameter (month)
        System.out.println("Test with 8");
        String[] argsOneParam = {"8"}; // Tháng 8
        Ex1304.main(argsOneParam);
        System.out.print("--------------------------------\n\n\n\n");

        // Case 2: 2 parameters
        System.out.println("Test with 12 2025");
        String[] argsTwoParams = {"12", "2025"}; // December 2025
        Ex1304.main(argsTwoParams);
        System.out.print("--------------------------------\n\n\n\n");

        // Case 3: No parameters
        System.out.println("Test with no parameters");
        String[] argsNoParam = {};
        Ex1304.main(argsNoParam);
        System.out.print("--------------------------------\n\n\n\n");

        // Case 4: 3 parameters
        System.out.println("Test with 10 2025 8");
        String[] args3Param = {"10", "2025", "8"};
        Ex1304.main(args3Param);
        System.out.print("--------------------------------\n\n\n\n");
    }
}