package ru.gb.jcore.tictactoe.src.main.java.app.model;

import ru.gb.jcore.tictactoe.src.main.java.app.view.Field;

import java.util.Random;

public class AI {
    private final char DOT;
    private final Random random;

    public AI(char ch) {
        DOT = ch;
        random = new Random();
    }

    void turn(Field field) {
        int x, y;
        do {
            x = random.nextInt(field.getSize());
            y = random.nextInt(field.getSize());
        } while (!field.isCellValid(x, y));
        field.setDot(x, y, DOT);
    }
}
