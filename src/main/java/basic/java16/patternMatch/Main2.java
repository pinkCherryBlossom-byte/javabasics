package basic.java16.patternMatch;

public class Main2 {

    public static void main(String[] args) {
        Object obj = "Hello World";

        if(obj instanceof String s) {
            System.out.println(s.toUpperCase());
        } else if(obj instanceof Integer i) {
            System.out.println(i);
        } else if(obj instanceof User u) {
            System.out.println(u.getAge());
        }
    }
}
