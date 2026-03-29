package basic.reflection.firstExample;

import java.lang.reflect.Modifier;

public class Main {

    //looking at the name of the class and its modifier
    static void main(String[] args) {
        Class<Eagle> eagleClass = Eagle.class;

        System.out.println(eagleClass.getName());
        System.out.println(Modifier.toString(eagleClass.getModifiers()));
    }
}
