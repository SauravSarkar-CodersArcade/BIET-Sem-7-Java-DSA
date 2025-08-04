package dsa.dataStructures.collections;
import java.util.Collections;
import java.util.LinkedList;
public class CombiningTwoLists {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(9);
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.addAll(list2); // All l2 data at the end of l1
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
    }
}
