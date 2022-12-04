package lesson_09_10.homework_10;

import java.util.ArrayList;
import java.util.Scanner;

// 1. Введи с клавиатуры 10 слов в список строк.
//2. Метод doubleValues должен удваивать слова по принципу:
//"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
//3. Выведи результат на экран, каждое значение с новой строки.
public class Application_04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            list.add(scanner.nextLine());
        }
        ArrayList t = doubleValues (list);
        for (int i = 0; i < 10; i++) {
            System.out.println(t.get(i));
        }

    }

    private static ArrayList doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            list.set(i, s +" " + s);
        }
        return list;
    }
}
