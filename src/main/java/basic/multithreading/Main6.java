package basic.multithreading;

public class Main6 {

    public static void main(String[] args) {
        SharedResource1 sharedResource = new SharedResource1();
        System.out.println("Main thread started");
        Thread th1 = new Thread(() -> {
            System.out.println("Th1 calling produce");
            sharedResource.produce();
        });

        Thread th2 = new Thread(() -> {
            System.out.println("Th2 calling produce");
            try {
                Thread.sleep(1000);
                sharedResource.produce();
            }catch(Exception e) {
                //handle exception
            }
        });
        th1.start();
        th2.start();
        //Here thread2 will be in deadlock state
        try {
            Thread.sleep(3000);
        }catch(Exception e) {
            //handle exception
        }
        //Below 2 methods are removed from java 23 it was deprecated from java 11
       // th1.suspend();
        //th1.resume();

        try {
            th1.join();
            th2.join();
        }catch(Exception e) {
            //handle exception
        }

        System.out.println("Main has completed task");
    }
}
