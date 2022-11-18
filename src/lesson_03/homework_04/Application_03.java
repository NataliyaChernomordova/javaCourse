package lesson_03.homework_04;

import java.util.Scanner;

public class Application_03 {
    // Ввести с клавиатуры три числа, вывести на экран среднее из них.
    //Т.е. не самое большое и не самое маленькое.
    //Если все числа равны, вывести любое из них.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a < b && a > c || a < c && a > b) {
            System.out.println(a);
        } else if (b < a && b > c || b < c && b > a) {
            System.out.println(b);
        } else if (c < a && c > b || c < b && c > a) {
            System.out.println(c);
        } else if (a == b && c == a) {
            System.out.println(a);
        } else {
            System.out.println("Не подходит под условия");
        }
    }
}
