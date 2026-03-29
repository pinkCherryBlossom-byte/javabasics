package basic.exception;

public class Main5 {

    public static void main(String[] args) {
        String a = null;
        //This gives nullPointerException
        System.out.println(a.charAt(0));
    }
}
