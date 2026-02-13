package basic.java14.switchcase;

public class Main4 {

    public static void main(String[] args) {
        Days day = Days.FRIDAY;

        int count = switch(day) {
          case MONDAY,FRIDAY,SUNDAY -> {
              if(day== Days.SUNDAY) {
                  throw new IllegalArgumentException("Sunday is holiday");
              }
              yield 6;
          }
          case TUESDAY -> 7;
          case THURSDAY,SATURDAY -> 8;
          case WEDNESDAY -> 9;
        };

        System.out.println(count);
    }
}
