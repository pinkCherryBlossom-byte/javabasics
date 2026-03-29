package basic.multithreading.locks.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

    boolean isAvailable = false;
    ReentrantLock lock = new ReentrantLock();

    public void producer() {
        try {
            lock.lock();
            System.out.println("Lock acquired : "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(3000);
        }catch(Exception e) {
            //handle exception
        }finally {
            lock.unlock();
            System.out.println("Lock release : "+Thread.currentThread().getName());
        }
    }
}
