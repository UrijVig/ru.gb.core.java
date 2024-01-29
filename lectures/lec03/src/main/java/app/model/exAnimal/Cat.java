package src.main.java.app.model.exAnimal;

import src.main.java.app.model.Animal;

public class Cat extends Animal {
    static private int count = 0;
    private final int catCount;

    public Cat(String name) {
        super(name);
        this.runningDistance = 50.2 + (50.2 / 100 * random.nextDouble(-25,+26));
        this.jumpHeight = 1.5 + (1.5 / 100 * random.nextDouble(-25,+26));
        this.sailingDistance = 0.1 + (0.1 / 100 * random.nextDouble(-25,+26));
        this.catCount = ++Cat.count;
    }

    public boolean run(double distance) {
        return distance <= this.runningDistance;
    }

    public boolean jump(double height) {
        return height <= this.jumpHeight;
    }

    public boolean swim(double distance) {
        return distance <= this.sailingDistance;
    }
    public String getClassname() {
        return Cat.class.getSimpleName();
    }

    public int getCount() {
        return this.catCount;
    }

}
