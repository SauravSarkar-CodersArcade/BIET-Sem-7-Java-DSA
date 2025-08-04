package dsa.dataStructures.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CollectionsClassExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(11);
        integers.add(200);
        integers.add(13);
        integers.add(0);
        System.out.println(integers);
        Collections.sort(integers);
        System.out.println(integers);
        Collections.reverse(integers);
        System.out.println(integers);
    }
}
