package basic.multithreading.CompletableFutureExample;

import java.util.concurrent.*;

public class Main4 {

    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1,1,
                TimeUnit.HOURS, new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        CompletableFuture<String> async = CompletableFuture.supplyAsync(() -> {
            System.out.println("Supply async thread : "+Thread.currentThread().getName());
            return "Concept and ";
        },poolExecutor).thenCompose((String val) -> {
            return CompletableFuture.supplyAsync(() -> {
                System.out.println("Then compose thread : "+Thread.currentThread().getName());
                return "coding ";
            });
        }).thenComposeAsync((String val) -> {
            return CompletableFuture.supplyAsync(() -> {
                System.out.println("Another thread for compose : "+Thread.currentThread().getName());
                return "value.";
            });
        });
    }
}
