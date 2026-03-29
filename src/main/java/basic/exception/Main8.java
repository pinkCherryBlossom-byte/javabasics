package basic.exception;

public class Main8 {

    public static void main(String[] args) {
        method();
    }

    public static void method() {
        try {
            throw new ClassNotFoundException();
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
