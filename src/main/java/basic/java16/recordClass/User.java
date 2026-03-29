package basic.java16.recordClass;

public record User(String name,Integer age) implements Comparable<User> {

    //internally you cannot assign any instance variables
    //but you can assign static fields

    @Override
    public int compareTo(User other) {
        return this.age()-other.age();
    }

    //we can override constructor
    public User(String name,Integer age) {
        if(age<0) throw new IllegalArgumentException();
        this.age=age;
        this.name=name;
    }


}
