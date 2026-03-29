package basic.optional;

import java.util.Optional;

public class Main3 {

    public static void main(String[] args) {
        MyStringUtil obj = new MyStringUtil();
        Optional<String> op = obj.getUserName();
        Optional<Integer> len = op.map((String val) -> {
            int l = val.length();
            return l;
        });
        System.out.println(len.get());
    }
}
