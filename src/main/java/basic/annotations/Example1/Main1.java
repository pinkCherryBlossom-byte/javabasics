package basic.annotations.Example1;

public class Main1 {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.dummyMethod();
        //but after adding suppressWarnings annotations the warning is gone
    }
}
