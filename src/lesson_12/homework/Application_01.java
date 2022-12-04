package lesson_12.homework;

import java.util.HashMap;
import java.util.Map;
//1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
//2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
//3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
//4. Вывести содержимое Map на экран.
public class Application_01 {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Иванов", "Григорий");
        dictionary.put("Петров", "Василий");
        dictionary.put("Стукалов", "Иван");
        dictionary.put("Гущин", "Михаил");
        dictionary.put("Корнев", "Лев");
        dictionary.put("Петров", "Пётр");
        dictionary.put("Клоков", "Иван");
        dictionary.put("Иванов", "Кирилл");
        dictionary.put("Харин", "Михаил");
        dictionary.put("Хворых", "Лев");
        System.out.println(dictionary);
    }
}
