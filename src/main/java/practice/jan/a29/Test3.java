package practice.jan.a29;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Test3 {

    public static void main(String[] args) throws ParseException {
        double amount = 123456.789;
        Locale fr = new Locale("fr","FR");
        NumberFormat formatter = NumberFormat.getInstance();
        String s = formatter.format(amount);
        formatter = NumberFormat.getInstance();
        Number amount2 = formatter.parse(s);
        System.out.println(amount+" "+amount2);
        NumberFormat sf = NumberFormat.getCompactNumberInstance();
        NumberFormat lf = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
        String ssf = sf.format(amount);
        String llf = lf.format(amount);
        System.out.println(ssf+" - "+llf);
    }
}
