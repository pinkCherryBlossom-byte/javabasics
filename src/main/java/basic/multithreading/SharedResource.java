package basic.multithreading;

public class SharedResource {

    boolean itemAvailable = false;

    //synchronized put monitor lock
    public synchronized void addItem() {
        itemAvailable = true;
        System.out.println("Item added by : "+Thread.currentThread().getName());
        notifyAll();
    }

    public synchronized void consumeItem() {
        System.out.println("Consume Item : "+Thread.currentThread().getName());

        //using while loop to avoid spurious wake up
        while(!itemAvailable) {
            try {
                System.out.println("Thread waiting : "+Thread.currentThread().getName());
                wait(); //to release monitor lock
            }catch(Exception e) {
                //handle exception here
            }
        }

        System.out.println("Item consumed by : "+Thread.currentThread().getName());
        itemAvailable = false;
    }
}
