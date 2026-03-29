package basic.conditional;

public class Main2 {

    public static void main(String[] args) {
        String month = "March";
        switch(month) {
            case "January":
            case "February":
            case "March":
                System.out.println("This is Q1 cycle");
                break;
            case "April":
            case "May":
            case "June":
                System.out.println("This is Q2 cycle");
            default:
                System.out.println("This is Q3 or Q4 cycle");
        }
    }
}
