package lesson_03;

public class Application {
    public static void main(String[] args) {
        // Циклы
        // fori, while, foreach

        // fori

        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
//
//        for (int i = 0; i < 5; i++) { // i = i + 1
//            System.out.println("Hello world");

        System.out.println();



        // 1. всеывести в цикле все четные числа от 1 до 50
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        // 2. вывести все цифры от 1 до 100, которые делятся на 3 и на 5 одновременно
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " ");
            }
        }
        // 3 сложить цифры от 10 до 20
        int count = 0;

        for (int i = 10; i <= 20; i++) {
            count += i; {
                System.out.println(count);
            }
        }
        // 4. Вывести в консоль все числа от 10 до 40, но пропустив цифры от 15 до 20
        for (int i = 10; i <= 40; i++) {
            if ( i < 15 || i > 20) {
                System.out.println(i + " ");
            }
        }
        // 5 Вывести сумму всех четных чисел от 10 до 50
         int sum = 0;
        for (int i = 10; i <= 50 ; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        int counter = 10;
        while (counter > 0) {
            System.out.println("Обратный отчсчет" + counter + "секунд");
            counter--;
        }

    }

}
