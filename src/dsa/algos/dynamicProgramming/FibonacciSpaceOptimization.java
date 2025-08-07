package dsa.algos.dynamicProgramming;
public class FibonacciSpaceOptimization {
    public static int fib(int n){
        if(n <= 1) return 1;
        int p2 = 0;
        int p1 = 1;
        for (int i=2; i<=n; i++){
            int curr = p2 + p1;
            p2 = p1;
            p1 = curr;
        }
        return p1;
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println("Fibonacci of: " + n + "th is "
                + fib(n));
    }
}
/*
LCS - Longest-Common Subsequence
01 Knapsack
Climbing Stairs
Longest-Increasing Subsequence
 */
