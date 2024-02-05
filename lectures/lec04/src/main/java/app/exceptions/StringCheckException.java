package src.main.java.app.exceptions;

public class StringCheckException extends Exception{
    public StringCheckException(String massage){
        super("StringCheckException" + massage);
    }
}