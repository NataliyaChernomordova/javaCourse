package lesson_05;

import java.util.Scanner;

public class String_Applicatoin {
    public static void main(String[] args) {
        String str = "Hello world!";
        String str1 = new String("Hello world");
        str1 += "!";

        System.out.println(str);
        System.out.println(str1);

        for (int i = 0; i < 10; i++) ;
        System.out.println(str1);
        /**
         String !


         length() - возвращает длину строки

         concat(): объединяет строки / +=

         equals(): сравнивает строки с учетом регистра

         equalsIgnoreCase(): сравнивает строки без учета регистра

         startsWith(): определяет, начинается ли строка с подстроки

         endsWith(): определяет, заканчивается ли строка на определенную подстроку

         String replace(char oldChar, char newChar)
         Возвращает новую строку, в результате, заменив все вхождения oldChar в этой строке на newChar.

         String[] split(String regex)
         Разделяет эту строку, окружая данным регулярным выражением.

         trim(): удаляет начальные и конечные пробелы

         toLowerCase(): переводит все символы строки в нижний регистр

         toUpperCase(): переводит все символы строки в верхний регистр
         * */
       int lenght = str.length();
        System.out.println(lenght);

        String str2 = "hello world!";

        boolean equals = str.equals(str1);
        boolean b = str.equalsIgnoreCase(str2);

        boolean hello = str2. startsWith("world!");

        boolean b1 = str2.endsWith("world!");
        String str3 = str2.replace("world", "Russia");

        String latter = "Hello my dear friend";
        String [] array = latter.split(" ");


        System.out.println(equals);
        System.out.println(b);
        System.out.println(hello);
        System.out.println(b1);

        System.out.println(str3);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].toUpperCase() + " ");
        }

        System.out.println("\n");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].toLowerCase() + " ");
        }

        String str4 = latter.trim();
        System.out.println(str4);

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.printf("Меня зовут %s. Мне %d лет.", name, age);

    }
}
