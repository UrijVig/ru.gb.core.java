package src.main.java.app.ceckLogik;

import src.main.java.app.ceckLogik.exception.WrongLoginException;
import src.main.java.app.ceckLogik.exception.WrongPasswordException;

public class Authentication {

    public static void loginCheck(String login) throws WrongLoginException {
        if (login.length() < 20) throw new WrongLoginException("Логин слишком короткий!");

    }

    public static void passCheck(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.equals(confirmPassword)) throw new WrongPasswordException("Пароли не совпадают!");
    }
}
