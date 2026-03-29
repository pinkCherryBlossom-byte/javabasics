package basic.optional;

import java.util.Optional;

public class MyStringUtil {

    public Optional<String> getUserName() {
        return Optional.of("World");
    }
}
