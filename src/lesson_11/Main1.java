package lesson_11;

public class Main1 {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик");
        dog.putCollar();
        dog.putLeash();
        try {
            dog.walk();
        } catch (DogIsNotReadyToWalkException e){
            e.printStackTrace();
        }
    }
}
