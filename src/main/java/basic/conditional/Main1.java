package basic.conditional;

public class Main1 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        switch(a+b) {
            case 1:
                System.out.println("a +b"+ 1);
                break;
            case 2:
                System.out.println("a+b"+ 2);
                break;
            case 3:
                System.out.println("a+b"+3);
                break;
            default:
                System.out.println("a+b"+4);
                break;
        }
    }
}
