package lesson_04.homework_05;

import java.util.Scanner;

public class Application_03 {
    //1. Создать массив на 10 строк.
    //2. Создать массив на 10 чисел.
    //3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
    //4. В каждую ячейку массива чисел записать длину строки из массива строк,
    //индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] array = new String[10];
        int [] array2 = new int [10];
        for (int i =0; i < 10; i++) {
            array [i] = scanner.nextLine();
        }
        for(int i = 0;i < array2.length;i++ )
        {
            array2 [i] = array[i].length();
        }
        for(int i = 0;i < array2.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}
