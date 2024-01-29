package src.main.java.app.model.exAnimal;

import src.main.java.app.model.Animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        this.runningDistance = 500.2 + (500.2 / 100 * random.nextDouble(-25,+26));
        this.jumpHeight = 1.1 + (1.1 / 100 * random.nextDouble(-25,+26));
        this.sailingDistance = 20.3 + (20.3 / 100 * random.nextDouble(-25,+26));
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
        return Dog.class.getSimpleName();
    }

}
