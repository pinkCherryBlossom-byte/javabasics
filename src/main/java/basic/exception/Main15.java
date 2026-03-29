package basic.exception;

public class Main15 {

    public static void main(String[] args) throws MyCustomException{
        try{
            method();
        }catch(MyCustomException e) {
            //custom Exception
            throw e;
        }
    }

    public static void method() throws MyCustomException {
        throw new MyCustomException("there is a issue");
    }
}
