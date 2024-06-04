package exception;

public class AgeCheckException extends Exception{
    public AgeCheckException(String message) {
        super(message);
        System.out.println("Hata yakalandı");
    }
}
