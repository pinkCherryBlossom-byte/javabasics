package basic.lombok;

import lombok.ToString;

@ToString(includeFieldNames=false)
public class Main9 {

    //It ll not include field names it will just include values
    String name;
    boolean commit;
}
