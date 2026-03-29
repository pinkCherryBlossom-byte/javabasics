package basic.collections.dequeExample;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main4 {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(0,100);
        list1.add(1,200);
        list1.add(2,300);

        List<Integer> list2 = new ArrayList<>();
        list2.add(0,400);
        list2.add(1,500);
        list2.add(2,600);

        list1.addAll(2,list2);
        list1.forEach(System.out::println);

        list1.replaceAll((Integer i)->(-1*i));
        System.out.println("Replace All");
        list1.forEach(System.out::println);

        list1.sort((Integer a,Integer b)-> (a-b));
        System.out.println("Sorting All");
        list1.forEach(System.out::println);

        System.out.println("Get second element : "+list1.get(2));

        list1.set(2,-4000);
        list1.forEach(System.out::println);

        list1.remove(2);
        System.out.println("After removing : ");
        list1.forEach(System.out::println);

        System.out.println(list1.indexOf(-200));

        // Here we are passing the point from where it should start i.e. last from list that
        // is why list1.size()
        ListIterator<Integer> listIterator1 = list1.listIterator(list1.size());
        while(listIterator1.hasPrevious()) {
            int prev = listIterator1.previous();
            System.out.println(prev+" "+listIterator1.nextIndex()+" "+listIterator1.previousIndex());
            if(prev==-100) {
                listIterator1.set(-50);
            }
        }

        ListIterator<Integer> listIterator = list1.listIterator();
        while(listIterator.hasNext()) {
            int prev = listIterator.next();
            System.out.println(prev+" "+listIterator.nextIndex()+" "+listIterator.previousIndex());
            if(prev==-200) {
                listIterator.add(-100);
            }
        }

        list1.forEach((Integer val) -> System.out.println(val));

        List<Integer> subList = list1.subList(1,4);
        subList.forEach(System.out::println);

        subList.add(-500);
        list1.forEach(System.out::println);
    }
}
