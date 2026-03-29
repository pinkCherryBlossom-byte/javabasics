package basic.multithreading;

public class Main4 {

    public static void main(String[] args) {
        System.out.println("SharedResource start from here : "+Thread.currentThread().getName());
        SharedResource obj = new SharedResource();
        Thread obj1 = new Thread(new ProduceTask(obj));
        Thread obj2 = new Thread(new ConsumeTask(obj));
        obj1.start();
        obj2.start();

        System.out.println("SharedResource end here : "+Thread.currentThread().getName());
    }
}
