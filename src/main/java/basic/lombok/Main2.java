package basic.lombok;

import lombok.NonNull;

public class Main2 {

    //if the value is marked as null then it will throw NullPointerException
    public static void demoMethod(@NonNull String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        demoMethod("hello");
        demoMethod(null);
    }
}
