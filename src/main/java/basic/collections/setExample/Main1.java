package basic.collections.setExample;

import java.util.HashSet;
import java.util.Set;

public class Main1 {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(12);
        set1.add(11);
        set1.add(33);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set2.add(11);
        set2.add(9);
        set2.add(88);
        set2.add(10);
        set2.add(5);
        set2.add(12);

        //union of 2 sets
        set1.addAll(set2);
        System.out.println("After union: ");
        set1.forEach((Integer val) -> System.out.println(val));

        //intersection of 2 sets
        set1 = new HashSet<>();
        set1.add(12);
        set1.add(11);
        set1.add(33);
        set1.add(4);

        set2 = new HashSet<>();
        set2.add(11);
        set2.add(9);
        set2.add(88);
        set2.add(10);
        set2.add(5);
        set2.add(12);

        set1.retainAll(set2);
        System.out.println("After Intersection");
        set1.forEach((Integer val) -> System.out.println(val));

        //differnce of 2 set
        set1 = new HashSet<>();
        set1.add(12);
        set1.add(11);
        set1.add(33);
        set1.add(4);

        set2 = new HashSet<>();
        set2.add(11);
        set2.add(9);
        set2.add(88);
        set2.add(10);
        set2.add(5);
        set2.add(12);

        set1.remove(set2);
        System.out.println("After differnce");
        set1.forEach((Integer val) -> System.out.println(val));

    }
}
