package basic.multithreading.threadPoolExecutorTypes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {

    public static void main(String[] args) {
        ExecutorService poolExecutor = Executors.newFixedThreadPool(5);
        poolExecutor.submit(() -> "this is the async task");
    }
}
