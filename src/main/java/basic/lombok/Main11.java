package basic.lombok;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Main11 {

    String name;

    boolean commit;

    // with requiredArgsConstructor, only marked with not null or final will be included in the constructor
    @NonNull
    Integer age;
}
