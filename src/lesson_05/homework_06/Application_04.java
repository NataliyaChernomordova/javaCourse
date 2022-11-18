package lesson_05.homework_06;

import java.util.Scanner;

public class Application_04 {
    // 1. Создать массив на 10 строк.
    //2. Создать массив на 10 чисел.
    //3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
    //4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки
    //которой совпадает с текущим индексом из массива чисел.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] str = new String[10];
        int [] str2 = new int [10];
        for (int i =0; i < 10; i++) {
            str [i] = scanner.nextLine();
        }
        for(int i = 0; i < str2.length; i++ ) {
            str2[i] = str[i].length();
        }
        for(int i = 0; i < str2.length; i++) {
            System.out.println(str[i]);
        }
    }
}
