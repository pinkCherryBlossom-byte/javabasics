package basic.multithreading.threadPoolExecutorTypes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class cacheThreadPoolExample {

    public static void main(String[] args) {
        // no need to provide number of threads it will create dynamically
        //here queue is not in use
        ExecutorService poolExecutor = Executors.newCachedThreadPool();
        poolExecutor.submit(() -> "this is async task");
    }
}
