package basic.optional;

import java.util.Optional;

public class main2 {

    public static void main(String[] args) {
        Optional<String> name = Optional.of("World");
        if(name.isPresent()) {
            System.out.println(name.get());
        }

        Optional<String> name2 = Optional.empty();
        System.out.println(name2.orElse("default"));
        System.out.println(name2.orElseGet(() -> {
            return "lambda expression";
        }));

        System.out.println(name2.orElseThrow(() -> new IllegalArgumentException("user not found")));
        System.out.println(name2.get());
    }
}
