package chapter_20.Exercises;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Ex20_10 {
    public static void main(String[] args) {
        String[] nameList1 = {"George","Jim","John","Blake","Kevin","Michael"};
        String[] nameList2 = {"George","Katie","Kevin","Ryan","Michael"};

        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>(Arrays.asList(nameList1));
        PriorityQueue<String> priorityQueue2 = new PriorityQueue<>(Arrays.asList(nameList2));

        // Union
        priorityQueue1.addAll(priorityQueue2);
        System.out.println("Union: "+ priorityQueue1);
        priorityQueue1 = new PriorityQueue<>(Arrays.asList(nameList2));

        // Difference
        PriorityQueue<String> tempPQ = new PriorityQueue<>();

        // Intersection
        priorityQueue1.retainAll(priorityQueue2);
        System.out.println("Intersection: "+priorityQueue1);
    }
}
