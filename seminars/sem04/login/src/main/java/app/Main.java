package src.main.java.app;

import src.main.java.app.ceckLogik.Authentication;
import src.main.java.app.ceckLogik.exception.WrongLoginException;
import src.main.java.app.ceckLogik.exception.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        System.out.println(authenticationCheck("lo2545215834634634642125", "5", "5"));

    }
    public static boolean authenticationCheck(String login, String password, String confirmPassword){
        try {
            Authentication.loginCheck(login);
            Authentication.passCheck(password,confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
