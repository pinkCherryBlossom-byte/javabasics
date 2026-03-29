package problems.producerConsumer;

public class Main {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource(3);
        Thread obj1 = new Thread(() -> {
            try {
                for(int i=0;i<6;i++) {
                    sharedResource.addItem(i);
                }
            }catch(Exception e) {
                //hanlde exception
            }
        });
        Thread obj2 = new Thread(() -> {
            try {
                for (int i = 0; i < 6; i++) {
                    sharedResource.consumeItem();
                }
            }catch(Exception e) {
                //handle exception
            }
        });
        obj1.start();
        obj2.start();
    }
}
