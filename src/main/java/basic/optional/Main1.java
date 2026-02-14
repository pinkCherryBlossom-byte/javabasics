package basic.optional;

import java.util.Optional;

public class Main1 {

    public static void main(String[] args) {
        Optional<User> user = new User().findUserById(1);
        if(user.isPresent()) {
            User usr = user.get();
            System.out.println(usr.getName());
        }
    }
}
