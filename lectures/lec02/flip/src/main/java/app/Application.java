package src.main.java.app;

import src.main.java.app.view.UserView;

/**
 * Основной класс приложения
 */
public class Application {
    /**
     * Точка входа
     *
     * @param args системный параметр
     */
    public static void main(String[] args) {
        UserView userView = new UserView();
        userView.run();
    }

}
