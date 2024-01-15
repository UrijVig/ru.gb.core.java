package ru.gb.jcore;

import ru.gb.jcore.view.UserView;
/**
 * Класс для запуска приложения (точка входа)
 */
public class Calculator {
    public static void main(String[] args) {
        UserView userView = new UserView();
        userView.run();
    }
}