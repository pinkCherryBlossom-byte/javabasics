package basic.collections.QueueClass;

import java.util.PriorityQueue;

public class MaxPriorityQueueExample {

    public static void main(String[] args) {
        //This is done in order to store data in form of max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (Integer a,Integer b) -> (b-a));
        pq.add(5);
        pq.add(2);
        pq.add(4);
        pq.add(8);

        pq.forEach(System.out::println);

        while(!pq.isEmpty()) {
            int a = pq.poll();
            System.out.println(a);
        }
    }
}
