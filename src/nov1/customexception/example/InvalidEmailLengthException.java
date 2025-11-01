package nov1.customexception.example;

public class InvalidEmailLengthException extends RuntimeException{
    public InvalidEmailLengthException(String message) {
        super(message);
    }
}
