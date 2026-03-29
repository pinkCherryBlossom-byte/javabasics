package basic.java14.switchcase;

public class Main5 {

    public static void main(String[] args) {
        Days day = Days.FRIDAY;

        //If you are not able to provide value for all enums you can have 1 as default
        int count = switch(day) {
          case MONDAY -> 5;
          case WEDNESDAY -> 6;
          case SATURDAY -> 7;
          default -> 0;
        };

        System.out.println(count);
    }
}
