package basic.multithreading.virtualThreads;

public class Main1 {

    public static void main(String[] args) {
        Thread th1 = Thread.ofVirtual().start(() -> {
            System.out.println("Creating virtual thread using Thread");
        });
        try {
            //use join because virtual thread are daemon thread and here after main is finished virtual thread also
            //gets closed
            th1.join();
        }catch(Exception e) {
            //handle exception
        }
    }
}
