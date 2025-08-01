package exceptions;
public class E3 {
    static void checkAge(int age){
        if(age >= 18){
            System.out.println("Access Granted: Eligible");
        }else {
            throw new RuntimeException("Access Denied: Not Eligible");
        }
    }
    public static void main(String[] args) {
        checkAge(21);
        checkAge(12);
    }
}
