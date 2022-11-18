package lesson_02.homework_03;

import java.util.Scanner;

public class Application {
    // По второй задаче
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v = (double) scanner.nextDouble();
        v = v % 5;
        if (v >= 0 && v < 3) {
            System.out.println("зеленый");
        } else if (v >= 3 && v < 4) {
            System.out.println("желтый");
        } else {
            System.out.println("красный");
        }
    }
}
