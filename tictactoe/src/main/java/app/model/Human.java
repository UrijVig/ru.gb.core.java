package ru.gb.jcore.tictactoe.src.main.java.app.model;

import ru.gb.jcore.tictactoe.src.main.java.app.view.Field;

/**
 * Класс, представляющий игрока
 */
public class Human {
    private final char DOT; // Символ, используемый игроком

    /**
     * Конструктор, устанавливающий символ игрока
     *
     * @param ch символ игрока
     */
    public Human(char ch) {
        DOT = ch; // Установка символа игрока
    }

    /**
     * Метод, осуществляющий ход игрока
     *
     * @param x координата X
     * @param y координата Y
     * @param field игровое поле
     * @param ai объект искусственного интеллекта
     */
    public void turn(int x, int y, Field field, AI ai) {
        if (field.isCellValid(x, y)) { // Проверка на валидность клетки
            if (!field.isGameOver()) field.setDot(x, y, DOT); // Установка символа игрока
            if (!field.isGameOver()) ai.turn(field); // Ход искусственного интеллекта
        }
    }
}
