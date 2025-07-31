package basics;
public class LeetCode1823 {
    static int solve(int n, int k){
        // Base case
        if(n == 1){
            return 0; // 0 modulo
        }
        return (solve(n-1, k) + k) % n;
    }
    public static int findTheWinner(int n, int k) {
        int winner = solve(n,k) + 1; // Add 1 to the answer for 1 based indexing
        return winner;
    }
    public static void main(String[] args) {
        System.out.println(findTheWinner(1,2));
    }
}
