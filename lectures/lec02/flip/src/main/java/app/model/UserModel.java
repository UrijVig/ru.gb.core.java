package src.main.java.app.model;

import java.util.Random;

/**
 * Клас обработки данных пользователя
 */
public class UserModel {
    /**
     * Метод создания случайно заполненного нулями и единицами массива
     *
     * @param userArray ссылка на массив длинной, заданной пользователем
     */
    public void getRandomArray(byte[] userArray) {
        Random random = new Random();
        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = (byte) random.nextInt(0, 2);
        }
    }

    /**
     * Метод замены нулей и единиц
     *
     * @param userArray ссылка на массив пользователя
     */
    public void oneFlip(byte[] userArray) {
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] == 0){
                userArray[i]++;
            } else userArray[i]--;
        }
    }
}
