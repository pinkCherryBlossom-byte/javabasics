package basic.multithreading.threadlocalExample;

public class Main1 {

    public static void main(String[] args) {
        ThreadLocal<String> th = new ThreadLocal<>();

        //main thread
        th.set(Thread.currentThread().getName());

        Thread th2 = new Thread(() -> {
            th.set(Thread.currentThread().getName());
            System.out.println("Task1");
        });

        th2.start();

        try {
            Thread.sleep(2000);
        }catch(Exception e) {
            //handle exception
        }

        System.out.println("Main obj : "+th.get());
    }
}
