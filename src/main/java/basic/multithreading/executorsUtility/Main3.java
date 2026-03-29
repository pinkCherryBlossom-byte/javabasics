package basic.multithreading.executorsUtility;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main3 {

    public static void main(String[] args) {
        ScheduledExecutorService poolExecutor = Executors.newScheduledThreadPool(5);
        //If you want a task to run every 5 seconds and initially it will run after 3 seconds
        Future<?> future = poolExecutor.scheduleAtFixedRate(() -> {
            System.out.println("hello");
        },3,5, TimeUnit.SECONDS);

        try {
            Thread.sleep(10000);
            //after 10 seconds it will stop
            future.cancel(true);
        }catch(Exception e) {
            //handle exception
        }
    }
}
