package lesson_09;

import java.util.ArrayList;
import java.util.List;

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
    }
}
