package dsa.algos.greedy.minCoins;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MinimumNumberOfCoins {
    static void findMinCoins(List<Integer> coins, int V){
        List<Integer> result = new ArrayList<>();
        // Sort the coins array if it is not sorted
        // Start from the largest value -> Greedy Approach
        for (int i=coins.size()-1; i >= 0; i--){
            while (V >= coins.get(i)){
                V -= coins.get(i);
                result.add(coins.get(i)); // Add that coin in result
            }
        }
        System.out.print("Coins selected: ");
        for (int num : result){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Min Number of coins: " + result.size());
    }
    public static void main(String[] args) {
        List<Integer> coins = Arrays.
                asList(1,2,5,10,20,50,100,200,500,1000,2000);
        int V1 = 91;
        findMinCoins(coins, V1);
        int V2 = 31;
        findMinCoins(coins, V2);

    }
}
