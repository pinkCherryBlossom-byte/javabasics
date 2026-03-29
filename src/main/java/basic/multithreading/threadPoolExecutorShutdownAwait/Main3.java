package basic.multithreading.threadPoolExecutorShutdownAwait;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main3 {

    public static void main(String[] args) {
        ExecutorService poolExecutor = Executors.newFixedThreadPool(5);
        poolExecutor.submit(() -> {
            try {
                Thread.sleep(5000);
            }catch(Exception e) {
                //handle exception
            }
            System.out.println("new task");
        });

        poolExecutor.shutdown();
        try {
            boolean isTerminated = poolExecutor.awaitTermination(3, TimeUnit.SECONDS);
            System.out.println("Main thread : isTerminated : "+isTerminated);
        }catch(Exception e) {
            //handle exception
        }
        System.out.println("Main thread is completed");
    }
}
