package basic.lombok;

import lombok.Data;
import lombok.NonNull;

@Data
public class Main13 {

    //using @data include
    //1. toString
    //2. equalsAndHashCode
    //3. getter on all fields
    //4. setter on all non final fields
    //5. requiredArgsConstructor on all fields

    String name;
    final Integer age;
    @NonNull
    String address;
}
