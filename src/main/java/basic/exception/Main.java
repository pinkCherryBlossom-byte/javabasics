package basic.exception;

public class Main {

    public static void main(String[] args) {
        Main sampleObj = new Main();
        sampleObj.method1();
    }

    public void method1() {
        method2();
    }

    public void method2() {
        method3();
    }

    public int method3() {
        return 5/0; // this line is going to throw exception
    }
}
