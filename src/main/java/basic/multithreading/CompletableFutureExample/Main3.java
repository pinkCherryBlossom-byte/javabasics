package basic.multithreading.CompletableFutureExample;

import java.util.concurrent.*;

public class Main3 {

    public static void main(String[] args) {
        try {
            ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1,1,
                    TimeUnit.HOURS, new ArrayBlockingQueue<>(10),
                    Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

            //This is synchronous chaining
            CompletableFuture<String> async2 = CompletableFuture.supplyAsync(() -> {
                System.out.println("Thread name for supply async : "+Thread.currentThread().getName());
                return "concepts here ";
            },poolExecutor).thenApply((String val) -> {
                System.out.println("The name for thenApply : "+Thread.currentThread().getName());
                return "interesting";
            });

            System.out.println("Thread name after completable future : "+Thread.currentThread().getName());
        }catch(Exception e) {
            //handle exception
        }
    }
}
