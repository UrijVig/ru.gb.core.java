package src.main.java.app.ceckLogik.exception;

public class WrongLoginException extends Exception{
    public WrongLoginException(){
        super();
    }
    public  WrongLoginException(String massage){
        super("WrongLoginException: " + massage);
    }
}
