package lesson_05.homework_06;

import java.util.Scanner;

public class Application_05 {
    //1. Считать 6 строк и заполнить ими массив strings.
    //2. Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[6];
        int i = 0;
//        int j = 0;
        for (; i < str.length; i++) {
            str[i] = scanner.nextLine();
        }
        i = 0;
        for (; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equalsIgnoreCase(str[j])) {
                    str[i] = " ";
                    str[j] = " ";
                }
            }
        }
        i = 0;
        for (; i < str.length; i++) {
            System.out.println(str[i]);

        }
    }
}
