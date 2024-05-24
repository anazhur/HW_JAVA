package org.example.hw.hw_1;

public class MathOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Сумма: " + add(a, b));
        System.out.println("Разность: " + subtract(a, b));
        System.out.println("Произведение: " + multiply(a, b));
        System.out.println("Частное: " + divide(a, b));
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }
    
    public static int divide(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Ошибка: Деление на ноль!");
            return 0;
        }
    }
}


