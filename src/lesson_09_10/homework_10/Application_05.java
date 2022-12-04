package lesson_09_10.homework_10;

import java.util.ArrayList;
import java.util.Scanner;

//1. Введи с клавиатуры 10 слов в список строк.
//2. Определить, является ли список упорядоченным по возрастанию длины строки.
//3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
public class Application_05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            list.add(scanner.nextLine());
        }

        for (int i = 1; i < 10; i++) {
            String t = list.get(i);
            String string = list.get(i - 1);
            if (string.length() > t.length()){
                System.out.println(i);
            }
        }
    }
}
