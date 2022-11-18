package lesson_05.homework_06;

import java.util.Scanner;

public class Application_01 {
    //Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
    // Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
//    Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
//    Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
//    Программа выводит слова на экран.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str.toUpperCase());

        System.out.println();

        String str1 = scanner.nextLine();
        if (str1.length() % 2 == 0) {
            System.out.println(str1 + " " + str1);
        }
        else {
            System.out.println(str1 + " " + str1 + " " + str1);
        }


    }


}
