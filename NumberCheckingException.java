package Custom_Exception;

public class NumberCheckingException extends RuntimeException{

    public NumberCheckingException(String message) {
        super(message);
    }
}
