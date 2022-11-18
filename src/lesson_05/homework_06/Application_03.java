package lesson_05.homework_06;

import java.util.Scanner;

public class Application_03 {
    // 1. Создать массив на 10 строк.
    //2. Ввести с клавиатуры 8 строк и сохранить их в массив.
    //3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        String [] str = new String[10];
        for (; i < 8; i++) {
            str[i] = scanner.nextLine();
        } i++;
        for (;i >= 0 && i < 10; i--){
            System.out.println(str[i]);
        }
    }
}
