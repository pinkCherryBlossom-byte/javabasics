package basic.multithreading;

public class Main7 {

    public static void main(String[] args) {
        SharedResource1 sharedResource = new SharedResource1();
        System.out.println("Main thread started");

        Thread th1 = new Thread(() -> {
            System.out.println("Thread1 calling produce method");
            sharedResource.produce();
        });

        th1.setDaemon(true);
        th1.start();

        //th1 will not wait to get completed. Once main thread is completed th1 will also close as it is Daemen thread.
        System.out.println("Main thread is completed");
    }
}
