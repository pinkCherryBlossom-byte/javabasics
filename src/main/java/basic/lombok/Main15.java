package basic.lombok;

import lombok.Builder;

@Builder
public class Main15 {

    String name;
    Integer age;

    public static void main(String[] args) {
        Main15 main15 = Main15.builder().age(20).name("abc").build();
    }
}
