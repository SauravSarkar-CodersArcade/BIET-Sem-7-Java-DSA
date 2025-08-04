package dsa.dataStructures.collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ListExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        System.out.println(integers);
        List<String> strings = new LinkedList<>();
        strings.add("Java");
        strings.add("Python");
        strings.add("C++");
        System.out.println(strings);
        List anonymous = new ArrayList();
        anonymous.add("BIET");
        anonymous.add(1);
        anonymous.add(true);
        anonymous.add(1.45);
        for (Object o : anonymous){
            System.out.print(o + " ");
        }
    }
}
