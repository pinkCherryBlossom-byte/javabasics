package basic.collections.QueueClass;

import java.util.PriorityQueue;

public class MinPriorityQueueExample {

    public static void main(String[] args) {
        //PriorityQueue by default will be adding the add in ascending order
        //It uses Min heap internally
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);

        pq.forEach(System.out::println);

        while(!pq.isEmpty()) {
            int val = pq.poll();
            System.out.println("Removed val : "+val);
        }

    }
}
