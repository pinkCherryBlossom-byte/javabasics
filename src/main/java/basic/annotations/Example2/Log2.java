package basic.annotations.Example2;

import java.util.ArrayList;
import java.util.List;

public class Log2 {

    @SafeVarargs
    public static void printLogValues(List<Integer>... logNumberList) {
        Object[] objectList = logNumberList;

        List<String> stringValueList = new ArrayList<>();
        stringValueList.add("hello");
        objectList[0] = stringValueList;
    }
}
