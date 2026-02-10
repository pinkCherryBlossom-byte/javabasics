package basic.multithreading;

public class Main2 {

    public static void main(String[] args) {
        System.out.println("Going inside main : "+Thread.currentThread().getName());
        MultiThread1 myThread = new MultiThread1();
        myThread.start();
        System.out.println("Finish Main method : "+Thread.currentThread().getName());
    }
}
