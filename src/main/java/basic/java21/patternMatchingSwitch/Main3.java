package basic.java21.patternMatchingSwitch;

public class Main3 {

    public static void main(String[] args) {

        Object obj = Color.RED;

        switch(obj) {
            case Color c:
                System.out.println(c.name());
                break;
            default:
                System.out.println("Other");
        }
    }
}
