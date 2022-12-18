package lesson_12;

import lesson_12.additional.Day;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Создать коллекцию HashMap турнирная таблица");
        HashMap<String, Integer> table = new HashMap<>();
        table.put("Динамо", 5);
        table.put("Шахтер", 3);
        table.put("Спартак", 1);
        System.out.println("----------------------------");
        System.out.println("2. При повторе ключа значение переписывается");
        table.put("Спартак", 4);
        System.out.println("----------------------------");
        System.out.println("3. containsKey() - содержится ли такой ключ в мапе");
        System.out.println(table.containsKey("Динамо"));
        System.out.println(table.containsKey("Зенит"));
        System.out.println("----------------------------");
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("aaa");
//        strings.add("bbb");
//        strings.add("ccc");
        System.out.println("4. Проход по коллекции HashMap");
        for (Map.Entry<String, Integer> entry : table.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("----------------------------");
        System.out.println("5. Вернуть ключи нашей мапы");
        for (String key: table.keySet()) {
            System.out.println(key + "; ");
        }
        System.out.println("----------------------------");
        System.out.println("6. Вернуть значения нашей мапы");
        for (String key: table.keySet()) {
            System.out.println(table.get(key));
        }
        Day today = Day.FRIDAY;
        Day [] days = Day.values();
        for (Day d : days) {
            System.out.println(d);
        }
    }
}
