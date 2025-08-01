package exceptions.customExceptions.checked;
public class TestCheckedException {
    public static void checkAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age should be greater than or equal to 18");
        }else {
            System.out.println("Eligible to vote.");
        }
    }
    public static void main(String[] args) {
        try {
            checkAge(12);
        }catch (InvalidAgeException e){
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
