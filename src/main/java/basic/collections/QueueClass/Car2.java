package basic.collections.QueueClass;

public class Car2 implements Comparable<Car2>{

    String carName;
    String carType;

    public Car2(String carName,String carType) {
        this.carName = carName;
        this.carType = carType;
    }

    @Override
    public int compareTo(Car2 obj) {
        return this.carType.compareTo(obj.carType);
    }
}
