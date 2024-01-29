package src.main.java.app.model.exAnimal;

import src.main.java.app.model.Animal;

public class Cat extends Animal {
    static private int count;

    public Cat(String name) {
        super(name);
        this.runningDistance = 50.2 + (50.2 / 100 * random.nextDouble(-25,+26));
        this.jumpHeight = 1.5 + (1.5 / 100 * random.nextDouble(-25,+26));
        this.sailingDistance = 0.1 + (0.1 / 100 * random.nextDouble(-25,+26));
        Cat.count++;
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

    public static int getCount() {
        return count;
    }

}
