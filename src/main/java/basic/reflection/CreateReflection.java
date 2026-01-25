package basic.reflection;

public class CreateReflection {

    //There are 3 ways to create object using Reflection
    public static void main(String[] args) throws ClassNotFoundException {
        // using forname method
        Class birdClass = Class.forName("Bird");

        // using .class
        Class birdclass2 = Bird.class;

        //using getClass() method
        Bird birdObj = new Bird();
        Class birdClass3 = birdObj.getClass();

    }





}


