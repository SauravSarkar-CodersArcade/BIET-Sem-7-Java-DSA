package exceptions.customExceptions.unchecked;
// Create a unchecked exception using Runtime Exception class
// We don't need try-catch or throws
public class NegativeNumberException extends RuntimeException{
    public NegativeNumberException(String message){
        super(message);
    }
}
