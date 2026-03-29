package basic.collections.streamExample;

import java.util.Arrays;
import java.util.List;

public class Main8 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11,22,33,44,55,66,77,88,99,110);

        //sequential Processing
        long sequentialProcessingTime = System.currentTimeMillis();
        numbers.stream().map((Integer val) -> (long)(val*val*val*val*val*val*val*val*val*val)).forEach((Long val) -> System.out.println(val));
        System.out.println("Sequential Processing time : "+(System.currentTimeMillis()-sequentialProcessingTime));

        //parallel Processing
        long parallelProcessingTime = System.currentTimeMillis();
        numbers.parallelStream().map((Integer val) -> (long) (val*val*val*val*val*val*val*val*val*val)).forEach((Long val) -> System.out.println(val));
        System.out.println("Parallel Processing time : "+(System.currentTimeMillis()-parallelProcessingTime));

    }
}
