package basic.multithreading.locks.stampedlockExample;

import java.util.concurrent.locks.StampedLock;

public class SharedOptimisticResource {

    int a = 10;
    StampedLock lock = new StampedLock();

    public void producer() {
        long stamp = lock.tryOptimisticRead();
        try {
            System.out.println("Try optimistic lock");
            a = 11;
            Thread.sleep(3000);
            if(lock.validate(stamp)) {
                System.out.println("Validated value of a successfully");
            }else {
                System.out.println("Rollback of work");
                a = 10;
            }
        }catch(Exception e) {
            //handle execption
        }
    }

    public void consumer() {
        long stamp = lock.writeLock();
        System.out.println("Write lock acquired by : "+Thread.currentThread().getName());
        try {
            System.out.println("Performing work");
            a=9;
        }catch(Exception e) {
            //handle exception
        }finally {
            lock.unlockWrite(stamp);
            System.out.println("Write lock released by : "+Thread.currentThread().getName());
        }
    }
}
