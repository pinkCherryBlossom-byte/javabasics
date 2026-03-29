package basic.lombok;

import lombok.Getter;
import lombok.Setter;

//Getter method is allowed to non-static
//setter method is allowed to all non-static and non final
@Getter
@Setter
public class Main5Pojo {

    String name;
    boolean commit;
}
