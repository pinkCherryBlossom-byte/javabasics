package basic.multithreading.CompletableFutureExample;

import java.util.concurrent.*;

public class Main1 {

    public static void main(String[] args) {

        try {
            ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1,1,
                    TimeUnit.HOURS,new ArrayBlockingQueue<>(10),
                    Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

            //here since I am passing poolexecutor I have control over how many threads will be created
            //If I dont pass poolexecutor then Fork-Join-pool which is default executor will have control over it
            CompletableFuture<String> async = CompletableFuture.supplyAsync(() -> {
                //this is the task that needs to be completed by thread
                return "task completed";
            },poolExecutor);
            System.out.println(async.get());
        }catch(Exception e) {
            //handle exception
        }
    }
}
