package lesson_09_10.homework_09;

import java.util.ArrayList;
import java.util.Scanner;

// 1. Создай список строк в методе main.
//2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
//3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
public class Application_04 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            String t = scanner.nextLine();
            list1.add(0, t);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(list1.get(i));
        }

    }


}
