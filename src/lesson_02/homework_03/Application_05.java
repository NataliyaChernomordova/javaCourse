package lesson_02.homework_03;

import java.util.Scanner;

public class Application_05 {
    //Напиши программу, которая по номеру месяца должна определить время года (зима, весна, лето, осень) и вывести на экран.
    //
    //Пример для номера месяца 2:
    //зима
    //Пример для номера месяца 5:
    //весна
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        if (month >= 1 && month <=2) {
            System.out.println("Зима");
        } else if (month >= 3 && month <=5) {
            System.out.println("Весна");
        } else if (month >= 6 && month <=8) {
            System.out.println("Лето");
        } else if (month >= 9 && month <=11) {
            System.out.println("Осень");
        } else if (month == 12) {
            System.out.println("Зима");
        } else {
            System.out.println("Нет такого времени года");
        }
    }
}
