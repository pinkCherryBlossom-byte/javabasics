package basic.conditional;

public class Main7 {

    public static void main(String[] args) {
        //This is case N -> available from java 12

        String day = "";
        int val = 1;
        String output = switch(val) {
            case 1-> "one";
            case 2-> "two";
            case 3-> "default";
            default-> "none";
        };
        System.out.println(output);
    }
}
