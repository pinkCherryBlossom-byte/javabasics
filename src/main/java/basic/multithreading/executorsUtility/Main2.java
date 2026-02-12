package basic.multithreading.executorsUtility;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main2 {

    public static void main(String[] args) {
        ScheduledExecutorService poolExecutor = Executors.newScheduledThreadPool(5);
        //This calls callable
        //This runs after 5 seconds
        Future<String> future = poolExecutor.schedule(() -> "hello",5, TimeUnit.SECONDS);
        try {
            System.out.println(future.get());
        }catch(Exception e) {
            //handle exception
        }
    }
}
