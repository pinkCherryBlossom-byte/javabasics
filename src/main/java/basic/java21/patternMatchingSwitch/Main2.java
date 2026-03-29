package basic.java21.patternMatchingSwitch;

public class Main2 {

    public static void main(String[] args) {
        TwoWheeler obj = new BiCycle();

        switch(obj) {
            case Bike bj :
                bj.drive();
                break;
            case BiCycle bjc:
                bjc.drive();
                break;
            case TwoWheeler tw:
                tw.drive();
                break;
        }
    }
}
