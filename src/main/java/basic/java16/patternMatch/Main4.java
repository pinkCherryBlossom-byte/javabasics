package basic.java16.patternMatch;

public class Main4 {

    public static void main(String[] args) {
        Object obj = new TwoWheeler();

        if(obj instanceof Vehicle vehicleObj) {
            vehicleObj.drive();
        }
    }
}
