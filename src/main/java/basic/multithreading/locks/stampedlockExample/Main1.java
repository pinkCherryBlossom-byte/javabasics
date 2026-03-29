package basic.multithreading.locks.stampedlockExample;

public class Main1 {

    public static void main(String[] args) {
        SharedOptimisticResource resource = new SharedOptimisticResource();
        Thread th1 = new Thread(() -> {
            resource.producer();
        });
        Thread th2 = new Thread(() -> {
            resource.consumer();
        });
        th1.start();
        th2.start();
        //Here th2 internally updated stamp value as it was updating the value of a hence it rolled back the work
        //If th2 is commented than it will update successfully
    }
}
