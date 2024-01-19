package src.main.app.model;

/**
 * Класс для работы с методами шифрования по Цезарю
 */
public class CaesarModel {
    private String data;
    private boolean is_encrypted;
    public CaesarModel() {
        this.data = "";
    }

    /**
     * Метод для определения работы шифра Цезаря
     * @param flag true - зашифровать данные, false - расшифровать данные
     * @param key ключ
     * @return зашифрованые или расшифрованные данные (в зависимости от флага)
     */
    public String Encrypt(boolean flag, int key) {
        if (flag) return encrypt(key);
        return decrypt(key);
    }

    private String encrypt(int key){
        char[] charArray = data.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] + key);
        }
        is_encrypted = true;
        data = String.valueOf(charArray);
        return getData();
    }
    private String decrypt(int key){
        char[] charArray = data.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] - key);
        }
        is_encrypted = false;
        data = String.valueOf(charArray);
        return getData();
    }

    /**
     * Метод получения данных
     * @return данные
     */
    public String getData() {
        return data;
    }

    /**
     * Метод редактирования данных в случае если они не зашифрованы
     * @param data новые данные
     */
    public void setData(String data) {
        if (!is_encrypted) this.data = data;
    }
}
