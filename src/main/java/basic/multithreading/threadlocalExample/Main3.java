package basic.multithreading.threadlocalExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main3 {

    public static void main(String[] args) {
        ThreadLocal<String> th1 = new ThreadLocal<>();
        ExecutorService poolExecutor = Executors.newFixedThreadPool(5);
        poolExecutor.submit(() -> {
            th1.set(Thread.currentThread().getName());
            //my work completed now clean up
            th1.remove();
        });

        for(int i=0;i<15;i++) {
            poolExecutor.submit(() -> System.out.println(th1.get()));
        }
    }
}
