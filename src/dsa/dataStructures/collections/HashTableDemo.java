package dsa.dataStructures.collections;
import java.util.Hashtable;
import java.util.Map;
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106, "Nidhi");
        ht.put(117, "Bindhya");
        ht.put(128, "Gnana");
        ht.put(100, "Arun");
        ht.put(99, "Keerthan");
        ht.put(102, "Ajay");
        for (Map.Entry<Integer, String> entry : ht.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
