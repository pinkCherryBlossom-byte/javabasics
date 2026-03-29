package basic.lombok;

import lombok.val;

public class Main1 {

    public static void main(String[] args) {
        val a = 10;
        // here we cannot update value of a as it is final
        System.out.println(a);

        var b = 20;
        b=30;
        System.out.println(b);
    }
}
