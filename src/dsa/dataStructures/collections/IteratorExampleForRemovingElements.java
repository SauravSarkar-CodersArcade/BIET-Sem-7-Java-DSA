package dsa.dataStructures.collections;
import java.util.ArrayList;
public class IteratorExampleForRemovingElements {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(11);
        numbers.add(31);
        numbers.add(14);
        numbers.add(19);
        numbers.add(21);
        numbers.add(0);
        numbers.add(9);
        System.out.println(numbers);
//        Iterator<Integer> it = numbers.iterator();
//        while (it.hasNext()){
//            Integer i = it.next();
//            if(i < 10){
//                it.remove();
//            }
//        }
        numbers.removeIf( n -> n < 10);
        System.out.println(numbers);
    }
}
