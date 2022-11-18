package lesson_03.homework_04;

public class Application_05 {
    //Вывести на экран таблицу умножения 10х10 используя цикл while.
    //Числа разделить пробелом.
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        while (a <= 10) {
            while ( b <= 10) {
                System.out.print(a * b + " ");
                b++;
            }
            System.out.println();
            a++;
            b = 1;
        }


    }
}
