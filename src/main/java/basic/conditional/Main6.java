package basic.conditional;

public class Main6 {

    public static void main(String[] args) {
        Day val = Day.SUNDAY;
        int output = 0;
        switch(val) {
            case SUNDAY:
                output = 1;
                switch(output) {
                    case 1:
                        System.out.println("output val is "+1);
                        break;
                    case 2:
                        System.out.println("output val is "+2);
                        break;
                }
            case MONDAY:
                output = 2;
                break;
        }
    }
}
