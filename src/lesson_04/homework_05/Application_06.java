package lesson_04.homework_05;

import java.util.Scanner;

public class Application_06 {
    //Создать массив на 20 чисел.
    //Заполнить его числами с клавиатуры.
    //Найти максимальное и минимальное числа в массиве.
    //Вывести на экран максимальное и минимальное числа через пробел.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int [20];
        int i = 0;
        int max = array [0];

        for (; i < 20; i++) {
            array[i] = scanner.nextInt();
        } i = 0;
        int min = array [0];
        while (i < 20) {
            if (array[i] > max) {
                max = array[i];
                i++;
            }
            else if (array[i] < min) {
                min = array[i];
                i++;
            } else {
                i++;
            }
        }System.out.println(max + " " + min);


    }
}
