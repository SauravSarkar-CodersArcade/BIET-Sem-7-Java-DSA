package basics;
public class ArmstrongNumber {
    static int numberOfDigits(int n){ // 1 2 3 4
        int digits = 0;
        while (n > 0){
            digits++;
            n = n / 10;
        }
        return digits;
    }
    static boolean isArmstrong(int n){
        int originalNumber = n;
        int digits = numberOfDigits(n); // 4
        // int digits = String.valueOf(n).length();
        int sum = 0;
        while (n > 0){
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n = n / 10;
        }
        return sum == originalNumber;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(9474));
    }
}
