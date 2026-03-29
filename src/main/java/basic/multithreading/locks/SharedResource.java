package basic.multithreading.locks;

public class SharedResource {

    boolean isAvailable = false;

    public synchronized void producer() {
        try {
            System.out.println("Lock acquired by : "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(3000);
        }catch(Exception e) {
            //handle exception
        }
        System.out.println("Lock released by : "+Thread.currentThread().getName());

    }
}
