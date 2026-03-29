package basic.multithreading.locks.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Main1 {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        SharedResource1 resource1= new SharedResource1();
        Thread th1 = new Thread(() -> {
            resource1.producer(lock);
        });

        SharedResource1 resource2 = new SharedResource1();
        Thread th2 = new Thread(() -> {
            resource2.producer(lock);
        });

        th1.start();
        th2.start();
    }
}
