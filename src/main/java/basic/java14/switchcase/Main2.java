package basic.java14.switchcase;

public class Main2 {

    public static void main(String[] args) {
        Days day = Days.FRIDAY;

        switch(day) {
            case MONDAY,FRIDAY,SUNDAY -> System.out.println(6);
            case TUESDAY -> System.out.println(7);
            case THURSDAY,SATURDAY -> System.out.println(8);
            case WEDNESDAY-> System.out.println(9);
        }
    }
}
