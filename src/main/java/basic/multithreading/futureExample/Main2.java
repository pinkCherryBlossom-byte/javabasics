package basic.multithreading.futureExample;

import java.util.concurrent.*;

public class Main2 {

    public static void main(String[] args) {
        ThreadPoolExecutor poolexecutor = new ThreadPoolExecutor(1,1,1,
                TimeUnit.HOURS, new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        Future<?> futureObj = poolexecutor.submit(() -> {
            try {
                Thread.sleep(7000);
                System.out.println("This is the task, thread will execute");
            }catch(Exception e) {
                //handle exception
            }
        });

        System.out.println("is done : "+futureObj.isDone());

        try {
            //this waits for task to complete for 2 seconds
            futureObj.get(2,TimeUnit.SECONDS);
        }catch(TimeoutException e) {
            System.out.println("Time out happened");
        }
        catch(Exception e) {
            //handle exception
        }

        try {
            //wait until it gets completed
            futureObj.get();
        }catch(Exception e) {
            //handle exception
        }

        System.out.println("is done "+futureObj.isDone());
        System.out.println("is cancelled : "+futureObj.isCancelled());

    }
}
