package basic.collections.streamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main4 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);
        Stream<Integer> numberStream = numbers.stream().filter((Integer val) -> val>=3)
                .peek((Integer val) -> System.out.println(val));

        //This will not print anything as stream is lazy operation.
        //Until we dont add terminal operation,nothing is invoked.

        List<Integer> numbers1 = Arrays.asList(2,1,4,7,10);
        Stream<Integer> numberStream1 = numbers.stream().filter((Integer val) -> val>=3)
                .peek((Integer val) -> System.out.println(val));
        numberStream1.count();
    }
}
