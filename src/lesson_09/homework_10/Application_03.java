package lesson_09.homework_10;

import java.util.ArrayList;

//1. Создай список слов, заполни его самостоятельно.
//2. Метод fix должен:
//2.1. удалять из списка строк все слова, содержащие букву "р"
//2.2. удваивать все слова содержащие букву "л".
//2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
//2.4. с другими словами ничего не делать.
public class Application_03 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i < 2; i++) {
            if (strings.get(i).contains("р") && strings.get(i).contains("л")) {
                strings.get(i);
            }else  if (strings.get(i).contains("р")) {
                strings.remove(i);
                i --;
            } else if (strings.get(i).contains("л")) {
               String t = strings.get(i);
               strings.set(i, t +" " + t);
            } else {
                strings.get(i);
            }
        }
        return strings;
}
}
