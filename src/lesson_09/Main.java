package lesson_09;

import lesson_08.models.CardImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
    /**
     * Блок теории1 Коллекция - это массив с неограниченным размером и различными типами данных,
     * кроме ArrayList, там один тип данныхю.
     * Если несколько вариантов коллекций:
     * Интерфейсы коллекций: Collection и Map
     *
     */
    public static void main(String[] args) {
        int [] array = new int[7];
        int a = 0;
        Integer b = 10;

        // 1. Создания коллекции и добавление в неё элементов
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);

        // 2. метод add() - с указанием индекса

        list.add(2,88);


        // 3. метод set() - затирает значение по определенному индексу

        list.set(3,99);

        // 4. метод size() -  возвращает размер коллекции

        System.out.println(list.size());

        // 5. get() - брать объекты нашей коллекции

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " , ");
        }

        for (Integer c : list) {
            System.out.print(c + ", ");
        }

        // 6. toArray () - преобразование коллекции в массив

        Object [] objects = list.toArray();
        for (Object o : objects) {
            System.out.println(o + " , ");
        }

        System.out.println();

        // 7. метод contains() - содержит ли коллекция определенный элемент
        System.out.println("В коллекции содержится число 101 - " + list.contains(101));
        System.out.println("В коллекции содержится число 88 - " + list.contains(88));

        // 8. addAll() - добавить все элементы в новую коллекцию

        ArrayList<Integer> copyList = new ArrayList<>();
        copyList.addAll(list);
         // 9. remove() - удаление элементов коллекции по определенному индексу

        System.out.println("До вызова метода remove() по индексу 0" + list);
        list.remove(0);
        System.out.println("После вызова метода remove() по индексу 0" + list);

        // 10. метод indexOf(), возвращающий индекс элемента коллекции

        System.out.println("Индекс элемента 88 - " + list.indexOf(88));

        // 11. sort() - сортировка
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(11);
//        list1.add(99);
//        list1.add(77);
//        list1.add(55);
//        list1.add(22);

        // 12. isEmpty() - проверка пустой лист или нет

        System.out.println(list.isEmpty());

        // 13. clear() - удаление всех элементов коллекции

        list.clear();



        System.out.println(list);

        System.out.println();

//        Method.print(3);

        ArrayList<CardImpl> cards = new ArrayList<>();
        CardImpl cards1 = new CardImpl("nbyjhyn", 1);
        CardImpl cards2 = new CardImpl("nbyjhyn", 1);
        CardImpl cards3 = new CardImpl("nbyjhyn", 1);
        CardImpl cards4 = new CardImpl("nbyjhyn", 1);
        CardImpl cards5 = new CardImpl("nbyjhyn", 1);

        cards.add(cards1);

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        System.out.println(list);
        for (Integer i : list) {
            System.out.println(i);
        }

        TreeSet<Integer> treeSet = new TreeSet<>(new ReverseIntegers());

        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(18);
        treeSet.add(25);
        treeSet.add(17);
        treeSet.add(22);

        TreeSet<String> treeSet1 = new TreeSet<>();

        treeSet1.add("AAA");
        treeSet1.add("aaa");
        treeSet1.add("BBB");
        treeSet1.add("CCC");
        treeSet1.add("DDD");
        treeSet1.add("ddd");
        System.out.println();

    }
}
