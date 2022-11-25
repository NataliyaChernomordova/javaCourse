package lesson_09.homework;

import java.util.ArrayList;
//1. Создай список строк.
//2. Добавь в него 5 различных строк.
//3. Выведи его размер на экран.
//4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
public class Application_01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(105);
        list.add(306);
        list.add(202);
        list.add(111);
        list.add(469);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
