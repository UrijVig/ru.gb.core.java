package src.main.java.app.model;

import java.util.Date;
import java.util.Random;

public abstract class Animal {
    protected String name;
    protected double jumpHeight;
    protected double runningDistance;
    protected double sailingDistance;
    protected static final Random random = new Random();

    public Animal(String name){
        this.name = name;
    }

    public abstract boolean run(double distance);
    public abstract boolean jump(double height);
    public abstract boolean swim(double distance);

    public String getName() {
        return name;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public double getRunningDistance() {
        return runningDistance;
    }

    public double getSailingDistance() {
        return sailingDistance;
    }
}
