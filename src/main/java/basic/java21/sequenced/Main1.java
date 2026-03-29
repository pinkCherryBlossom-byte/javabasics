package basic.java21.sequenced;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("A","B","C"));

        //access
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        //add
        list.addFirst("A");
        list.addLast("Z");
        System.out.println(list);

        //remove
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

       // list.reversed();
        System.out.println(list.reversed());


    }
}
