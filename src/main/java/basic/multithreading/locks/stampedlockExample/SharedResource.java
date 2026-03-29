package basic.multithreading.locks.stampedlockExample;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {

    boolean isAvailable = false;
    StampedLock lock = new StampedLock();

    public void producer() {
        long stamp = lock.readLock();
        try {
            System.out.println("Read lock acquired : "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(3000);
        }catch(Exception e) {
            //handle exception
        }finally{
            lock.unlockRead(stamp);
            System.out.println("Read lock released : "+Thread.currentThread().getName());
        }
    }

    public void consumer() {
        long stamp = lock.writeLock();
        try {
            System.out.println("Write Lock acquired : "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(3000);
        }catch(Exception e) {
            //handle Exception
        }finally {
            lock.unlockWrite(stamp);
            System.out.println("Write lock released : "+Thread.currentThread().getName());
        }
    }
}
