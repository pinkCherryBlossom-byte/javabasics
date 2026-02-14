package basic.java16.recordClass;

public class Main3 {

    public static void main(String[] args) {
        User2.NestedRecord obj1 = new User2.NestedRecord();
        obj1.display();

        User2.NestedStaticClass obj2 = new User2.NestedStaticClass();
        obj2.display();

        User2 usr = new User2("home",28);
        User2.NestedClass obj3 =  usr.new NestedClass();
        obj3.display();
    }
}

