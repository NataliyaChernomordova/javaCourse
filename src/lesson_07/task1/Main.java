package lesson_07.task1;

public class Main {
    public static void main(String[] args) {
        Animal[] zoo = new Animal[10];
        Dog dog = new Dog();
        Cat cat = new Cat();
        Horse horse = new Horse();

        dog.setFood("Bones");
        dog.setLocation("Dvor");

        cat.setFood("Milk");
        cat.setLocation("Dvor");

        horse.setFood("Seno");
        horse.setLocation("Sarai");

        zoo [0] = dog;
        zoo [1] = cat;
        zoo [2] = horse;

        Veterinar aibolit = new Veterinar();
        for (int i = 0; i < zoo.length; i++) {
            if (zoo [i] != null) {
                aibolit.treatAnimal(zoo[i]);
            }
        }
    }
}
