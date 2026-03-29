package basic.multithreading.virtualThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main2 {

    public static void main(String[] args) {
        ExecutorService executorPool = Executors.newVirtualThreadPerTaskExecutor();
        Future<?> future = executorPool.submit(() -> {
            System.out.println("Creating virtual thread using executors");
            return "callable";
        });
        try {
            System.out.println(future.get());
        }catch(Exception r) {
            //handle exception
        }
    }
}
