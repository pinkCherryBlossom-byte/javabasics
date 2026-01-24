package com.java.basic.reflection.fifthExample;

import java.lang.reflect.Field;

public class Main2 {

    //now able to modify value of private field
     static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<Eagle> eagleClass = Eagle.class;
        Eagle eagleObj = new Eagle();
        Field field = eagleClass.getDeclaredField("canSwim");
        field.setAccessible(true);
        field.set(eagleObj,true);
        if(field.getBoolean(eagleObj)) {
            System.out.println("Value is set to true");
        }
    }
}
