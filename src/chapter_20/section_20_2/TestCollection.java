package chapter_20.section_20_2;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        // create new collection and add values to the collection
        ArrayList<String> cityCollections1 = new ArrayList<>();
        cityCollections1.add("New York");
        cityCollections1.add("Atlanta");
        cityCollections1.add("Dallas");
        cityCollections1.add("Madison");

        // print the collection
        System.out.println("A list of cities in cityCollections1:");
        System.out.println(cityCollections1);// ["New York", "Atlanta"]

        // remove dallas and print the collection size
        cityCollections1.remove("Dallas");
        System.out.println("\n"+cityCollections1.size()+" cities are in cityCollections1 now");

        // Create 2nd collection and add some values to the collection
        Collection<String> cityCollections2 = new ArrayList<>();
        cityCollections2.add("Seattle");
        cityCollections2.add("Portland");
        cityCollections2.add("Los Angeles");
        cityCollections2.add("Atlanta");
        System.out.println("\nA list of cities in cityCollections2:");
        System.out.println(cityCollections2);

        // Adding both collections in one new collection(OR operation): addAll(collection)
        ArrayList<String> cityList = (ArrayList<String>) cityCollections1.clone();
        cityList.addAll(cityCollections2);
        System.out.println("\nCities in cityCollections1 or cityCollections2: ");
        System.out.println(cityList);

        // Containing intersected cities(AND operation): retainAll(collection)
        cityList = (ArrayList<String>) cityCollections1.clone();
        cityList.retainAll(cityCollections2);
        System.out.println("\nCities in cityCollections1 and cityCollections2: ");
        System.out.println(cityList);

        // Containing cities of collection1 only not collection2: removeAll(collection)
        cityList = (ArrayList<String>) cityCollections1.clone();
        cityList.removeAll(cityCollections2);
        System.out.println("\nCities in cityCollections1 and cityCollections2: ");
        System.out.println(cityList);

        // clearing the city List
        cityList.clear();
        System.out.println(cityList);
    }
}
