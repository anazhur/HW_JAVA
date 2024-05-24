package org.example.hw.hw_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                String myString = new String("I study Basic Java!");
                processString(myString);
            }
            public static void processString(String str) {
                System.out.println("Пред-последний символ: " + str.charAt(str.length() - 2));

                boolean containsJava = str.contains("Java");
                System.out.println("Содержит 'Java': " + containsJava);

                String withoutJava = str.substring(0, str.indexOf("Java")) + str.substring(str.indexOf("Java") + 4);
                System.out.println("Строка без 'Java': " + withoutJava);

                String replacedString = str.replace('a', 'o');
                System.out.println("Замена 'a' на 'o': " + replacedString);

                String upperCaseString = str.toUpperCase();
                System.out.println("В верхнем регистре: " + upperCaseString);

                String lowerCaseString = str.toLowerCase();
                System.out.println("В нижнем регистре: " + lowerCaseString);
    }
}



