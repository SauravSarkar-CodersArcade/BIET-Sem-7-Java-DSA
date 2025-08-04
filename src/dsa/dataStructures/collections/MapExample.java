package dsa.dataStructures.collections;
import java.util.LinkedHashMap;
import java.util.Map;
public class MapExample {
    public static void main(String[] args) {
        // To get sorted order, use normal HashMap
        // To maintain insertion order, use LinkedHashMap
        Map<String, String> map = new LinkedHashMap<>();
        map.put("02", "Java");
        map.put("01", "JavaScript");
        map.put("04", "SQL");
        map.put("05", "MongoDB");
        map.put("03", "CoreJava");
        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
