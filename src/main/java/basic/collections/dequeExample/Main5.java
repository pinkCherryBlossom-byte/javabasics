package basic.collections.dequeExample;

import java.util.LinkedList;

public class Main5 {

    //Linked list in dequeue
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(200);
        list.addLast(300);
        list.addLast(400);
        list.addFirst(100);
        System.out.println(list.getFirst());

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(0,100);
        list2.add(1,300);
        list2.add(2,400);
        list2.add(1,200);
        System.out.println(list2.get(1)+" and "+list2.get(2));
    }
}
