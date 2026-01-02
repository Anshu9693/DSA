import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Hashing {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // insertion
        map.put("India", 120);
        map.put("China", 130);
        map.put("Nepal", 2);

        // printing
        System.out.println(map);

        // Searching

        if (map.containsKey("China")) {
            System.out.println("china is present and population is " + map.get("China"));
        }

        System.out.println(map.get("India"));

        System.out.println(map.get("pakistan"));


        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " "+ e.getValue());
        }

        Set<String> keys = map.keySet();

        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }

            map.remove("China");
            System.out.println(map);

    }
}
