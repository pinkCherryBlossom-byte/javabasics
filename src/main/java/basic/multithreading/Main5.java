package basic.multithreading;

public class Main5 {

    public static void main(String[] args) {
        // same thing as Main4 but here we are using Lambda expression

        SharedResource sharedResource = new SharedResource();
        Thread obj1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
                sharedResource.addItem();
            }catch(Exception e) {
                //handle exception here
            }
        });
        Thread obj2 = new Thread(() -> sharedResource.consumeItem());

        obj1.start();
        obj2.start();
    }
}
