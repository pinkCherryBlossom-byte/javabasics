package basic.java16.recordClass;

public record User2(String name,int age) {

    record NestedRecord() {
        public void display() {
            System.out.println("nested static record");
        }
    }

    static class NestedStaticClass {
        public void display() {
            System.out.println("nested static class");
        }
    }

    class NestedClass {
        public void display() {
            System.out.println("nested non static class");
        }
    }
}
