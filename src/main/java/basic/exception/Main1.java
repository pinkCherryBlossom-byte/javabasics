package basic.exception;

public class Main1 {

    //Exception occured during runtime
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        //this exception occurs during runtime and compiler doesn't force us to handle it
        throw new ArithmeticException();
    }
}
