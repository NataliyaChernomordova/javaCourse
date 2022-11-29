package lesson_09.homework_09;

import java.util.ArrayList;
import java.util.Scanner;

//1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
//Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
//Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
//Порядок объявления списков очень важен.
//1.1 Создай метод printList
//2. Метод printList должен выводить на экран все элементы списка с новой строки.
//3. Используя метод printList выведи эти три списка на экран.
//Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
public class Application_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        ArrayList<Integer> third = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            list.add(scanner.nextInt());
        }
        for (int i = 0; i < 10; i++) {
            int t = list.get(i);
            if (t % 2 == 0 || t % 2 == 0 && t % 3 == 0) {
                first.add(list.get(i));
            } else if (t % 3 == 0 || t % 2 == 0 && t % 3 == 0) {
                second.add(list.get(i));
            } else {
                third.add(list.get(i));
            }
        }
        printList(first);
        printList(second);
        printList(third);
    }

    private static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));
        }
    }
}
