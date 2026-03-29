package basic.collections.setExample;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Main2 {

    public static void main(String[] args) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap<>();
        Set<Integer> setThreadSafe = concurrentHashMap.newKeySet();
        setThreadSafe.add(1);
        setThreadSafe.add(2);

        Iterator<Integer> iterator = setThreadSafe.iterator();
        while(iterator.hasNext()) {
            int val = iterator.next();
            if(val==1) {
                setThreadSafe.add(9);
            }
        }

        setThreadSafe.forEach((Integer val) -> System.out.println(val));
    }
}
