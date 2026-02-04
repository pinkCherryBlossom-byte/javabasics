package basic.collections.dequeExample;

import java.util.concurrent.PriorityBlockingQueue;

public class Main2 {

    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> pq = new PriorityBlockingQueue<>();
        pq.add(5);
        pq.add(2);

        System.out.println(pq.peek());
    }
}
