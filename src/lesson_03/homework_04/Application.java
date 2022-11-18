package lesson_03.homework_04;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //Ввести с клавиатуры два числа m и n.
        //Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
        //Пример: m=2, n=4
        //8888
        //8888

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.print("8");
            for (int t = 1; t < n; t++) {
                System.out.print("8");
            } System.out.println(" ");
        }
    }

}
