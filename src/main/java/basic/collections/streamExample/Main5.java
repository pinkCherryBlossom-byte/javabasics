package basic.collections.streamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main5 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);
        Stream<Integer> numbersStream = numbers.stream()
                .filter((Integer val) -> val>=3)
                .peek((Integer val) -> System.out.println(val))
                .map((Integer val) -> (val*-1))
                .peek((Integer val) -> System.out.println("After map : "+val))
                .sorted()
                .peek((Integer val) -> System.out.println("After sorting : "+val));

        List<Integer> res = numbersStream.collect(Collectors.toList());
        System.out.println(res);
    }
}
