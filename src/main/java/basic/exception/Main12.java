package basic.exception;

public class Main12 {

    public static void main(String[] args) {
        try {
            method1("dummy");
        }catch(ClassNotFoundException | InterruptedException e) {
            //hanlde
        }
    }

    public static void method1(String name) throws ClassNotFoundException, InterruptedException {
        if(name.equals("dummy")) {
            throw new ClassNotFoundException();
        }else {
            throw new InterruptedException();
        }
    }
}
