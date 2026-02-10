package basic.multithreading;

public class Main3 {

    //This is referring to monitor locks
    public static void main(String[] args) {
        MonitorLockExample obj = new MonitorLockExample();
        Thread t1 = new Thread(() -> {obj.task1();});
        Thread t2 = new Thread(() -> {obj.task2();});
        Thread t3 = new Thread(() -> {obj.task3();});
        t1.start();
        t2.start();
        t3.start();

        //Example without lambda
        MonitorLockRunnable runnable = new MonitorLockRunnable(obj);
        Thread t4 = new Thread(runnable);
        t4.start();
    }
}
