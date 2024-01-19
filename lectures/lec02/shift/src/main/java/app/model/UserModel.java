package src.main.java.app.model;

import java.util.Random;

/**
 * Класс обработки данных
 */
public class UserModel {

    /**
     * Метод создания массива из случайных элементов
     *
     * @param userArray ссылка на массив с длинной, которыую указал пользователь
     */
    public void randomArray(int[] userArray) {
        Random random = new Random();
        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = random.nextInt(-100, 100);
        }
    }

    /**
     * Метод сдвига элементов массива
     *
     * @param userArray ссылка на массив пользователя
     * @param userShift величина сдвига, указанная пользователем
     * @return ссылка на массив, созданный путём циклического сдвига элементов пользовательского массива
     */
    public int[] shift(int[] userArray, int userShift) {
        int sift = userShift % userArray.length;
        int[] newArray = new int[userArray.length];
        if (sift == 0) return userArray;
        else if (sift > 0) {
            for (int i = 0; i < userArray.length; i++) {
                newArray[((i + sift) % userArray.length)] = userArray[i];
            }
            return newArray;
        } else {
            for (int i = userArray.length - 1; i >= 0; i--) {
                newArray[i] = userArray[((i - sift) % userArray.length)];
            }
            return newArray;
        }
    }
}
