package chap13.ex1304;

public class TestEx1304 {
    public static void main(String[] args) {
        // Test trường hợp 1: Chỉ có 1 tham số (tháng)
        System.out.println("Test với 8");
        String[] argsOneParam = {"8"}; // Tháng 8
        Ex1304.main(argsOneParam);
        System.out.println("--------------------------------");

        // Case 2: 2 parameters
        System.out.println("Test with 12 2025");
        String[] argsTwoParams = {"12", "2025"}; // December 2025
        Ex1304.main(argsTwoParams);
        System.out.println("--------------------------------");

        // Case 3: No parameters
        System.out.println("Test with no parameters");
        String[] argsNoParam = {};
        Ex1304.main(argsNoParam);
        System.out.println("--------------------------------");

        // Case 4: 3 parameters
        System.out.println("Test with 10 2025 8");
        String[] args3Param = {"10", "2025", "8"};
        Ex1304.main(argsNoParam);
        System.out.println("--------------------------------");
    }
}