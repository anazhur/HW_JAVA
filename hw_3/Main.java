package org.example.hw.hw_3;

public class Main {

        public static void main(String[] args) {
            // Два числа для операций
            double num1 = 10.0;
            double num2 = 5.0;

            System.out.println("Сложение: " + add(num1, num2));
            System.out.println("Вычитание: " + subtract(num1, num2));
            System.out.println("Умножение: " + multiply(num1, num2));
            System.out.println("Деление: " + divide(num1, num2));
        }

        public static double add(double a, double b) {
            return a + b;
        }

        public static double subtract(double a, double b) {
            return a - b;
        }

        public static double multiply(double a, double b) {
            return a * b;
        }

        public static double divide(double a, double b) {
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Ошибка: Деление на ноль!");
                return 0;
            }
        }

}
