package basic.annotations.Example2;

import java.util.ArrayList;
import java.util.List;

public class Log1 {

    public static void printLogValues(List<Integer>... logNumberList) {
        Object[] objectList = logNumberList;

        List<String> stringValueList = new ArrayList<>();
        stringValueList.add("hello");
        //this causes heap pollution as we are adding array of integer list and
        //adding string list to it.
        objectList[0] = stringValueList;
    }
}
