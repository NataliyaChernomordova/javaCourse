package lesson_08.homewor_07;

public class Person {
    private String fullName;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void move(){
        System.out.println(getFullName() + "" + "говорит");
    }

    public void talk(){
        System.out.println(getFullName() + "" + "говорит");
    }

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public Person(int age) {
        this.age = age;
    }

    Person person = new Person();
    Person gosha = new Person(18);

}
