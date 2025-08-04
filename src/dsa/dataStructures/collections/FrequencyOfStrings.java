package dsa.dataStructures.collections;
import java.util.HashMap;
public class FrequencyOfStrings {
    public static void main(String[] args) {
        String[] items = {"Apple", "Apple", "Apple", "Banana", "Apple",
                "Guava", "Avocado", "Orange"};
        HashMap<String, Integer> freq = new HashMap<>();
        for (String item : items){
            freq.put(item, freq.getOrDefault(item, 0) + 1);
        }
        System.out.println(freq);
    }
}
