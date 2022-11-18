package lesson_04.homework_05;

import java.util.Scanner;

public class Application_01 {
    // 1. Создать массив на 10 строк.
    //2. Ввести с клавиатуры 8 строк и сохранить их в массив.
    //3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        String [] array = new String[10];
        for (; i < 8; i++) {
            array[i] = scanner.nextLine();
        } i++;
        for (;i >= 0 && i < 10; i--){
            System.out.println(array[i]);
        }

    }
}
