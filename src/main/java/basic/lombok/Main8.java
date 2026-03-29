package basic.lombok;

import lombok.ToString;

@ToString
public class Main8 {

    String name;

    @ToString.Exclude
    boolean commit;
}
