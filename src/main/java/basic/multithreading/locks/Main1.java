package basic.multithreading.locks;

public class Main1 {

    public static void main(String[] args) {
        SharedResource resource1 = new SharedResource();
        Thread th1 = new Thread(() -> {
            resource1.producer();
        });

        SharedResource resource2 = new SharedResource();
        Thread th2 = new Thread(() -> {
            resource2.producer();
        });

        th1.start();
        th2.start();
    }
}
