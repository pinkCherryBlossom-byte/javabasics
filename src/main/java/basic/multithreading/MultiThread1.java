package basic.multithreading;

public class MultiThread1 extends Thread{

    @Override
    public void run() {
        System.out.println("Run by Thread : "+Thread.currentThread().getName());
    }
}
