package dsa.algos.dynamicProgramming;

import java.util.Arrays;

public class FibonacciMemo {
    public static int fib(int n, int[] dp){
        if(n <= 1) return n;
        // Step 2: If you know the answer, don't calculate, return it
        // Memoization
        if(dp[n] != -1){
            return dp[n];
        }
        // Step 3: If you don't have the value, calculate
        return dp[n] = fib(n-1, dp) + fib(n-2, dp);
    }
    public static void main(String[] args) {
        int n = 6;
        // Step 1:
        // Create a dp array of n+1 of all -1 values
        int[] dp = new int[n+1]; // 0-based indexing
        Arrays.fill(dp, -1); // Fill with default -1
        System.out.println("Fibonacci of: " + n + "th is "
                + fib(n, dp));
    }
}
