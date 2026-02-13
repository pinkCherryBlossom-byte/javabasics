package basic.lombok;

import lombok.NonNull;
import lombok.Value;

@Value
public class Main14 {

    //@value is immutable version of data
    // all field is made private and final
    //setter no generated
    //class made final
    //toString and EqualsAndHashCode is generated
    //getter on all fields
    //@requiredArgsConstructor is created

    String name;
    final Integer age;
    @NonNull
    String address;
}
