package basic.collections.dequeExample;

import java.util.ArrayDeque;

public class Main1 {

    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDequeasQueue = new ArrayDeque<>();
        arrayDequeasQueue.addLast(1);
        arrayDequeasQueue.addLast(5);
        arrayDequeasQueue.addLast(10);

        int element = arrayDequeasQueue.removeFirst();
        System.out.println(element);

        ArrayDeque<Integer> arrayDequeasStack = new ArrayDeque<>();
        arrayDequeasStack.addFirst(1);
        arrayDequeasStack.addFirst(5);
        arrayDequeasStack.addFirst(10);

        int removeElement = arrayDequeasStack.removeFirst();
        System.out.println(removeElement);
    }
}
