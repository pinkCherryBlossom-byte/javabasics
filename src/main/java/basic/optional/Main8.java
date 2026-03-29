package basic.optional;

import java.util.Optional;

public class Main8 {

    public static void main(String[] args) {
        Optional<String> obj = Optional.empty();
        Optional<String> op = obj.or(() -> {
            return Optional.of("Default");
        });

        System.out.println(op.get());
    }
}
