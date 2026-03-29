package basic.java16.patternMatch;

public class Main1 {

    public static void main(String[] args) {
        Object obj = "Hello World";
        if(obj instanceof String s) {
            System.out.println(s.toUpperCase());
        }
    }
}
