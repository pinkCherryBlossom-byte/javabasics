package basic.optional;

import java.util.Optional;

public class Main4 {

    public static void main(String[] args) {
        MyStringUtil obj = new MyStringUtil();
        Optional<String> op = obj.getUserName();
        Optional<Optional<Integer>> len = op.map((String val) -> {
            int v = val.length();
            return Optional.of(v);
        });
        // here it is returning optional of optional to resolve this
        //we can use

        Optional<Integer> len1 = op.flatMap((String val) -> {
            int v = val.length();
            return Optional.of(v);
        });

        System.out.println(len1.get());

    }
}
