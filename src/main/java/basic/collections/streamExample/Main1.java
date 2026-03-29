package basic.collections.streamExample;

import java.util.*;

public class Main1 {

    public static void main(String[] args) {
        List<Integer> salList = new ArrayList<>();
        salList.add(3000);
        salList.add(4100);
        salList.add(9000);
        salList.add(1000);
        salList.add(3500);

        int count = 0;
        for(Integer salary:salList) {
            if(salary>3000) {
                count++;
            }
        }

        System.out.println(count);

        //using stream
        long output = salList.stream().filter((Integer sal)->sal>3000).count();
        System.out.println(output);
    }
}
