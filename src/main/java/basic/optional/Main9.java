package basic.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main9 {

    public static void main(String[] args) {
        List<User1> users = Arrays.asList(new User1("a@gmail.com"),
                new User1(null),
                new User1("b@gmail.com"),
                new User1(null));

        List<String> emails = users.stream().map((User1 usr) -> usr.getEmail()).
                flatMap((Optional<String> us) -> us.stream()). //optional<String> is converetd to stream<String>
                        //flatmap also removes all the null values
                collect(Collectors.toList());

        System.out.println(emails);
    }
}
