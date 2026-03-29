package basic.multithreading.CompletableFutureExample;

import java.util.concurrent.*;

public class Main6 {

    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1,1,
                TimeUnit.HOURS, new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        CompletableFuture<Integer> async1 = CompletableFuture.supplyAsync(() -> {
            return 10;
        },poolExecutor);

        CompletableFuture<String> async2 = CompletableFuture.supplyAsync(() -> {
            return "k";
        },poolExecutor);

        CompletableFuture<String> combinedFuture = async1.thenCombine(async2, (Integer v1,String v2) -> v1+v2);

        try {
            System.out.println(combinedFuture.get());
        }catch(Exception e) {
            //handle exception
        }
    }
}
