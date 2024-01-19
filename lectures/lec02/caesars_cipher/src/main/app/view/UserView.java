package src.main.app.view;

import src.main.app.model.CaesarModel;

/**
 * Класс для работы с данными пользователя
 */
public class UserView {
    private final CaesarModel caesarModel;

    public UserView() {
        this.caesarModel = new CaesarModel();
    }

    /**
     * Метод для запуска программы
     */
    public void run() {
        String data = "строка пользователя", encryptedData, decryptedData;
        int key = 4;
        boolean encrypt = true, decrypt = false;
        caesarModel.setData(data);
        encryptedData = caesarModel.Encrypt(encrypt, key);
        decryptedData = caesarModel.Encrypt(decrypt, key);
        System.out.println(encryptedData);
        System.out.println(decryptedData);
    }
}
