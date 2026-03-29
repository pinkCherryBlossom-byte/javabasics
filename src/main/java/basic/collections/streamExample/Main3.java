package basic.collections.streamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Main3 {

    public static void main(String[] args) {

        //Here are the list of intermediate methods

        // Filter method
        Stream<String> nameStream = Stream.of("HELLO","EVERYBODY","HOW","ARE","YOU","DOING");
        Stream<String> filteredStream = nameStream.filter((String name) -> name.length()<=3);
        List<String> filteredNameList = filteredStream.collect(Collectors.toList());
        System.out.println(filteredNameList);

        // map method
        Stream<String> nameStream1 = Stream.of("HELLO","EVERYBODY","HOW","ARE","YOU","DOING");
        Stream<String> mappedName = nameStream1.map((String name) -> name.toLowerCase());
        List<String> mappedList = mappedName.collect(Collectors.toList());
        System.out.println(mappedList);

        //flatmap method
        List<List<String>> sentenceList = Arrays.asList(
                Arrays.asList("I","LOVE","JAVA"),
                Arrays.asList("CONCEPTS","ARE","CLEAR"),
                Arrays.asList("ITS","VERY","EASY"));

        Stream<String> wordsStream1 = sentenceList.stream().flatMap((List<String> sentence) -> sentence.stream());
        List<String> res1 = wordsStream1.collect(Collectors.toList());
        System.out.println(res1);

        Stream<String> wordsStream2 = sentenceList.stream()
                .flatMap((List<String> sentence) -> sentence.stream().map((String value) -> value.toLowerCase()));
        List<String> res2 = wordsStream2.collect(Collectors.toList());
        System.out.println(res2);

        //distinct
        Integer[] arr = {1,5,2,7,4,4,2,0,9};
        Stream<Integer> arrStream = Arrays.stream(arr).distinct();
        List<Integer> res3 = arrStream.collect(Collectors.toList());
        System.out.println(res3);

        //sorted
        //ascending
        Integer[] arr1 = {1,5,2,7,4,4,2,0,9};
        Stream<Integer> arrStream1 = Arrays.stream(arr1).sorted();
        List<Integer> res4 = arrStream1.collect(Collectors.toList());
        System.out.println(res4);

        //descending
        Integer[] arr2 = {1,5,2,7,4,4,2,0,9};
        Stream<Integer> arrStream2 = Arrays.stream(arr2).sorted((Integer a,Integer b) -> b-a);
        List<Integer> res5 = arrStream2.collect(Collectors.toList());
        System.out.println(res5);

        //peek
        List<Integer> numbers = Arrays.asList(2,1,3,4,6);
        Stream<Integer> numberStream = numbers.stream()
                .filter((Integer val) -> val>2)
                .peek((Integer val) -> System.out.println(val))
                .map((Integer val) -> -1*val);
        List<Integer> res6 = numberStream.collect(Collectors.toList());
        System.out.println(res6);

        //limit
        List<Integer> numbers1 = Arrays.asList(2,1,3,4,6);
        Stream<Integer> numberStream1 = numbers1.stream().limit(3);
        List<Integer> res7 = numberStream1.collect(Collectors.toList());
        System.out.println(res7);

        //skip
        List<Integer> numbers2 = Arrays.asList(2,1,3,4,6);
        Stream<Integer> numberStream2 = numbers2.stream().skip(3);
        List<Integer> res8 = numberStream2.collect(Collectors.toList());
        System.out.println(res8);

        //mapToInt
        List<String> numbers3 = Arrays.asList("2","1","4","7");
        IntStream numberStream3 = numbers3.stream().mapToInt((String val)-> Integer.parseInt(val));
        int[] numberArray = numberStream3.toArray();
        for(int i=0;i<numberArray.length;i++) {
            System.out.print(numberArray[i]+" ");
        }
        System.out.println();

        int[] numbersArray6 = {2,1,4,7};
        IntStream numbersStream6 = Arrays.stream(numbersArray6);
        numbersStream6 = numbersStream6.filter((int val) -> val>2);
        int[] filterArray6 = numbersStream6.toArray();
        for(int i=0;i<filterArray6.length;i++) {
            System.out.print(filterArray6[i]+" ");
        }
        System.out.println();

        //mapToLong
        List<String> numbers4 = Arrays.asList("2","1","4","7");
        LongStream numberStream4 = numbers4.stream().mapToLong((String val) -> Long.parseLong(val));
        long[] numberArray1 = numberStream4.toArray();
        for(int i=0;i<numberArray1.length;i++) {
            System.out.print(numberArray1[i]+" ");
        }
        System.out.println();

        //mapToDouble
        List<String> numbers5 = Arrays.asList("2","1","4","7");
        DoubleStream numberStream5 = numbers5.stream().mapToDouble((String val) -> Double.parseDouble(val));
        double[] numberArray2 = numberStream5.toArray();
        for(int i=0;i<numberArray2.length;i++) {
            System.out.println(numberArray2[i]+" ");
        }
        System.out.println();
    }
}
