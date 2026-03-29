package basic.java14.switchcase;

public class Main7 {

    public static void main(String[] args) {
         int day = 1;
         String value = switch(day) {
             case 1,7 : yield "weekend";
             case 2,3,4,5,6 : yield "weekday";
             default : yield "not applicable";
         };
         System.out.println(value);
    }
}
