package lesson_06;

public class Cat extends Animal{
    //1. Поля
//    private String name;
//    private int age;
//    private double weight;
//    private String color;
//
    //2. Конструктор

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, int age, double weight, String color) {
        super(name, age, weight, color);
    }

//
//    public Cat() {
//    }
//
//    public Cat(String name) {
//        this.name = name;
//    }
//
//    public Cat(String name, String color) {
//        this.name = name;
//        this.color = color;
//    }
//
//    public Cat(String name, int age, double weight, String color) {
//        this.name = name;
//        this.age = age;
//        this.weight = weight;
//        this.color = color;
//    }
//
//    //3. Методы

    @Override
    public void say() {
        System.out.println("Cat said meow...");
    }

//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public double getWeight() {
//        return weight;
//    }
//
//    public void setWeight(double weight) {
//        this.weight = weight;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }


}
