package basic.multithreading.threadPoolExecutorExample;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main1 {

    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2,5,1,
                TimeUnit.HOURS, new ArrayBlockingQueue<>(10), new CustomThreadFactor(),
                new CustomRejectHandler());

        poolExecutor.allowCoreThreadTimeOut(true);

        for(int i=0;i<16;i++) {
            poolExecutor.submit(() -> {
                try {
                    Thread.sleep(5000);
                    System.out.println("Current Thread is : "+Thread.currentThread().getName());
                }catch(Exception e) {
                    //handle exception
                }
            });
        }
        poolExecutor.shutdown();
    }
}
