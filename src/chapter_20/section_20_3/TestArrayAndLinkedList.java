package chapter_20.section_20_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestArrayAndLinkedList {
    public static void main(String[] args) {
        // create an array arrayList and add elements to that
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(0,10);
        arrayList.add(3,30);
        System.out.println("A arrayList of integers in the array arrayList: ");
        System.out.println(arrayList);

        // Create a linked arrayList by copying the array arrayList and traverse by hasPrevious() method
        LinkedList<Object> linkedList = new LinkedList<>(arrayList);
        linkedList.add(1,"red");
        linkedList.removeLast();
        linkedList.addFirst("green");

        // Traverse using List iterator
        ListIterator<Object> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next()+" ");
        }
        System.out.println();

        // Backward traversal
        System.out.println("Display Backward: ");
        listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+" ");
        }
    }
}
