package basic.exception;

public class Main2 {

    public static void main(String[] args) {
        Object a1 = 2;
        //This causes ClassCastException
        System.out.println((String)a1);
    }
}
