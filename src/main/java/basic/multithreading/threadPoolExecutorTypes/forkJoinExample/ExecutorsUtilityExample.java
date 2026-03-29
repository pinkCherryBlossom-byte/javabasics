package basic.multithreading.threadPoolExecutorTypes.forkJoinExample;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class ExecutorsUtilityExample {

    public static void main(String[] args) {
        ForkJoinPool pool = ForkJoinPool.commonPool();
        Future<Integer> futureObj = pool.submit(new ComputeSumTask(0,100));
        try {
            System.out.println(futureObj.get());
        }catch(Exception e) {
            //handle exception
        }
    }
}
