package basic.java21.patternMatchingSwitch;

public class Main4 {

    public static void main(String[] args) {
        Object obj = null;
        switch(obj) {
            case String s:
                System.out.println(s);
                break;
            default:
                System.out.println("null or other");
                break;
        }
    }
}
