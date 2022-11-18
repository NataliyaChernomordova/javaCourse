package lesson_04.homework_05;

import java.util.Scanner;

public class Application_07 {
    //Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int j = i;
        int [] array = new int [10];
        int max = array [i];
//        int number = array [0];

//        while (i < 10) {
            for (; i < 10; i++) {
                array[i] = scanner.nextInt();
            }
//        }
            i = 0;
        for (; i < 9; i++) {
//            int max = array[i];
//            int j = i;
            while (j < 9 && array[j+1] < max) {
                array[j] = array[j + 1];


//                if (array[max] < array [j]) {
//                    max = j;
//            }
//            if (max != i) {
//                int number = array [i];
//                array [i] = array [max];
//                array [max] = number;
//            }
//            System.out.println(array[max]);
        }
            ;
        }array[j] = max;
        System.out.println( array [max]);

    }
}
