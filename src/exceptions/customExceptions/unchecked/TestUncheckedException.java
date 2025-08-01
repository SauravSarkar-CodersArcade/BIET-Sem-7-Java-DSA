package exceptions.customExceptions.unchecked;
// Not mandatory to use try-catch or throws
public class TestUncheckedException {
    public static int squareRoot(int n){
        if(n < 0){
            throw new NegativeNumberException
                    ("Can't find square root of negative numbers.");
        }
        return (int) Math.sqrt(n);
    }
    public static void main(String[] args) {
//        try {
//            int sqrt = squareRoot(-4);
//        }catch (NegativeNumberException e){
//            System.out.println("Error: " + e.getMessage());
//        }
        squareRoot(-64);
    }
}
