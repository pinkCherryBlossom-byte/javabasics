package basic.java16.patternMatch;

public class Main3 {

    public static void main(String[] args) {
        Object obj = 5;

        if(obj instanceof Integer i && i<10) {
            System.out.println(i);
        }
    }
}
