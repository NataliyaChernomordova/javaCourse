package lesson_09.homework_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Application_01 {
    //Введи с клавиатуры 5 слов в список строк.
    //Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            list.add(scanner.nextLine());
        }
        list.remove(2);
        for (int i = 3; i < 4 && i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
