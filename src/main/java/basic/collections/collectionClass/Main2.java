package basic.collections.collectionClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);

        System.out.println(Collections.max(values));
        System.out.println(Collections.min(values));
        Collections.sort(values);
        System.out.println("sorted");
        values.forEach(System.out::println);
    }
}
