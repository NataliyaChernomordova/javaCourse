package lesson_12.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
//Используй коллекции.
public class Application_02 {
    public static void main(String[] args) {
        Map<String, Integer> calendar = new HashMap<>();
        calendar.put("January", 1);
        calendar.put("February", 2);
        calendar.put("March", 3);
        calendar.put("April", 4);
        calendar.put("May", 5);
        calendar.put("June", 6);
        calendar.put("July", 7);
        calendar.put("August", 8);
        calendar.put("September", 9);
        calendar.put("October", 10);
        calendar.put("November", 11);
        calendar.put("December", 12);
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        for (String key: calendar.keySet()) {
            if (month.equals(key)){
                System.out.println(key + " is the " + calendar.get(key) + " month");
            }
        }
    }
}
