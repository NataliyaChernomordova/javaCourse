package lesson_09_10.homework_09;

import java.util.ArrayList;
import java.util.Scanner;
// 1. Создай список строк.
//2. Считай с клавиатуры 5 строк и добавь в список.
//3. Используя цикл, найди самую длинную строку в списке.
//4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
public class Application_02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            list.add(scanner.nextLine());
        }
        String max = list.get(0);
        for (int i = 0; i < 5; i++) {
            String t = list.get(i);
            if(t.length() > max.length()) {
                max = t;
            } else if (i != 0) {
                if (max.equals(t)) {
                    System.out.println(t);
                }
            }
        }
        System.out.println(max);
    }
}
