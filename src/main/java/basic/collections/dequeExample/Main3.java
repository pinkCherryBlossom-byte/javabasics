package basic.collections.dequeExample;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Main3 {

    public static void main(String[] args) {
        ConcurrentLinkedDeque<Integer> ob = new ConcurrentLinkedDeque<>();
        ob.addFirst(5);
        ob.addLast(2);

        System.out.println(ob.removeLast());
    }
}
