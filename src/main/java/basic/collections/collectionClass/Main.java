package basic.collections.collectionClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(2);
        values.add(3);
        values.add(4);

        System.out.println(values.size());
        System.out.println(values.isEmpty());
        System.out.println(values.contains(5));
        values.add(5);
        System.out.println(values.contains(5));
        values.remove(3);
        System.out.println(values.contains(5));

        values.remove(Integer.valueOf(3));
        System.out.println(values.contains(3));

        Stack<Integer> stack = new Stack<>();
        stack.add(6);
        stack.add(7);
        stack.add(8);

        values.addAll(stack);
        System.out.println(values.containsAll(stack));
        values.remove(Integer.valueOf(7));
        System.out.println(values.containsAll(stack));

        values.removeAll(stack);
        System.out.println(values.contains(8));

        values.clear();

        System.out.println(values.isEmpty());
    }
}
