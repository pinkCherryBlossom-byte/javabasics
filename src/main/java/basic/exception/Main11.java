package basic.exception;

public class Main11 {

    public static void main(String[] args) {
        try {
            method1();
        }catch(Exception e) {
            //handle it
        }
        //This gives error as we cannot write big to small
        /*catch(ClassNotFoundException e) {

        } */
    }

    public static void method1() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }
}
