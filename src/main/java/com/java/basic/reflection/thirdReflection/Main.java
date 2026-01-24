package com.java.basic.reflection.thirdReflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    //invoking methods
     static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class eagleClass = Class.forName("com.java.basic.reflection.thirdReflection.Eagle");
        Object eagleObject = eagleClass.newInstance();

        Method flyMethod = eagleClass.getMethod("fly",int.class,boolean.class,String.class);
        flyMethod.invoke(eagleObject,1,true,"hello");
    }
}
