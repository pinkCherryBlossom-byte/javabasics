package com.java.basic.reflection.fourthExample;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {

    //viewing public fields
    public static void main(String[] args) {
        Class<Eagle> eagleClass = Eagle.class;
        Field[] fields = eagleClass.getFields();

        for(Field field : fields) {
            System.out.println("FieldName: "+field.getName());
            System.out.println("ReturnType: "+field.getType());
            System.out.println("Modifier: "+ Modifier.toString(field.getModifiers()));
            System.out.println("*******");
        }
    }
}
