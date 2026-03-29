package basic.lombok;

import lombok.ToString;

@ToString(onlyExplicitlyIncluded = true)
public class Main10 {

    String name;

    //only the one marked with include will be included
    @ToString.Include
    boolean commit;
}
