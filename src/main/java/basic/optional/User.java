package basic.optional;

import lombok.Getter;

import java.util.Optional;

@Getter
public class User {

    String name;
    int id;

    public User(String name,int id) {
        this.name=name;
        this.id=id;
    }

    public User() {

    }

    public Optional<User> findUserById(int id) {
        Optional.empty();
        return Optional.of(new User("world", 1));

    }
}
