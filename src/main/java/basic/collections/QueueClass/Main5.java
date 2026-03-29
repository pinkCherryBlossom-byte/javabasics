package basic.collections.QueueClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main5 {

    public static void main(String[] args) {
        List<Car> carArray = new ArrayList<>();
        carArray.add(new Car("SUV","petrol"));
        carArray.add(new Car("Sedan","diesel"));
        carArray.add(new Car("hatchback","cng"));

        Collections.sort(carArray,new CarComparator());

        carArray.forEach((Car c)-> System.out.println(c.carName+" "+c.carType));
    }
}
