package lesson_07.task1;

public class Dog extends Animal {
    private boolean canBringTheBones;

    public boolean isCanBringTheBones() {
        return canBringTheBones;
    }

    public void setCanBringTheBones(boolean canBringTheBones) {
        this.canBringTheBones = canBringTheBones;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
