package practice.jan.a25;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Test4 {


    private Map<String,Integer> marksObtained = new HashMap<>();
    private  ReadWriteLock lock = new ReentrantReadWriteLock();

    public void setMarks(String subject, Integer marks) {
        lock.writeLock().lock();
        try {
            marksObtained.put(subject, marks);
        }finally {
            lock.writeLock().unlock();
        }
    }

    public double averageMarks() {
        //commenting any locks is going to give concurrentmodification exception
       lock.readLock().lock();
        var sum=0.0;
        try {
            for(Integer mark:marksObtained.values()) {
                sum = sum+mark;
            }
            return sum/marksObtained.size();
        } finally {
            lock.readLock().unlock();
        }
    }

     static void main(String[] args) {
        final Test4 s = new Test4();
        new Thread() {
            public void run() {
                int x = 0;
                while(true)  {
                    int m = (int) (Math.random()*100);
                    s.setMarks("Sub "+x,m);
                    x++;
                }
            }
        }.start();

        for(int i=0;i<5;i++) {
            new Thread() {
                public void run() {
                    while(true) {
                        double av = s.averageMarks();
                        System.out.println(av);
                    }
                }
            }.start();
        }
    }
}
