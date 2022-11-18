package lesson_06;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat barsik = new Cat("Barsik");
//        Cat murzik = new Cat("Murzik", "Black");
        Cat snezhok = new Cat("Snezhok", 7, 8.3,"Red");
        Cat neizv = new Cat();

        System.out.println(barsik.getName() + "" + "" + snezhok.getName() +"" + neizv.getName());
        snezhok.setAge(8);
        neizv.setName("Kot");
        neizv.setAge(8);
        neizv.setWeight(5.2);
        neizv.setColor("Green");

        Dog sharik = new Dog("Sharik", 10, 5, "white");




        animal.say();
        snezhok.say();
        sharik.say();

    }
}
