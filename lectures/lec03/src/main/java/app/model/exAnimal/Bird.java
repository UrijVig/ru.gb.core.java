package src.main.java.app.model.exAnimal;

import src.main.java.app.model.Animal;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
        this.runningDistance = 2.2 + (2.2 / 100 * random.nextDouble(-25,+26));
        this.jumpHeight = 100.5 + (10.5 / 100 * random.nextDouble(-25,+26));
        this.sailingDistance = 2.1 + (2.1 / 100 * random.nextDouble(-25,+26));
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
        return Bird.class.getSimpleName();
    }

}
