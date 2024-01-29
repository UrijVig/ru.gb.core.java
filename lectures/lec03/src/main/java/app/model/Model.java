package src.main.java.app.model;


import src.main.java.app.model.exAnimal.Bird;
import src.main.java.app.model.exAnimal.Cat;
import src.main.java.app.model.exAnimal.Dog;

import java.util.Random;

public class Model {
    private final Random random = new Random();

    private int getRandomInt(){
        return random.nextInt(3,7);
    }

    private String getRandomName(){
        int len = getRandomInt();
        StringBuilder result = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < len; i++) {
            result.append(alphabet.charAt(random.nextInt(0, alphabet.length())));
        }
        return result.toString();
    }
    public Animal getRandomAnimal(){
        String name = getRandomName();
        int randomAnimal = random.nextInt(3);
        switch (randomAnimal){
            case 0:
                return new Cat(name);
            case 1:
                return new Dog(name);
            case 2:
                return new Bird(name);
            default:
                System.out.println("Что-то пошло не так!");
        }
        return null;
    }

}
