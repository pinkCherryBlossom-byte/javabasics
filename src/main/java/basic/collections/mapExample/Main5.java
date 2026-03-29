package basic.collections.mapExample;

import java.util.SortedMap;
import java.util.TreeMap;

public class Main5 {

    public static void main(String[] args) {
        SortedMap<Integer,String> map = new TreeMap<>();
        map.put(21,"SJ");
        map.put(11,"PJ");
        map.put(13,"KJ");
        map.put(5,"TJ");

        System.out.println(map.headMap(13));
        System.out.println(map.tailMap(13));
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
    }
}
