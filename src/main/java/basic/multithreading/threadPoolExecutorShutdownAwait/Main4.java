package basic.multithreading.threadPoolExecutorShutdownAwait;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main4 {

    public static void main(String[] args) {
        ExecutorService poolExecutor = Executors.newFixedThreadPool(5);
        poolExecutor.submit(() -> {
            try {
                Thread.sleep(15000);
            }catch(Exception e) {
                //handle exception
            }
            System.out.println("new task");
        });
        //It will not wait for 15 seconds and shutdown immediately
        poolExecutor.shutdownNow();
        System.out.println("Main thread is completed");
    }
}
