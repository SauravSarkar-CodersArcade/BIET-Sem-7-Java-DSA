package dsa.algos.dynamicProgramming;
public class FibonacciTabulation {
    public static int fib(int n){
        if(n <= 1) return n;
        // Step 1: Create the dp array (n+1) with -1 values
        int[] dp = new int[n+1];
        // Step 2: Store the known values (Tabulation)
        dp[0] = 0;
        dp[1] = 1;
        // Step  3: calculate the unknown values
        for (int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println("Fibonacci of: " + n + "th is "
                + fib(n));
    }
}
