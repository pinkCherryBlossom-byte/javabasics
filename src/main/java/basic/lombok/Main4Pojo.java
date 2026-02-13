package basic.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class Main4Pojo {

    @Getter(AccessLevel.PRIVATE)
    @Setter(AccessLevel.PROTECTED)
    String name;

    @Getter
    @Setter
    boolean commit;
}
