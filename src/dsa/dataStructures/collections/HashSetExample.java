package dsa.dataStructures.collections;
import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(101);
        set.add(10);
        set.add(101);
        set.add(100);
        set.add(10);
        set.add(1);
        System.out.println(set);
    }
}
