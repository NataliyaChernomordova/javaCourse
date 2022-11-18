package lesson_03.homework_04;

import java.util.Scanner;

public class Application_06 {
    //Ввести с клавиатуры строку name.
    //Ввести с клавиатуры дату рождения (три числа): y, m, d.
    //Вывести на экран текст:
    //"Меня зовут name.
    //Я родился d.m.y"

    //Пример вывода:
    //Меня зовут Вася.
    //Я родился 15.2.1988
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int y = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        while (true) {
            System.out.println("Меня зовут" + " " + name + ".");
            System.out.println("Я родилась" + " " + y + "." + m + "." + d);
            break;
        }

    }
}
