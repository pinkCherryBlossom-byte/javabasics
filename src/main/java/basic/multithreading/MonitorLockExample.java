package basic.multithreading;

public class MonitorLockExample {

    public synchronized void task1() {
        try {
            System.out.println("Inside Task1");
            Thread.sleep(10000);
        }catch(Exception e) {
            //Exception handling is done here
        }
    }

    public void task2() {
        System.out.println("Task 2, but before synchronized");
        synchronized(this) {
            System.out.println("Task2, inside synchronized");
        }
    }

    public void task3() {
        System.out.println("Task 3");
    }
}
