package basic.collections.streamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main7 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);
        Stream<Integer> filteredStream = numbers.stream().filter((Integer val) -> val>=3);
        filteredStream.forEach(System.out::println);

        //This line will give error coz we have already closed the stream with forEach
        filteredStream.collect(Collectors.toList());
    }
}
