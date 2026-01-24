package com.java.basic.reflection.fourthExample;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main2 {

    //viewing both public and private fields
     static void main(String[] args) {
        Class<Eagle> eagleClass = Eagle.class;
        Field[] fields = eagleClass.getDeclaredFields();
        for(Field field:fields) {
            System.out.println("FieldName: "+field.getName());
            System.out.println("ReturnType: "+field.getType());
            System.out.println("Modifiers: "+ Modifier.toString(field.getModifiers()));
            System.out.println("**********");
        }
    }
}
