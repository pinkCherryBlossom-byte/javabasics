package basic.exception;

public class Main16 {

    public static void main(String[] args) {
        method1(-1);
    }

    public static void method1(int n) {
        try {
            String s[] = new String[2];
            s[0] = "new value";
            s[1] = "new value 2";
            System.out.println(s[n]);
        }catch(IndexOutOfBoundsException e) {
            System.err.println("Integer doesn't exist");
        }catch(Exception e) {
            System.err.println("Other error occurrence");
        }
    }
}
