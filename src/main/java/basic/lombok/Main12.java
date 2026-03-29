package basic.lombok;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Main12 {

    String name;

    @EqualsAndHashCode.Exclude
    boolean commit;

    static int maxTerm = 10;
}
