package basics;
public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        while (n != 1 && n != 4){
            int sum = 0;
            while (n > 0){
                int d = n % 10;
                sum += d * d;
                n /= 10;
            }
            n = sum;
        }
        System.out.println(n == 1 ? "Happy" : "Not Happy");
    }
}
