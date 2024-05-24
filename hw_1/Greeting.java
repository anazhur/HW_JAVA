package org.example.hw.hw_1;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем имя пользователя
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        // Выводим приветственное сообщение
        System.out.println("Добрый день, " + name + "!");

        // Улучшенная версия
        System.out.println("Ваше имя начинается с символа " + name.charAt(0) + " и заканчивается на символ " + name.charAt(name.length() - 1) + ".");
    }
}
