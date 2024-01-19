package src.main.java.app.view;

import src.main.java.app.model.UserModel;

/**
 * Класс работы с пользователем
 */
public class UserView {
    private final UserModel userModel;

    public UserView() {
        userModel = new UserModel();
    }

    /**
     * Метод запуска приложения
     */
    public void run() {
        int userLength = 64;
        byte[] userArray = new byte[userLength];
        userModel.getRandomArray(userArray);
        for (byte item : userArray) {
            System.out.print(item + " ");
        }
        System.out.println();
        userModel.oneFlip(userArray);
        for (byte item : userArray) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
