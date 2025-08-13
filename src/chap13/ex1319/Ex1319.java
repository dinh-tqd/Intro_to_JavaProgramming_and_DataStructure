package chap13.ex1319;

import java.math.BigInteger;
import java.util.Scanner;
import java.lang.StringBuilder;

public class Ex1319 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String inputNumber = input.nextLine();
        StringBuilder intPart =  new StringBuilder();
        StringBuilder fractionalPart = new StringBuilder();
        int decimalPointLocation = -1;

        for (int i = 0; i < inputNumber.length(); i++) {
            if (decimalPointLocation == -1 && inputNumber.charAt(i) != '.') {
                intPart.append(inputNumber.charAt(i));
            } else if (inputNumber.charAt(i) == '.') {
                decimalPointLocation = i;
            } else {
                fractionalPart.append(inputNumber.charAt(i));
            }
        }

        System.out.println(intPart);
        System.out.println(fractionalPart);
        System.out.println(fractionalPart.length());

        Rational r1 = new Rational(new BigInteger(intPart.toString()), BigInteger.ONE);
        Rational r2 = new Rational(new BigInteger(fractionalPart.toString()), BigInteger.TEN.pow(fractionalPart.length()));
        System.out.println(r1.add(r2));
    }
}

/*
  Code này chưa :
  1. Kiểm tra input:
  Chuỗi rỗng, chỉ chứa dấu chấm, hoặc dấu âm với chấm
  Kiểm tra các kí tự không phải số

  2. Hỗ trợ số âm

  3. Xử lí trường hợp đặc biệt:
  Không có phân nguyên (Ví dụ: ".123456")
  Không có phần thập phân (Ví dụ: "12345")
 */
