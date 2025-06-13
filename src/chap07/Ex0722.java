package chap07;

public class Ex0722 {
    public static void main(String[] args) {
        /// HeLLOdarknessMyOldFriend
        String myString = args[0];

        int uppercaseCount = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) >= 'A' && myString.charAt(i) <= 'Z') {
                uppercaseCount++;
            }
        }
        System.out.println(uppercaseCount++);
    }
}
