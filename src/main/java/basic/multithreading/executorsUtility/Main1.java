package basic.multithreading.executorsUtility;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main1 {

    public static void main(String[] args) {
        ScheduledExecutorService poolExecutor = Executors.newScheduledThreadPool(5);
        //This calls runnable
        //after 5 seconds it will call runnable
        poolExecutor.schedule(() -> {
            System.out.println("hello");
        },5, TimeUnit.SECONDS);
    }
}
