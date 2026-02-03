package basic.conditional;

public class Main3 {

    public static void main(String[] args) {
        String month = "March";
        switch(month) {
            case "January","February","March":
                System.out.println("This is Q1 cycle");
                break;
            case "April","May","June":
                System.out.println("This is Q2 cycle");
                break;
            default:
                System.out.println("This is Q3 or Q4 cycle");
                break;
        }
    }
}
