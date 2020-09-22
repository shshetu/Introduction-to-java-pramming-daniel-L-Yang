package chapter_20.Exercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex20_6 {
    public static void main(String[] args) {
//        List<Integer> integerList = new LinkedList<>();
        List<Integer> integerList = new ArrayList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 5_000_000; i++) {
            int randomNumber = (int) (Math.random() * 5_000_000);
            integerList.add(randomNumber);
        }

        long endTime = System.currentTimeMillis();
        long requiredTime = ((endTime - startTime)/1000);
        System.out.println("Time to insert : "+requiredTime/60);

        // Traverse through the list using iterator
      /*  Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }*/

        // Traverse using for loop
        for (int i = 0; i < 5_000_000; i++) {
            System.out.print(integerList.get(i)+" ");
        }
    }
}
