package basic.exception;

public class Main7 {

    public static void main(String[] args) throws ClassNotFoundException {
        //Here the compiler will force you to handle properly else it won't compile
        method1();
    }

    public static void method1() throws ClassNotFoundException {
        //If I don't give throws ClassNotFoundException it won't compile
        //or we can use try catch block
        throw new ClassNotFoundException();
    }
}
