package basic.multithreading.threadPoolExecutorShutdownAwait;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main1 {

    public static void main(String args[]) {
        ExecutorService poolObj = Executors.newFixedThreadPool(5);
        poolObj.submit(() -> {
            System.out.println("Thread is going to start task");
        });

        poolObj.shutdown();

        // task submission after shutdown, this will throw rejectedExecutionException
        //but any task already submitted before shutdown will continue to work
        poolObj.submit(() -> {
            System.out.println("After shutdown work");
        });
    }
}
