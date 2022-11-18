package lesson_02.homework_02;

public class Application_03 {
    // Задача 3. Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут,
    // насколько быстрее голодный Вася съедает один банан? Вывести на консоль
    public static void main(String[] args) {
        int a = 9;
        int b = 15;
        int c = 3;
        int speed = (b - a) / c; // На сколько быстрее
        System.out.println(speed);

        // или
        int d = 9;
        int t = 15;
        int f = 3;
        int res = (t / f) - (d / f); // На сколько быстрее
        System.out.println(res);
    }
}
