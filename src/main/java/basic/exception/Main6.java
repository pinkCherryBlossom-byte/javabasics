package basic.exception;

public class Main6 {

    public static void main(String[] args) {
        String a = "abc";
        //This will throw NumberFormatException
        System.out.println(Integer.parseInt("abc"));
    }
}
