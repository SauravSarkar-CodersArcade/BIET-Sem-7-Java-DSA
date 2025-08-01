package exceptions.customExceptions.checked;
// A checked exception should be handled using try-catch or throws
public class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
