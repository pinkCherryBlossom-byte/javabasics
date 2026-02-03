package basic.conditional;

public class Main8 {

    public static void main(String[] args) {
        String day = "";
        int val = 1;
        String output = switch(val) {
            case 1-> {
                int c = 1+val;
                System.out.println(c);
                yield "one";
            }
            case 2-> {
                //some logic here
                yield "two";
            }
            default-> {
                //some logic here
                yield "none";
            }
        };
        System.out.println(output);
    }
}
