package src.main.app;

import src.main.app.view.UserView;

/**
 * Основной класс приложения
 */
public class Application {
    /**
     * Точка входа в приложение
     * @param args системный параметр
     */
    public static void main(String[] args) {
        UserView userView = new UserView();
        userView.run();
    }
}
