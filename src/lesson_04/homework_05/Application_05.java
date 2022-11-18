package lesson_04.homework_05;

import java.util.Scanner;

public class Application_05 {
    //1. Создать массив на 20 чисел.
    //2. Ввести в него значения с клавиатуры.
    //3. Создать два массива на 10 чисел каждый.
    //4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
    //5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int [] array = new int [20];
        while (i < 20) {
        for (; i < 20; i++) {
            array[i] = scanner.nextInt();
        }
        i = 0;
            int[] array2 = new int[10];
            for (; i < 10; i++) {
                array2[i] = array[i];
            }
            int[] array3 = new int[10];
            for (; i >= 10 && i < 20; i++) {
                int t = 0;
                array3[t] = array[i];
                System.out.println(array3[t]);
            }
        }
    }
}
