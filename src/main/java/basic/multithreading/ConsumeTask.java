package basic.multithreading;

public class ConsumeTask implements Runnable {

    SharedResource sharedResource;

    public ConsumeTask(SharedResource sharedResource) {
        this.sharedResource=sharedResource;
    }

    @Override
    public void run() {
        System.out.println("Consume Task : "+Thread.currentThread().getName());
        sharedResource.consumeItem();
    }
}
