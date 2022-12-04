package lesson_12.homework;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
//Новая задача: Программа должна работать не с номерами домов, а с городами
public class Application_03 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        map.put(33, "Ивановы");
        map.put(26, "Петровы");
        map.put(15, "Абрамовичи");
        Integer number = scanner.nextInt();
        for (Integer key: map.keySet()) {
            if (number != null){
                if (number.equals(key)) {
                    System.out.println(map.get(key));
                }
            }
        }
        Map<String,String> map1 = new HashMap<>();
        while (true) {
            String city = scanner.nextLine();
            if (city.isEmpty()) {
                break;
            }
            String family = scanner.nextLine();
            map1.put(city, family);
        }

        String city = scanner.nextLine();

        if (map1.containsKey(city)) {
            String familyName = map1.get(city);
            System.out.println(familyName);
        }
    }
}
