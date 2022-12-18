package lesson_12;

public class Main2 {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        fridge.putProuducts("Яблоко", 2);
        fridge.putProuducts("Яблоко", 1);
        fridge.putProuducts("Груша", 3);
        fridge.putProuducts("Банан", 3);
        fridge.putProuducts("Апельсин", 2);
        fridge.putProuducts("Киви", 4);
        fridge.putProuducts("Груша", 10);

        fridge.getProducts("Яблоко", 5);
        fridge.getProducts("Молоко", 1);
        fridge.getProducts("Груша", 5);
        fridge.getProducts("Апельсин", 2);

    }
}
