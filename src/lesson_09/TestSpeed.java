package lesson_09;

import java.util.*;

public class TestSpeed {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        long start = System.currentTimeMillis();
//
//        for (int i = 0; i < 10000000; i++) {
//            arrayList.add(i);
//        }
//
//        long end = System.currentTimeMillis();
//        System.out.println("Добавление ArrayList заняло " + (end - start));
//
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        for (int i = 0; i < 10000000; i++) {
//            linkedList.add(i);
//        }
//        System.out.println("Добавление LinkedList заняло " + (end - start));
//
//        long start1 = System.currentTimeMillis();
//
//        for (int i = 0; i < 100000; i++) {
//            arrayList.remove(i);
//        }
//
//        long end1 = System.currentTimeMillis();
//        System.out.println("Удаление ArrayList заняло " + (end1 - start1));
//
//        for (int i = 0; i < 100000; i++) {
//            linkedList.remove(i);
//        }
//        System.out.println("Удаление LinkedList заняло " + (end1 - start1));


//        for (int i = 0; i < 10; i++) {
//            arrayList.add(i);
//        }
//
//        for (int i = 0; i < 10; i++) {
//            arrayList.add(i + 10);
//        }

//        while (a > 0) {
//            System.out.println("Обратный отсчет" + a);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            a--;
//        }
        HashSet<String> strings = new HashSet<>();
        strings.add("AAAAA");
        strings.add("BBBBB");
        strings.add("CCCCC");
        strings.add("CCCCC");
        strings.add("DDDDD");
        strings.add(null);

        LinkedHashSet<String> strings1 = new LinkedHashSet<>();
        strings1.add("AAAAA");
        strings1.add("BBBBB");
        strings1.add("CCCCC");
        strings1.add("CCCCC");
        strings1.add("DDDDD");
        strings1.add(null);

        for (Iterator<String> iter = strings1.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());
        }


        System.out.println();
    }
}
