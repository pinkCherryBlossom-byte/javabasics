package basic.exception;

public class Main10 {

    public static void main(String[] args) {
        try {
            method1();
        }catch(ClassNotFoundException e) {
            //handle it
        }catch (Exception e) {
            //handle it
        }
    }

    public static void method1() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }
}
