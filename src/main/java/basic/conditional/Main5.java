package basic.conditional;

public class Main5 {

    public static void main(String[] args) {
        Day val = Day.SUNDAY;
        int output = 0;
        switch(val) {
            case SUNDAY:
                output = 1;
                break;
            case MONDAY:
                output = 2;
                break;
            case TUESDAY:
                output = 3;
                break;
        }
        System.out.println(output);
    }
}
