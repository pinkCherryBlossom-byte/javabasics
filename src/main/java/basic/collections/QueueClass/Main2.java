package basic.collections.QueueClass;

import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {
        Integer[] arr = {6,1,9,3};
        Arrays.sort(arr,(Integer a,Integer b)-> (b-a));

        for(int a:arr) {
            System.out.println(a);
        }
    }
}
