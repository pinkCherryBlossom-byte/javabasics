package basic.multithreading.locks.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

    boolean isAvailable = false;
    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void producer() {
        try {
            lock.lock();
            System.out.println("Producer lock acquired by : "+Thread.currentThread().getName());
            if(isAvailable) {
                //already available thread has to wait
                System.out.println("Produce thread is waiting : "+Thread.currentThread().getName());
                condition.await();
            }
            isAvailable = true;
            condition.signalAll();
        }catch(Exception e) {
            //handle exception
        }finally {
            lock.unlock();
            System.out.println("Producer lock is released : "+Thread.currentThread().getName());
        }
    }

    public void consumer() {
        try {
            Thread.sleep(3000);
            lock.lock();
            System.out.println("Consumer lock is acquired by : "+Thread.currentThread().getName());
            if(!isAvailable) {
                System.out.println("Consume thread is in wait state by : "+Thread.currentThread().getName());
                condition.await();
            }
            isAvailable = false;
            condition.signalAll();
        }catch(Exception e) {
            //handle exception
        }finally {
            System.out.println("Consumer lock is released by : "+Thread.currentThread().getName());
            lock.unlock();
        }
    }
}
