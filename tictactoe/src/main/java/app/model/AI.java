package ru.gb.jcore.tictactoe.src.main.java.app.model;

import ru.gb.jcore.tictactoe.src.main.java.app.view.Field;

import java.util.Random;

/**
 * Класс, представляющий искусственный интеллект
 */
public class AI {
    private final char DOT; // Символ, используемый искусственным интеллектом
    private final Random random; // Генератор случайных чисел

    /**
     * Конструктор класса AI
     *
     * @param ch символ искусственного интеллекта
     */
    public AI(char ch) {
        DOT = ch; //Установка символа искусственного интеллекта
        random = new Random(); // Инициализация генератора случайных чисел
    }

    /**
     * Метод, осуществляющий ход искусственного интеллекта
     *
     * @param field объект игрового поля
     */
    void turn(Field field) {
        int x, y;
        do {
            x = random.nextInt(field.getSize()); // Генерация случайной координаты X
            y = random.nextInt(field.getSize()); // Генерация случайной координаты Y
        } while (!field.isCellValid(x, y)); // Повторять генерацию, пока клетка не будет проходной
        field.setDot(x, y, DOT); // Установка символа искусственного интеллекта на выбранной клетке
    }
}
