package lesson_12;

import java.util.HashMap;

public class Fridge {
    //Поля
    private HashMap<String, Integer> products = new HashMap<>();
    //Конструктор

    //Методы
    public void putProuducts (String product, Integer value){
        if (products.containsKey(product)) {
            products.put(product, products.get(product));
        } else {

        }
    }

    public void getProducts(String product, Integer value) {
        //Если продукта в холодильнике нет
        if (!products.containsKey(product)) {
            System.out.println("Такого продукта " + product + " нет");
            return;
        }
        // Если продукта не хватает
        if (products.get(product) < value){
            System.out.println("Не хватает " + (value - products.get(product) +
                    ", вы взяли" + products.get(product) + " " + product));
            return;
        }
        // Если продукта больше, чем берём
        if (products.get(product) > value) {
            System.out.println("сталось продукта" + (products.get(product) - value) + "" + product);
            products.remove(product);
        }
        if (products.get(product) == value) {
            System.out.println("Все продукты разобраны" + products.get(product));
            products.remove(product);
        }

    }
}
