package basic.multithreading.threadPoolExecutorShutdownAwait;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {

    public static void main(String[] args) {
        ExecutorService poolExecutor = Executors.newFixedThreadPool(5);
        poolExecutor.submit(() -> {
            try {
                Thread.sleep(5000);
            }catch(Exception e) {
                //handle exception
            }
            System.out.println("New task");
        });

        poolExecutor.shutdown();

        System.out.println("Main thread unblocked and finished processing");
    }
}
