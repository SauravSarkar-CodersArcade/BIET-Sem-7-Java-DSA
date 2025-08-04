package dsa.dataStructures.collections;
import java.util.ArrayList;
import java.util.List;
public class WildCardsExample {
    public static void printList(List<?> list){
        for (Object obj : list){
            System.out.print(obj + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        printList(integerList);
        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("SQL");
        printList(stringList);
    }
}
