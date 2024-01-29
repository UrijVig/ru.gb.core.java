package src.main.java.app.view;

import src.main.java.app.model.Animal;
import src.main.java.app.model.Model;
import src.main.java.app.model.exAnimal.Cat;

import java.util.ArrayList;

public class UserView {
    public void run() {
        ArrayList<Animal> animals = new ArrayList<>();
        Model model = new Model();
        for (int i = 0; i < 10; i++) {
            animals.add(model.getRandomAnimal());
        }
        for (Animal animal : animals) {
            System.out.println(animal.getClassname());
            System.out.println(animal.getName());
            System.out.println("Забег на дистанцию 50.2: " + animal.run(50.2));
            System.out.println("Пройдено : " + animal.getRunningDistance());
            System.out.println("Заплыв на дистанцию 2,1: " + animal.swim(2.1));
            System.out.println("Пройдено : " + animal.getSailingDistance());
            System.out.println("Прыжок на высоту 1,5: " + animal.jump(1.5));
            System.out.println("Прыжок : " + animal.getJumpHeight());
            if (animal.getClassname().equals("Cat")){
                Cat cat = (Cat) animal;
                System.out.println(cat.getCount());
            }
            System.out.println("_________________________________________________\n");

        }


    }
}
