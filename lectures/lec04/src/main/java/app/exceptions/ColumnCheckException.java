package src.main.java.app.exceptions;

public class ColumnCheckException extends Exception{
    public ColumnCheckException(String massage){
        super("ColumnCheckException" + massage);
    }
}