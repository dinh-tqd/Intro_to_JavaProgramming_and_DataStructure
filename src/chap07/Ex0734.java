package chap07;

public class Ex0734 {
    public static void main(String[] args) {
        String originalString = "acbegasdiasndsa";
        System.out.println(sort(originalString));
    }

    public static String sort(String s) {
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        return new String(charArray);
    }


//    Hàm này dùng StringBuilder. Chưa học đến ở chap này nên không thích dùng. Mà code này cũng dài dòng hơn
//    public static String sort(String s) {
//        StringBuilder newString = new StringBuilder(s);
//        for (int i = 0; i < newString.length(); i++) {
//            for (int j = i + 1; j < newString.length(); j++) {
//                if (newString.charAt(i) > newString.charAt(j)) {
//                    char temp = newString.charAt(i);
//                    newString.setCharAt(i, newString.charAt(j));
//                    newString.setCharAt(j, temp);
//                }
//            }
//        }
//        return newString.toString();
//    }
}
