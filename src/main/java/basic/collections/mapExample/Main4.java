package basic.collections.mapExample;

import java.util.Map;
import java.util.TreeMap;

public class Main4 {

    public static void main(String[] args) {
        Map<Integer,String> map1 = new TreeMap<>((Integer key1,Integer key2) -> key2-key1);
        map1.put(21,"SJ");
        map1.put(11,"PJ");
        map1.put(13,"KJ");
        map1.put(5,"TJ");
        //decreasing order
        map1.forEach((Integer key,String value) -> System.out.println(key+" : "+value));

        System.out.println("-------------------------------------------------------------");

        Map<Integer,String> map2 = new TreeMap<>();
        map2.put(21,"SJ");
        map2.put(11,"PJ");
        map2.put(13,"KJ");
        map2.put(5,"TJ");

        map2.forEach((Integer key,String value) -> System.out.println(key+" : "+value));
    }
}
