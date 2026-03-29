package problems.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class SharedResource {

    Queue<Integer> queue ;
    int i=0;

    public SharedResource(int i) {
        queue = new LinkedList<>();
        this.i=i;
    }

    public synchronized void addItem(int item) {
        try {
            while (queue.size() == i) {
                System.out.println("Queue is full");
                wait();
            }
            queue.add(item);
            System.out.println("Item produced : "+item);
        }catch(Exception e) {
            //handle exception
        }
        notify();
    }

    public synchronized int consumeItem() {
        try {
            while (queue.isEmpty()) {
                System.out.println("Queue is empty");
                wait();
            }
            int item = queue.poll();
            System.out.println("Item consumed : "+item);
        }catch(Exception e) {
            //handle exception
        }
        notify();
        return i;
    }


}
