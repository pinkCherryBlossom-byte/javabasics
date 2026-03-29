package basic.exception;

public class Main13 {

    public static void main(String[] args) {
        try {
            method("dummy");
            return;
        }finally {
            //finally will always get executed
            //finally will be written only once
            //finally is used mostly for closing purpose
            System.out.println("inside finally");
        }
    }

    public static void method(String name) {

    }
}
