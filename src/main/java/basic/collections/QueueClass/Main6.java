package basic.collections.QueueClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main6 {

    public static void main(String[] args) {
        List<Car2> cars = new ArrayList<>();
        cars.add(new Car2("SUV","petrol"));
        cars.add(new Car2("Sedan","diesel"));
        cars.add(new Car2("hatchback","cng"));

        Collections.sort(cars);

        cars.forEach((Car2 obj) -> System.out.println(obj.carName+" "+obj.carType));
    }

}
