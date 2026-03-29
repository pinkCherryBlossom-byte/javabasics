package basic.optional;

import java.util.Optional;

public class Main7 {

    public static void main(String[] args) {
        Optional<String> obj = Optional.of("world");
        obj.ifPresentOrElse((String name) -> System.out.println("User found "+name),
                () -> System.out.println("User not found"));

        Optional<String> obj2 = Optional.empty();
        obj2.ifPresentOrElse((String name) -> System.out.println("User found "+name),
                () -> System.out.println("User not found"));
    }
}
