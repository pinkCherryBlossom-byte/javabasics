package basic.collections.mapExample;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main1 {

    public static void main(String[] args) {
        Map<Integer,String> rollMap = new HashMap<>();
        rollMap.put(null,"TEST");
        rollMap.put(0,null);
        rollMap.put(1,"A");
        rollMap.put(2,"B");

        //compute if present
        rollMap.putIfAbsent(null,"test");
        rollMap.putIfAbsent(0,"ZERO");
        rollMap.putIfAbsent(3,"C");

        for(Map.Entry<Integer,String> entryMap:rollMap.entrySet()) {
            Integer key = entryMap.getKey();
            String value = entryMap.getValue();
            System.out.println("key:"+key+" value:"+value);
        }

        System.out.println("Roll Map is empty: "+rollMap.isEmpty());
        System.out.println("Size: "+rollMap.size());
        System.out.println(rollMap.containsKey(3));
        System.out.println(rollMap.get(1));
        System.out.println(rollMap.getOrDefault(9,"default value"));

        System.out.println(rollMap.remove(null));

        for(Map.Entry<Integer,String> entryMap: rollMap.entrySet()) {
            Integer key = entryMap.getKey();
            String value = entryMap.getValue();
            System.out.println("Key: "+key+" value: "+value);
        }

        for(Integer key:rollMap.keySet()) {
            System.out.println("key: "+key);
        }

        Collection<String> values = rollMap.values();
        for(String value: values) {
            System.out.println("Value: "+value);
        }
    }
}
