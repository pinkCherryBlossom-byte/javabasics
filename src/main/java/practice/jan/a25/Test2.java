package practice.jan.a25;

import java.util.List;

public class Test2 {

     static void main(String[] args) {
        List<String> list1 = List.of("A","B");
        List<String> list2 = List.copyOf(list1);
        // we cannot do list1.add() and list2.add() as List.of() and List.copyOf()
         // methods are immutatble
        list1.add("C"); // causes exception
        list2.add("D"); // causes exception
        System.out.println(list1+" "+list2);
    }
}
