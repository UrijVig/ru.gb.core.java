package src.main.java.app.view;

import src.main.java.app.model.UserModel;

/**
 * Класс для работы с пользовательскими данными
 */
public class UserView {
    private final UserModel userModel;

    /**
     * Конструктор класса без параметров
     */
    public UserView() {
        this.userModel = new UserModel();
    }

    /**
     * Метод запуска программы
     */
    public void run() {
        int userLength = 10, userShift = -4;
        int[] userArray = new int[userLength];
        userModel.randomArray(userArray);
        for (int item : userArray) {
            System.out.print(item + " ");
        }
        System.out.println();
        for (int item : userModel.shift(userArray, userShift)) {
            System.out.print(item + " ");
        }
        System.out.println();

    }
}
