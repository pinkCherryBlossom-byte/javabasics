package basic.optional;

import java.util.Optional;

public class User1 {

    private String email;

    public User1(String email) {
        this.email = email;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}
