package basic.collections.QueueClass;

import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) {
        Integer[] arr= {5,8,1,3};
        Arrays.sort(arr, (Integer a, Integer b) -> (a-b));
        for(int a:arr) {
            System.out.println(a);
        }
    }
}
