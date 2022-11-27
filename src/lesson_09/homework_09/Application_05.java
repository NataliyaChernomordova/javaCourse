package lesson_09.homework_09;

import java.util.ArrayList;
import java.util.Scanner;

// 1. Создай список строк.
//2. Добавь в него 5 строк с клавиатуры.
//3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
//4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
public class Application_05 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            arrayList1.add(scanner.nextLine());
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 13; j++) {
                String t = arrayList1.get(4);
                arrayList1.remove(4);
                arrayList1.add(0,t);
//                System.out.println(arrayList1.get(i));
            }
            System.out.println(arrayList1.get(i));
        }



        }
}
