package basic.java21.patternMatchingSwitch;

public class Main1 {

    public static void main(String[] args) {
        Object obj = "hello world";

        switch(obj) {
            case String s :
                System.out.println("String: "+s);
                break;
            case Integer i:
                System.out.println("Integer: "+i);
                break;
            default:
                System.out.println("Other type");
        }
    }
}
