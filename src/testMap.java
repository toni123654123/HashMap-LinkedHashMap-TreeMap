import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class testMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Smihth",10);
        hashMap.put("Adnrer",20);
        hashMap.put("Cook",29);
        hashMap.put("Khanh",30);
        System.out.println("Display");
        System.out.println(hashMap+ "\n");



        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display");
        System.out.println(treeMap);

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Smith",30);
        linkedHashMap.put("Anderson",31);
        linkedHashMap.put("Lewis",29);
        linkedHashMap.put("Cook",29);
        System.out.println("The age for "+"Lewis is "+ linkedHashMap.get("Lewis"));

    }
}
