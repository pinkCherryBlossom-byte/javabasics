package basic.collections.iteratorClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);

        System.out.println("Iterating values using iterator :");
        Iterator<Integer> valueIterator = values.iterator();
        while(valueIterator.hasNext()) {
            int val = valueIterator.next();
            System.out.println(val);
            if(val==3) {
                valueIterator.remove();
            }
        }

        System.out.println("Iterating using for each loop :");
        for(int i:values) {
            System.out.println(i);
        }

        System.out.println("Iterating using for each method :");
        values.forEach((Integer val) -> System.out.println(val));

        System.out.println("Iterating using for each method reference :");
        values.forEach(System.out::println);

    }
}
