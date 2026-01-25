package practice.jan.a25;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
     static void main(String[] args) {
        Stream<Integer> strm1 = Stream.of(2,3,5,7,11,13);
        double av = strm1.
                filter(x -> {
                    if(x>10) return true;
                    else return false;
                }).
                peek(System.out::print). //peek is actually a consumer, we must pass argumentSS
                collect(Collectors.averagingInt(y->y));
        System.out.println(av);
    }
}
