package basic.java14.switchcase;

public class Main3 {

    public static void main(String[] args) {
        Days day = Days.FRIDAY;

        //We use this if we have only 1 statement
        int count = switch(day) {
            case MONDAY,FRIDAY,SUNDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY,SATURDAY ->8;
            case WEDNESDAY -> 9;
        };

        System.out.println(count);
    }
}
