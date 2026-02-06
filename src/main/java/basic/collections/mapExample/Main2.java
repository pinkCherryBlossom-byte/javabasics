package basic.collections.mapExample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main2 {

    public static void main(String[] args) {
        System.out.println("This is linked Hash Map");
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"A");
        map.put(21,"B");
        map.put(23,"C");
        map.put(141,"D");
        map.put(25,"E");
        map.forEach((Integer key,String value) -> System.out.println(key+" "+value));

        System.out.println("This is normal Hashmap");
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"A");
        map1.put(21,"B");
        map1.put(23,"C");
        map1.put(141,"D");
        map1.put(25,"E");
        map1.forEach((Integer key,String value) -> System.out.println(key+" "+value));
    }
}
