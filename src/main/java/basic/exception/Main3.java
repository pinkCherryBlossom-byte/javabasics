package basic.exception;

public class Main3 {

    public static void main(String[] args) {
        int a1[] = new int[2];
        //This causes indexOutOfBoundException
        System.out.println(a1[3]);
    }
}
