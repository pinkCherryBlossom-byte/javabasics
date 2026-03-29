package basic.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Main6Pojo {

        @Setter(AccessLevel.NONE)
        String name;
        boolean commit;

}
