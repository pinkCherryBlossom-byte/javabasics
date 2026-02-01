package basic.exception;

import java.io.FileNotFoundException;

public class Main9 {

    public static void main(String[] args) {
        try {
            method1("dummy");
        }catch(ClassNotFoundException e) {
            //handle it
        }catch(InterruptedException e) {
            //handle it
        }
        //catch will not catch Exception that is not thrown by method1
        /*catch(FileNotFoundException e) {

        } */
    }

    public static void method1(String name) throws ClassNotFoundException,InterruptedException {
        if(name.equals("dummy")) {
            throw new ClassNotFoundException();
        }else {
            throw new InterruptedException();
        }
    }
}
