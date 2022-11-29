package lesson_09.homework_09;

import java.util.ArrayList;
import java.util.Scanner;

//1. Создай список строк.
//2. Добавь в него 10 строчек с клавиатуры.
//3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
//Если таких строк несколько, то должны быть учтены самые первые из них.
//4. Выведи на экран строку из пункта 3. Должна быть выведена одна строка.
public class Application_06 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            arrayList.add(scanner.nextLine());
        }
        String min = arrayList.get(0);
        String max = arrayList.get(0);
        for (int i = 0; i < 10; i++) {
            String s = arrayList.get(i);
            String t = arrayList.get(i);
            if (min.length() > s.length()) {
                min = s;
            } else if (t.length() > max.length()) {
                max = t;
            }
        }





    }
}