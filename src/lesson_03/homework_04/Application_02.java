package lesson_03.homework_04;

import java.util.Scanner;

public class Application_02 {
    //Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
    //Пример вывода на экран:
    //8
    //88
    //888
    //8888
    //88888
    //888888
    //8888888
    //88888888
    //888888888
    //8888888888
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int t = 0; t < i; t++) {
                System.out.print("8");
            } System.out.println(" ");
        }
    }
}
