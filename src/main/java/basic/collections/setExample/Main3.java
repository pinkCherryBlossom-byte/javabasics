package basic.collections.setExample;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main3 {

    public static void main(String[] args) {
        Set<Integer> intset = new LinkedHashSet<>();
        intset.add(2);
        intset.add(77);
        intset.add(82);
        intset.add(63);
        intset.add(5);

        Iterator<Integer> iterator = intset.iterator();
        while(iterator.hasNext()) {
            int val = iterator.next();
            System.out.println(val);
        }
    }
}
