package basic.optional;

import java.util.Optional;

public class Main6 {

    public static void main(String[] args) {
        Optional<String> obj = Optional.of("World");
        obj.ifPresent((String val) -> System.out.println(val+" is present"));
    }
}
