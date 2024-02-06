package src.main.java.app.ceckLogik.exception;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(){
        super();
    }
    public  WrongPasswordException(String massage){
        super("WrongPasswordException: " + massage);
    }
}
