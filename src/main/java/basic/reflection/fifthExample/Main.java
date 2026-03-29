package basic.reflection.fifthExample;

import java.lang.reflect.Field;

public class Main {

    //trying to access private field
     static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<Eagle> eagleClass = Eagle.class;
        Eagle obj = new Eagle();
        Field field = eagleClass.getDeclaredField("breed");
        field.set(obj,"brownBreed");
        System.out.println(obj.breed);

        // This gives error as canSwim field is private
         Field field2 = eagleClass.getDeclaredField("canSwim");
         field2.set(obj,false);
    }
}
