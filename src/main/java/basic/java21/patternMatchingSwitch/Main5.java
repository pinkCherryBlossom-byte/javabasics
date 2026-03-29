package basic.java21.patternMatchingSwitch;

public class Main5 {

    public static void main(String[] args) {
        Object obj = "Hello World";
        switch(obj) {
            case String s when(s.contains("h") || s.contains("H")) :
                System.out.println(s);
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}
