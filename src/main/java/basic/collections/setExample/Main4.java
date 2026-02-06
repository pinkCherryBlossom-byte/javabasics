package basic.collections.setExample;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main4 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(2);
        set.add(77);
        set.add(82);
        set.add(63);
        set.add(5);

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) {
            int val = iterator.next();
            System.out.println(val);
        }
    }
}
