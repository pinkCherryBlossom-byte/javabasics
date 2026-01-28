package basic.annotations.Example1;

//can also declare suppressWarnings at class level
@SuppressWarnings("deprecation")
public class Main2 {

    static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.dummyMethod();
    }
}
