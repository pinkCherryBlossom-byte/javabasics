package basic.collections.dequeExample;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main7 {

    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        list.add(0,100);
        System.out.println(list.get(0));
    }
}
