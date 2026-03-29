package basic.multithreading.locks.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource1 {

    boolean isAvailable = false;

    public void producer(ReentrantLock lock) {
        try {
            lock.lock();
            System.out.println("Lock acquired : "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(3000);
        }catch(Exception e) {
            //hanlde exception
        }finally{
            lock.unlock();
            System.out.println("Lock released : "+Thread.currentThread().getName());
        }
    }
}
