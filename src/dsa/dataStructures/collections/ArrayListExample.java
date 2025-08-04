package dsa.dataStructures.collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayLists are better for storing & access
        // LinkedLists are better for manipulations
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        LinkedList<Integer> list3 = new LinkedList<>();
        // Example
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Guava");
        System.out.println(fruits.contains("Mango"));
        System.out.println(fruits.contains("Avocado"));
        System.out.println(fruits);
        fruits.remove("Apple");
        fruits.remove(1);
        System.out.println(fruits);
    }
}
