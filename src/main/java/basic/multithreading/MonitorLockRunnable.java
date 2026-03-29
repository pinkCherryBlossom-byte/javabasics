package basic.multithreading;

public class MonitorLockRunnable implements Runnable{

    MonitorLockExample obj;

    public MonitorLockRunnable(MonitorLockExample obj) {
        this.obj=obj;
    }

    @Override
    public void run() {
        obj.task1();
    }
}
