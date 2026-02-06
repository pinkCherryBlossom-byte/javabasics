package basic.collections.mapExample;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main3 {

    public static void main(String[] args) {
        // Here we are maintaining access as true

        // 16 is initial capacity
        //.75F is load factor
        //true is access order
        Map<Integer,String> map = new LinkedHashMap<>(16,.75F,true);
        map.put(1,"A");
        map.put(21,"B");
        map.put(23,"C");
        map.put(141,"D");
        map.put(25,"E");

        // Most frequently accessed element
        map.get(23);
        map.forEach((Integer key,String value) -> System.out.println(key+" "+value));

        //There is no threadsafe version so if we have to make this thread safe, do the below

        Map<Integer,String> map2 = Collections.synchronizedMap(new LinkedHashMap<>());

    }
}
