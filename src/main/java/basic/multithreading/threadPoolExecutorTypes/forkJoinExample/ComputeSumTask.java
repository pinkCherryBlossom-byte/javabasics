package basic.multithreading.threadPoolExecutorTypes.forkJoinExample;

import java.util.concurrent.RecursiveTask;

public class ComputeSumTask extends RecursiveTask<Integer> {

    int start;
    int end;

    ComputeSumTask(int start,int end) {
        this.start=start;
        this.end=end;
    }

    @Override
    protected Integer compute() {
        if(end-start<=4) {
            int totalSum = 0;
            for(int i=start;i<=end;i++) {
                totalSum+=i;
            }
            return totalSum;
        }else {
            int mid = (start+end)/2;
            ComputeSumTask leftTask = new ComputeSumTask(start,mid);
            ComputeSumTask rightTask = new ComputeSumTask(mid+1,end);

            //fork the task for parallel execution
            //One task will be picked by say thread2 and other task will be placed in work stealing queue
            leftTask.fork();
            rightTask.fork();

            //combine the results of left task
            int leftResult = leftTask.join();
            int rightResult = rightTask.join();

            //combine results
            return leftResult+rightResult;
        }
    }
}
