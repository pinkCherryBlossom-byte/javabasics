package basic.multithreading;

public class Main1 implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread name in run : "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Thread name: "+Thread.currentThread().getName());
        Main1 runObj = new Main1();
        Thread thread = new Thread(runObj);
        thread.start();
        System.out.println("Finish main thread "+Thread.currentThread().getName());
    }
}
