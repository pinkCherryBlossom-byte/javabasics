package basic.collections.QueueClass;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1,Car o2) {
        return o2.carName.compareTo(o1.carName);
    }
}
