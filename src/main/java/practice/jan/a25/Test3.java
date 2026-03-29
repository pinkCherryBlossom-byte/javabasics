package practice.jan.a25;

import java.util.function.Function;

public class Test3 {

    public static double process(double payment,int rate) {
        double defaultRate = 0.10;
        //if(rate>10) defaultRate = rate;
        //if we are calling a variable to inner class, then we have to make sure it is final
        // we should not change its value
        class Implement {
            public int apply(double data) {
                Function<Integer,Integer> f = x -> x+(int) (x*defaultRate);
                return f.apply((int)data);
            }
        }
        Implement i = new Implement();
        return i.apply(payment);
    }

    static void main(String[] args) {
        System.out.println(process(2.2,2));
    }
}
