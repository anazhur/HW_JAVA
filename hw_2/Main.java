package org.example.hw.hw_2;

public class Main {
    public static void main(String[] args) {

        String hexNumber = "333";
        int decimalFromHex = Integer.parseInt(hexNumber, 16);
        System.out.println("333 в 16-ричной -> " + decimalFromHex + " в 10-ричной");

        int decimalNumber = 819;
        String hexFromDecimal = Integer.toHexString(decimalNumber);
        System.out.println("819 в 10-ричной -> " + hexFromDecimal + " в 16-ричной");

        String binaryNumber = "101101";
        int decimalFromBinary = Integer.parseInt(binaryNumber, 2);
        System.out.println("101101 в двоичной -> " + decimalFromBinary + " в 10-ричной");

        int decimalForBinary = 124;
        String binaryFromDecimal = Integer.toBinaryString(decimalForBinary);
        System.out.println("124 в 10-ричной -> " + binaryFromDecimal + " в двоичной");
    }
}

class Concatenation {
    public static void main(String[] args) {
        // Создание двух строк
        String str1 = "Hello, ";
        String str2 = "world!";

        // Конкатенация строк
        String result = str1 + str2;

        // Вывод результата
        System.out.println(result);
    }
}
