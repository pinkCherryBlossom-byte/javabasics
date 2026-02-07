package basic.collections.streamExample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main6 {

    public static void main(String[] args) {
        //This is list of terminal operations

        //1. using forEach
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);
        numbers.stream().filter((Integer val)-> val>=3).forEach(System.out::println);

        //2. toArray
        List<Integer> numbers1 = Arrays.asList(2,1,4,7,10);
        Object[] filteredNumberArrType1 = numbers1.stream().filter((Integer val)-> val>=3).toArray();
        System.out.println("Object array : "+filteredNumberArrType1);

        Integer[] filteredNumberArrType2 = numbers1.stream().filter((Integer val)-> val>=3)
                .toArray((int size) ->new Integer[size]);
        System.out.println("Integer array : "+filteredNumberArrType2);

        //3. reduce
        List<Integer> numbers3 = Arrays.asList(2,1,4,7,10);
        Optional<Integer> reduceValue = numbers3.stream().reduce((Integer val1,Integer val2)-> val1+val2);
        System.out.println(reduceValue);

        //4. collect
        List<Integer> numbers4 = Arrays.asList(2,1,4,7,10);
        List<Integer> filteredNumber = numbers4.stream().filter((Integer val) -> val>=3)
                .collect(Collectors.toList());
        System.out.println(filteredNumber);

        //5. min and max
        List<Integer> numbers5 = Arrays.asList(2,1,4,7,10);
        Optional<Integer> minimunVal = numbers5.stream().filter((Integer val) -> val>=3)
                .min((Integer val1,Integer val2) -> (val1-val2));
        System.out.println(minimunVal);

        Optional<Integer> maxVal = numbers5.stream().filter((Integer val) -> val>=3)
                .min((Integer val1,Integer val2) -> (val2-val1));
        System.out.println(maxVal);

        //6. count
        List<Integer> number6 = Arrays.asList(2,1,4,7,10);
        long noOfValuesPresent = number6.stream().filter((Integer val) -> val>=3).count();
        System.out.println(noOfValuesPresent);

        //7. anyMatch
        List<Integer> number7 = Arrays.asList(2,1,4,7,10);
        boolean hasValue = number7.stream().anyMatch((Integer val) -> val>=3);
        System.out.println(hasValue);

        //8. allMatch
        List<Integer> number8 = Arrays.asList(2,1,4,7,10);
        boolean hasValue1 = number8.stream().allMatch((Integer val) -> val>=3);
        System.out.println(hasValue1);

        //9. noneMatch
        List<Integer> number9 = Arrays.asList(2,1,4,7,10);
        boolean noneMatch = number9.stream().noneMatch((Integer val) -> val>=3);
        System.out.println(noneMatch);

        //10. findFirst
        List<Integer> number10 = Arrays.asList(2,1,4,7,10);
        Optional<Integer> findFirst = number10.stream().filter((Integer val) -> val>=3).findFirst();
        System.out.println(findFirst);

        //11. findAny
        List<Integer> number11 = Arrays.asList(2,1,4,7,10);
        Optional<Integer> findAny = number11.stream().filter((Integer val) -> val>=3).findAny();
        System.out.println(findAny);
    }
}
