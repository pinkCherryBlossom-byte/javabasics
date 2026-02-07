package basic.collections.streamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main2 {

    public static void main(String[] args) {
        //Different ways to create stream

        //1. From collection
        List<Integer> salList = Arrays.asList(3000,4100,9000,1000,3000);
        Stream<Integer> streamFromIntegerList = salList.stream();

        //2. From Array
        Integer[] salArray = {3000,4100,9000,1000,3000};
        Stream<Integer> streamFromIntegerArray = Arrays.stream(salArray);

        //3. From static method
        Stream<Integer> streamFromStaticMethod = Stream.of(3000,4100,9000,1000,3000);

        //4. from Stream builder
        Stream.Builder<Integer> streamBuilder = Stream.builder();
        streamBuilder.add(3000).add(4100).add(9000);
        Stream<Integer> streamFromStreamBuilder = streamBuilder.build();

        //5. from stream Iterate
        Stream<Integer> streamFromIterate = Stream.iterate(1000, (Integer n)->n+5000).limit(5);



    }
}
