package src.main.java.app.model.exception;

public class ProductException extends Exception{
    public ProductException(){
        super();
    }
    public ProductException(String massage){
        super(massage);
    }
}