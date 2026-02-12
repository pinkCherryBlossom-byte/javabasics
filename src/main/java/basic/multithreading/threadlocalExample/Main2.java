package basic.multithreading.threadlocalExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {

    public static void main(String[] args) {
        //cleaning up already used thread
        ThreadLocal<String> th1 = new ThreadLocal<>();
        ExecutorService poolExecutor = Executors.newFixedThreadPool(5);
        poolExecutor.submit(() -> {
            th1.set(Thread.currentThread().getName());
        });

        for(int i=1;i<15;i++) {
            poolExecutor.submit(() -> {
                System.out.println(th1.get());
            });
        }

        //On executing the loop we can see that even though we have not set threadlocal value which was set earlier for
        //few of them it is still printing previous thread pool name
    }
}
