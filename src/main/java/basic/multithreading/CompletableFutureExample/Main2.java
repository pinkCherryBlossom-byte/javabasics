package basic.multithreading.CompletableFutureExample;

import java.util.concurrent.*;

public class Main2 {

    public static void main(String[] args) {
        try {
            ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1,1,
                    TimeUnit.HOURS, new ArrayBlockingQueue<>(10),
                    Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

            //This is async chaining
            CompletableFuture<String> async1 = CompletableFuture.supplyAsync(() -> {
                System.out.println("Thread name for supply async : "+Thread.currentThread().getName());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return "Concept and ";
            },poolExecutor).thenApplyAsync((String val) -> {
                System.out.println("Then name from thenApplyAsync :"+Thread.currentThread().getName());
                return "coding";
            },poolExecutor);

            System.out.println("Thread name after completable future : "+Thread.currentThread().getName());
        }catch(Exception e) {
            //handle exception
        }
    }
}
