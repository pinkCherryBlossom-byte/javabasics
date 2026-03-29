package basic.reflection.secondExample;

import java.lang.reflect.Method;

public class Main {

    //viewing public methods
     static void main(String[] args) {
        Class<Eagle> eagleClass = Eagle.class;
        Method[] methods = eagleClass.getMethods();

        for(Method method:methods) {
            System.out.print("Method Name :"+method.getName()+"---");
            System.out.print("Return type : "+method.getReturnType()+"---");
            System.out.print("Class name: "+method.getDeclaringClass()+"---");
            System.out.println();
            System.out.println("********");
        }
    }
}
