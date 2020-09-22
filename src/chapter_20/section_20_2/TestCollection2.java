package chapter_20.section_20_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class TestCollection2 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        // add to the collection
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        // todo: print using foreach loop without iterator
        System.out.println("Print using for Each: ");
        for (String collection1: collection) {
            System.out.print(collection1.toUpperCase() + " ");
        }
        System.out.println();

        // todo: print using functional programming
        System.out.println("Print using Stream: ");
        collection.stream().forEach(s -> System.out.print(s+" "));
        System.out.println("Print using for Each: ");
        collection.forEach(System.out::println);
        // check if there is element in collection
//        Iterator<String> iterator = collection.iterator();
        Iterator<String> iterator = collection.iterator();


        // if there is element then print them by upper casing
        while (iterator.hasNext()){
            System.out.print(iterator.next().toUpperCase()+" ");
        }
        System.out.println();

        String helloStr = hello(); // hello
        System.out.println(helloStr);

    }



    public static String hello(){
        return "Hello";
    }
}
