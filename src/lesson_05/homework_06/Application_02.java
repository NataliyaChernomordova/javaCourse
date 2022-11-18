package lesson_05.homework_06;

import java.util.Scanner;

public class Application_02 {
    //Ввести 5 строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        String [] str = new String[5];
        for (; i < 5; i++) {
            str [i] = scanner.nextLine();
        }
        i = 0;
        String max = str [0];
        String min = str [0];

        while (i < 5) {
            String t = str [i];
            if (t.length() > max.length()) {
                max = str[i];
                i++;
            }
            else if (t.length () < min.length()) {
                min = str[i];
                i++;
            } else {
                i++;
            }
        }System.out.println(max + " " + min );

    }
}
