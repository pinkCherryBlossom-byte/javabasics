package basic.reflection.sixthExample;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class Main {

    //constructor Reflection

     static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Eagle> eagleClass = Eagle.class;

         Constructor[] constructors = eagleClass.getDeclaredConstructors();
         for(Constructor cons: constructors) {
             System.out.println("Modifier: "+ Modifier.toString(cons.getModifiers()));
             cons.setAccessible(true);
             Eagle eagleObj = (Eagle) cons.newInstance();
             eagleObj.fly();
         }
    }
}
