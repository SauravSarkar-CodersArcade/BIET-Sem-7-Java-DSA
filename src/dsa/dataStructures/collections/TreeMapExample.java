package dsa.dataStructures.collections;
import java.util.TreeMap;
public class TreeMapExample {
    public static void main(String[] args) {
        // get(), put() remove() O(log n)
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Nirmal");
        map.put(1, "Raushan");
        map.put(2, "Saurav");
        System.out.println(map);
    }
}
