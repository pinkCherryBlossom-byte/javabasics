package basic.java16.recordClass;

public record User1(String name,int age) {

    record NestedAdressRecord() {
        public void display() {
            System.out.println("inside nested static record");
        }
    }
}
