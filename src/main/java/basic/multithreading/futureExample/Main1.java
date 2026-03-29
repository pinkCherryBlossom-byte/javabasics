package basic.multithreading.futureExample;

import java.util.concurrent.*;

public class Main1 {

    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1,1,
                TimeUnit.HOURS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        Future<?> futureObj = poolExecutor.submit(() -> {
            System.out.println("This task will be executed");
        });

        System.out.println(futureObj.isDone());
    }
}
