package basic.java14.switchcase;

public class Main1 {

    public static void main(String[] args) {
        Days day = Days.FRIDAY;

        switch(day) {
            case MONDAY,FRIDAY,SUNDAY :
                System.out.println(6);
                break;
            case TUESDAY :
                System.out.println(7);
                break;
            case THURSDAY,SATURDAY:
                System.out.println(8);
                break;
            case WEDNESDAY:
                System.out.println(9);
                break;
        }
    }
}
