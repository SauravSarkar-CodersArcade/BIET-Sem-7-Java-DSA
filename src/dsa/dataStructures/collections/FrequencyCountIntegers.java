package dsa.dataStructures.collections;
import java.util.HashMap;
public class FrequencyCountIntegers {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3,4,1,3,5,7,9};
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i : arr){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        System.out.println(freq);
    }
}
