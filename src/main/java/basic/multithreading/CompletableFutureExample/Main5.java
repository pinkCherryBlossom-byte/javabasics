package basic.multithreading.CompletableFutureExample;

import java.util.concurrent.*;

public class Main5 {

    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1,1,
                TimeUnit.HOURS,new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        CompletableFuture<Void> async = CompletableFuture.supplyAsync(() -> {
            System.out.println("supplyAsync thread : "+Thread.currentThread().getName());
            return "concept and ";
        },poolExecutor).thenAccept((String value) -> System.out.println("All stages completed"));;
    }
}
