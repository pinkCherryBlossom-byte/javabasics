package practice.jan.a29;

import java.text.NumberFormat;
import java.util.Locale;

public class Test1 {

    static void main(String[] args) {
        double amount = 200_00.00;
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nf2 = NumberFormat.getCompactNumberInstance(Locale.US,
                NumberFormat.Style.SHORT);
        System.out.println(nf1.format(amount));
        System.out.println(nf2.format(amount));

    }
}
