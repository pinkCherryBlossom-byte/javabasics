package basic.collections.mapExample;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Main6 {

    public static void main(String[] args) {
        NavigableMap<Integer,String> map = new TreeMap<>();
        map.put(1,"A");
        map.put(21,"B");
        map.put(23,"C");
        map.put(141,"D");
        map.put(25,"E");

        map.forEach((Integer key,String value) -> System.out.println(key+" : "+value));
        System.out.println(map.lowerEntry(23));
        System.out.println(map.lowerKey(23));
        System.out.println(map.floorEntry(24));
        System.out.println(map.floorKey(24));
        System.out.println(map.ceilingEntry(24));
        System.out.println(map.ceilingKey(24));
        System.out.println(map.higherEntry(24));
        System.out.println(map.higherKey(24));
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
        System.out.println(map.pollFirstEntry());
        System.out.println(map.pollLastEntry());
    }
}
