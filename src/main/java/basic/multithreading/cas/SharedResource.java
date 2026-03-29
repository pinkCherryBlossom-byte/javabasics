package basic.multithreading.cas;

public class SharedResource {

    int counter;

    public void increment() {
        counter++;
    }

    public int get() {
        return counter;
    }
}
