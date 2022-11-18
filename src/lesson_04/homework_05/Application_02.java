package lesson_04.homework_05;

import java.util.Scanner;

public class Application_02 {
    // 1.1. Создай массив на 10 чисел
    //1.2. Считай с консоли 10 чисел и заполни ими массив
    //2. Найти максимальное число из элементов массива
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int [10];
        int i = 0;
        int max = array [0];
        while (i < 10) {
            for (; i < 10; i++) {
                array[i] = scanner.nextInt();
            }
            i = 0;
            while (i < 10) {
                if (array[i] > max) {
                    max = array[i];
                }
                i++;
            }
            System.out.println(max);
        }
    }
}
