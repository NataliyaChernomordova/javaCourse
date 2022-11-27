package lesson_09.homework_09;

import java.util.ArrayList;
import java.util.Scanner;
//1. Создай список строк.
//2. Считай с клавиатуры 5 строк и добавь в список.
//3. Используя цикл, найди самую короткую строку в списке.
//4. Выведи найденную строку на экран.
//5. Если таких строк несколько, выведи каждую с новой строки.
public class Application_03 {
    public static void main(String[] args) {
       ArrayList<String> arrayList = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            arrayList.add(scanner.nextLine());
        }
        String min = arrayList.get(0);
        for (int i = 0; i < 5; i++) {
            String s = arrayList.get(i);
            if (min.length() > s.length()) {
                min = s;
            }
            else if (i != 0) {
                if (min.equals(s)) {
                    System.out.println(s);
                }
            }
        }
        System.out.println(min);
    }
}
