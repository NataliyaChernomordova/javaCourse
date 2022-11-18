package lesson_02.homework_03;

public class Application_02 {
    //  Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого часа в течение
//  трех минут горит зелёный сигнал, затем в течение одной минуты - жёлтый, а потом в течение
//  одной минуты - красный, затем опять зелёный горит три минуты и т. д.
//  Подать программе вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
    public static void main(String[] args) {
        double t = 13.43;
        if (t >= 0 && t < 3) {
            System.out.println("зеленый");
        } else if (t >= 3 && t < 4) {
            System.out.println("желтый");
        } else if (t >= 4 && t < 5) {
            System.out.println("красный");
        } else if (t >= 5 && t < 8) {
            System.out.println("зеленый");
        } else if (t >= 8 && t < 9) {
            System.out.println("желтый");
        } else if (t >= 9 && t < 10) {
            System.out.println("красный");
        }  else if (t >= 10 && t < 13) {
            System.out.println("зеленый");
        } else if (t >= 13 && t < 14) {
            System.out.println("желтый");
        } else if (t >= 14 && t < 15) {
            System.out.println("красный");
        }  else if (t >= 15 && t < 18) {
            System.out.println("зеленый");
        } else if (t >= 18 && t < 19) {
            System.out.println("желтый");
        } else if (t >= 19 && t < 20) {
            System.out.println("красный");
        } else if (t >= 20 && t < 23) {
            System.out.println("зеленый");
        } else if (t >= 23 && t < 24) {
            System.out.println("желтый");
        } else if (t >= 24 && t < 25) {
            System.out.println("красный");
        } else if (t >= 25 && t < 28) {
            System.out.println("зеленый");
        } else if (t >= 28 && t < 29) {
            System.out.println("желтый");
        } else if (t >= 29 && t < 30) {
            System.out.println("красный");
        } else if (t >= 30 && t < 33) {
            System.out.println("зеленый");
        } else if (t >= 33 && t < 34) {
            System.out.println("желтый");
        } else if (t >= 34 && t < 35) {
            System.out.println("красный");
        } else if (t >= 35 && t < 38) {
            System.out.println("зеленый");
        } else if (t >= 38 && t < 39) {
            System.out.println("желтый");
        } else if (t >= 39 && t < 40) {
            System.out.println("красный");
        } else if (t >= 40 && t < 43) {
            System.out.println("зеленый");
        } else if (t >= 43 && t < 44) {
            System.out.println("желтый");
        } else if (t >= 44 && t < 45) {
            System.out.println("красный");
        } else if (t >= 45 && t < 48) {
            System.out.println("зеленый");
        } else if (t >= 48 && t < 49) {
            System.out.println("желтый");
        } else if (t >= 49 && t < 50) {
            System.out.println("красный");
        } else if (t >= 50 && t < 53) {
            System.out.println("зеленый");
        } else if (t >= 53 && t < 54) {
            System.out.println("желтый");
        } else if (t >= 54 && t < 55) {
            System.out.println("красный");
        } else if (t >= 55 && t < 58) {
            System.out.println("зеленый");
        } else if (t >= 58 && t < 59) {
            System.out.println("желтый");
        } else if (t >= 59 && t < 60) {
            System.out.println("красный");
        } else {
            System.out.println("Сбой!");
        }
    }
}
