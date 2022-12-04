package lesson_09_10.homework_10;

import java.util.ArrayList;

//1. Создай список из слов "мама", "мыла", "раму".
//2. После каждого слова вставь в список строку, содержащую слово "именно".
//3. Вывести результат на экран, каждый элемент списка с новой строки.
public class Application_02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        list.add(1, "именно");
        list.add(3, "именно");
        list.add(5, "именно");
        for (int i = 0; i <= 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
