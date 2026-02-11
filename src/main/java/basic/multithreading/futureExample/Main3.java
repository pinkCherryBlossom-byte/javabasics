package basic.multithreading.futureExample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main3 {

    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(3,3,1,
                TimeUnit.HOURS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        //useCase1
        Future<?> futureObj1 = poolExecutor.submit(() -> {
           System.out.println("Task1 is runnable");
        });

        try {
            Object obj = futureObj1.get();
            System.out.println(obj==null);
        }catch(Exception e) {
            //handle exception
        }

        //usecase2
        List<Integer> output = new ArrayList<>();
        Future<List<Integer>> futureObj2 = poolExecutor.submit(() -> {
           output.add(100);
           System.out.println("Task2 is runnable and return output");
        },output);

        try {
            List<Integer> outputFromFutureObj2 = futureObj2.get();
            System.out.println(outputFromFutureObj2.get(0));
        }catch(Exception e) {
            //handle exception
        }

        //useCase 3
        Future<List<Integer>> futureObj3 = poolExecutor.submit(() -> {
            System.out.println("Task 3 is runnable");
            List<Integer> list1 = new ArrayList<>();
            list1.add(300);
            return list1;
        });

        try {
            List<Integer> outputFromFutureObj3 = futureObj3.get();
            System.out.println(outputFromFutureObj3.get(0));
        }catch(Exception e){
            //handle exception
        }

    }
}
