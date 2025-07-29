package basics;
public class PalindromeNumber {
    static int reverseInteger(int n){
        int ans = 0;
        while (n > 0){
            int digit = n % 10;
            ans = ans * 10 + digit;
            n = n / 10;
        }
        return ans;
    }
    static boolean isPalindrome(int n){
        int original = n;
        int reverse = reverseInteger(n);
        return original == reverse;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
