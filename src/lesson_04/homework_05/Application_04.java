package lesson_04.homework_05;

import java.util.Scanner;

public class Application_04 {
    //1. Создать массив на 10 чисел.
    //2. Ввести с клавиатуры 10 чисел и записать их в массив.
    //3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        int [] array = new int [10];
        array [i] = 0;
        for (; i < 10; i++) {
            array[i] = scanner.nextInt();
        } i--;
        for (;i >= 0 && i < 10; i--){
            System.out.println(array[i]);
        }
    }
}
