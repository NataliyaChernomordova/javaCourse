package lesson_03.homework_04;

import java.util.Scanner;

public class Application_04 {
    // Вводить с клавиатуры числа.
    //Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
    //-1 должно учитываться в сумме.
    //Подсказка: один из вариантов решения этой задачи, использовать конструкцию:
    //while (true) {
    //   int number = считываем число;
    //   if (проверяем, что number -1)
    //       break;
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
        while (true){
            int number = scanner.nextInt();
                sum = sum + number;
            if (number == -1) {
                System.out.println(sum);
                break;
            }
        }
    }
}
