package basic.java14.switchcase;

public class Main6 {

    public static void main(String[] args) {
        Days day = Days.FRIDAY;

        String val = switch(day) {
          case MONDAY -> {
              String value = "Monday";
              yield value;
          }

          case TUESDAY -> {
              String value = "Tuesday";
              yield value;
          }

          default -> {
              String value = "others";
              yield value;
          }
        };

        System.out.println(val);
    }
}
