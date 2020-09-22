package chapter_20.section_20_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        // create a city collection
        Collection<String> cityCollection = new ArrayList<>();
        cityCollection.add("New York");
        cityCollection.add("Atlanta");
        cityCollection.add("Dallas");
        cityCollection.add("Madison");

        // create an object of Iterator interface

        // each collection has iterator method
        Iterator<String> iterator = cityCollection.iterator(); // New York, Atlanta, Dallas, Madison
        // traverse through the city collection using the object
        System.out.println("Printing the list using iterator:");
        while (iterator.hasNext()){
            // iterator.next() will print the next item on the collection
            System.out.print(iterator.next().toUpperCase()+" ");
        }
        System.out.println();

        System.out.println("Printing the list using enhanced for loop:");
        for (String city:cityCollection) {
            System.out.print(city.toUpperCase()+" ");
        }
    }
}
