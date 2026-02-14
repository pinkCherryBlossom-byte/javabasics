package basic.optional;

import java.util.Optional;

public class Main5 {

    public static void main(String[] args) {
        Optional<String> op = Optional.of("World");
        op = op.filter((String val) -> {
            return val.length()>10;
        });
        System.out.println(op.isPresent());

        op = op.filter((String val) -> {
            return val.length()<10;
        });
        System.out.println(op.isPresent());
    }
}
