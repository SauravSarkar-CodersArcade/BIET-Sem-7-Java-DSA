package dsa.dataStructures.collections;
import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Mumbai");
        System.out.println(cities);
        cities.addFirst("Bangalore");
        System.out.println(cities);
        cities.addLast("Pune");
        System.out.println(cities);
    }
}
